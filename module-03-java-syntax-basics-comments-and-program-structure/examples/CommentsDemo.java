/**
 * CommentsDemo demonstrates all three types of Java comments.
 * This Javadoc comment will appear in generated documentation.
 */
public class CommentsDemo {

    /**
     * The main method is the entry point of the program.
     *
     * @param args command-line arguments passed to the program
     */
    public static void main(String[] args) {
        // This is a single-line comment.
        System.out.println("Single-line comments start with //");

        /*
           This is a multi-line comment.
           It can span several lines.
           Everything between the delimiters is ignored by the compiler.
        */
        System.out.println("Multi-line comments use /* ... */");

        /** This Javadoc comment on a single line is also valid. */
        System.out.println("Javadoc comments use /** ... */");
    }
}
