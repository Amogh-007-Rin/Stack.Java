/*
 * This is a CONCEPTUAL demo of SLF4J.
 *
 * To run it you would need slf4j-api.jar and a binding (e.g. logback-classic.jar)
 * on the classpath. This file illustrates the API usage but is compile-only
 * without those dependencies.
 *
 * In production the pattern is:
 *   Logger logger = LoggerFactory.getLogger(MyClass.class);
 *   logger.info("Hello {} from SLF4J", name);
 *
 * SLF4J acts as a facade: your code calls LoggerFactory.getLogger(),
 * and at runtime the binding redirects to Logback, Log4j, or JUL.
 */

public class SLF4JConceptDemo {
    public static void main(String[] args) {
        System.out.println("SLF4J is a logging facade (abstraction).");
        System.out.println("Your code calls org.slf4j.LoggerFactory.getLogger().");
        System.out.println("A binding jar on the classpath (e.g. logback-classic)");
        System.out.println("connects the facade to the real implementation.");
        System.out.println();
        System.out.println("This demo compiles without SLF4J to show only the concept.");
        System.out.println("See the comments for the actual SLF4J pattern.");

        // Actual SLF4J usage (requires slf4j-api.jar):
        //
        // import org.slf4j.Logger;
        // import org.slf4j.LoggerFactory;
        //
        // public class MyService {
        //     private static final Logger log =
        //         LoggerFactory.getLogger(MyService.class);
        //
        //     public void process(String name) {
        //         log.info("Processing request from {}", name);
        //     }
        // }
    }
}
