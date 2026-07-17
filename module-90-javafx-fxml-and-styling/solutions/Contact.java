import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Contact {
    private final StringProperty name = new SimpleStringProperty();
    private final StringProperty phone = new SimpleStringProperty();
    private final StringProperty email = new SimpleStringProperty();

    public Contact(String name, String phone, String email) {
        this.name.set(name);
        this.phone.set(phone);
        this.email.set(email);
    }

    public StringProperty nameProperty() { return name; }
    public StringProperty phoneProperty() { return phone; }
    public StringProperty emailProperty() { return email; }

    public String getName() { return name.get(); }
    public String getPhone() { return phone.get(); }
    public String getEmail() { return email.get(); }
}
