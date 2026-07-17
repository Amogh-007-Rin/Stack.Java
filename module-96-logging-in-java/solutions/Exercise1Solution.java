import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Exercise1Solution {

    private static final Logger LOG = Logger.getLogger(Exercise1Solution.class.getName());

    public static void main(String[] args) throws IOException {
        LOG.setLevel(Level.ALL);
        LOG.setUseParentHandlers(false);

        FileHandler fileHandler = new FileHandler("app.log", true);
        fileHandler.setLevel(Level.ALL);
        fileHandler.setFormatter(new SimpleFormatter());
        LOG.addHandler(fileHandler);

        for (int i = 1; i <= 10; i++) {
            LOG.log(Level.INFO, "Log entry number {0}", i);
        }

        LOG.log(Level.WARNING, "FileHandler demo complete — check app.log");
    }
}
