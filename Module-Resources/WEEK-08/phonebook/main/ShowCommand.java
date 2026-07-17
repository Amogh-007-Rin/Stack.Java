package phonebook.main;

import phonebook.model.PhoneBook;
import phonebook.model.NotPresentException;
import phonebook.model.AlreadyPresentException;
import phonebook.model.PhoneBookEntry;

public class ShowCommand implements Command {
    private final String name;

    public ShowCommand(String[] parts) throws InvalidCommandException {
        if (parts.length != 2) {
            throw new InvalidCommandException("Usage: show [name]");
        }
        this.name = parts[1];
    }
     public String getName() {
        return name;
    }

    @Override
    public void execute(PhoneBook phoneBook) throws NotPresentException {
        PhoneBookEntry entry = phoneBook.getEntry(name);
        System.out.println(entry);
    }
}

