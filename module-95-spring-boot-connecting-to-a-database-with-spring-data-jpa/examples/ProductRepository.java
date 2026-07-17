// This example demonstrates Spring concepts but requires Maven/Gradle
// and Spring Boot dependencies to compile and run.

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    // Derived query — Spring Data JPA parses the method name
    List<ProductEntity> findByNameContainingIgnoreCase(String keyword);

    List<ProductEntity> findByPriceBetween(double min, double max);

    List<ProductEntity> findByStockLessThan(int threshold);

    // Custom JPQL query
    @Query("SELECT p FROM ProductEntity p WHERE p.price > :minPrice ORDER BY p.price DESC")
    List<ProductEntity> findExpensiveProducts(double minPrice);

    // Custom native SQL query
    @Query(value = "SELECT * FROM product_entity WHERE stock = 0", nativeQuery = true)
    List<ProductEntity> findOutOfStockProducts();
}
