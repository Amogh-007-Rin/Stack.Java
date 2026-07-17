// This example demonstrates Spring concepts but requires Maven/Gradle
// and Spring Boot dependencies to compile and run.

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface Exercise02CustomerRepository extends JpaRepository<Exercise01CustomerEntity, Long> {

    Optional<Exercise01CustomerEntity> findByEmail(String email);

    List<Exercise01CustomerEntity> findByNameContaining(String keyword);

    long countBySignupDateAfter(LocalDate date);
}
