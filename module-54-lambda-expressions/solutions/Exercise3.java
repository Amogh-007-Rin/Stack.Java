import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Command {
    void execute();
}

class CommandRunner {
    private final List<Command> commands = new ArrayList<>();

    public void addCommand(Command cmd) {
        commands.add(cmd);
    }

    public void runAll() {
        for (int i = 0; i < commands.size(); i++) {
            System.out.print("[" + (i + 1) + "] ");
            commands.get(i).execute();
        }
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        CommandRunner runner = new CommandRunner();

        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Lambda";

        runner.addCommand(() -> System.out.println(msg1));
        runner.addCommand(() -> System.out.println(msg2));
        runner.addCommand(() -> System.out.println(msg3));

        runner.runAll();
    }
}
