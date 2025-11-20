package phonebook.main;

import phonebook.model.PhoneBook;
import phonebook.model.AlreadyPresentException;
import phonebook.model.NotPresentException;

/**
 * @author 24168333
 *
 */ 
public interface Command {
    void execute(PhoneBook phoneBook) throws AlreadyPresentException, NotPresentException;
}
