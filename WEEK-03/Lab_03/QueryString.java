/*
 * Represents a query string, such as "foo=bar&baz=1234".
 * See https://en.wikipedia.org/wiki/Query_string
 */

public class QueryString {
    String data;

    public QueryString(String data) {
        this.data = data;
    }

    /*
     * Returns the value associated with a parameter in the query string,
     * or null if the parameter does not exist.
     */
    String getParameter(String name) {
        // stub method
        return null;
    }

    /*
     * Determines whether a parameter exists in the query string.
     */
    boolean hasParameter(String name) {
        // stub method
        return false;
    }

    /*
     * Returns the character offset of the start of a parameter's name.
     * If the parameter does not exist, -1 is returned.
     */
    int getParameterOffset(String name) {
        // stub method
        return 0;
    }

    /*
     * Decodes a URL-encoded string.
     * See https://en.wikipedia.org/wiki/Percent-encoding
     */
    static String decode(String s) {
        // stub method
        return null;
    }
}
