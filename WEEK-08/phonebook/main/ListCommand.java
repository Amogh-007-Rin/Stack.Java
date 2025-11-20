package phonebook.main;

import phonebook.model.PhoneBook;
import phonebook.model.PhoneBookEntry;
import phonebook.model.AlreadyPresentException;
import phonebook.model.NotPresentException;

import java.util.List;

public class ListCommand implements Command {
    public ListCommand(String[] parts) throws InvalidCommandException {
        if (parts.length != 1) {
            throw new InvalidCommandException("Usage: list");
        }
    }

    @Override
    public void execute(PhoneBook phoneBook) {
        List<PhoneBookEntry> entries = phoneBook.getEntries();
        for (PhoneBookEntry entry : entries) {
            System.out.println(entry);
        }
    }
}