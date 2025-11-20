package phonebook.test;

import org.junit.Test;
import static org.junit.Assert.*;
import phonebook.main.*;
import phonebook.model.*;

public class NewAddedTest {
    
    @Test
    public void testParseAddCommand() throws Exception {
        Command cmd = Main.parse("add Alice 12345");
        assertTrue(cmd instanceof AddCommand);
        AddCommand addCmd = (AddCommand) cmd;
        assertEquals("Alice", addCmd.getName());
        assertEquals("12345", addCmd.getPhoneNumber());
    }

    @Test
    public void testParseShowCommand() throws Exception {
        Command cmd = Main.parse("show Bob");
        assertTrue(cmd instanceof ShowCommand);
        ShowCommand showCmd = (ShowCommand) cmd;
        assertEquals("Bob", showCmd.getName());
    }

    @Test
    public void testParseUpdateCommand() throws Exception {
        Command cmd = Main.parse("update Carol 67890");
        assertTrue(cmd instanceof UpdateCommand);
        UpdateCommand updateCmd = (UpdateCommand) cmd;
        assertEquals("Carol", updateCmd.getName());
        assertEquals("67890", updateCmd.getNewPhoneNumber());
    }

    @Test
    public void testParseRemoveCommand() throws Exception {
        Command cmd = Main.parse("remove Dave");
        assertTrue(cmd instanceof RemoveCommand);
        RemoveCommand removeCmd = (RemoveCommand) cmd;
        assertEquals("Dave", removeCmd.getName());
    }

    @Test
    public void testParseListCommand() throws Exception {
        Command cmd = Main.parse("list");
        assertTrue(cmd instanceof ListCommand);
    }

    @Test
    public void testParseHelpCommand() throws Exception {
        Command cmd = Main.parse("help");
        assertTrue(cmd instanceof HelpCommand);
    }
}
