package phonebook.main;

import phonebook.model.PhoneBook;
import phonebook.model.AlreadyPresentException;
import phonebook.model.NotPresentException;

public class HelpCommand implements Command {
    public HelpCommand(String[] parts) throws InvalidCommandException {
        if (parts.length != 1) {
            throw new InvalidCommandException("Usage: help");
        }
    }

    @Override
    public void execute(PhoneBook phoneBook) {
        System.out.println("Available commands:");
        System.out.println("add [name] [phone]");
        System.out.println("show [name]");
        System.out.println("update [name] [phone]");
        System.out.println("remove [name]");
        System.out.println("list");
        System.out.println("help");
    }
}