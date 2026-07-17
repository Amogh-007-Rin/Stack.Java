import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private final StringProperty firstName = new SimpleStringProperty();
    private final StringProperty lastName = new SimpleStringProperty();
    private final IntegerProperty age = new SimpleIntegerProperty();

    public Person(String firstName, String lastName, int age) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
        this.age.set(age);
    }

    public StringProperty firstNameProperty() { return firstName; }
    public StringProperty lastNameProperty() { return lastName; }
    public IntegerProperty ageProperty() { return age; }

    public String getFirstName() { return firstName.get(); }
    public String getLastName() { return lastName.get(); }
    public int getAge() { return age.get(); }
}
