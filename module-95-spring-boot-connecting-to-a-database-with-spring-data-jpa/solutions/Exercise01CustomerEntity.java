import java.time.LocalDate;

// Standalone POJO demonstrating JPA entity concepts.
// Annotations shown as comments — in a real project these would be
// processed by Hibernate at runtime.

public class Exercise01CustomerEntity {

    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column(nullable = false)
    private String name;

    // @Column(unique = true)
    private String email;

    private LocalDate signupDate;

    // No-arg constructor required by JPA
    public Exercise01CustomerEntity() {
    }

    public Exercise01CustomerEntity(String name, String email) {
        this.name = name;
        this.email = email;
        this.signupDate = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getSignupDate() {
        return signupDate;
    }

    public void setSignupDate(LocalDate signupDate) {
        this.signupDate = signupDate;
    }

    @Override
    public String toString() {
        return "Customer{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }

    public static void main(String[] args) {
        Exercise01CustomerEntity c1 = new Exercise01CustomerEntity("Alice", "alice@example.com");
        Exercise01CustomerEntity c2 = new Exercise01CustomerEntity("Bob", "bob@example.com");
        System.out.println(c1);
        System.out.println(c2);
    }
}
