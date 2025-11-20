package phonebook.main;

import phonebook.model.PhoneBook;
import phonebook.model.NotPresentException;
import phonebook.model.AlreadyPresentException;

public class UpdateCommand implements Command {
    private final String name;
    private final String newPhoneNumber;

    public UpdateCommand(String[] parts) throws InvalidCommandException {
        if (parts.length != 3) {
            throw new InvalidCommandException("Usage: update [name] [phone]");
        }
        this.name = parts[1];
        this.newPhoneNumber = parts[2];
    }

    @Override
    public void execute(PhoneBook phoneBook) throws NotPresentException {
        phoneBook.updateEntry(name, newPhoneNumber);
        System.out.println("Entry updated.");
    }

    public String getName(){
        return name;
    }

    public String getNewPhoneNumber() {
        return newPhoneNumber;
    }
}