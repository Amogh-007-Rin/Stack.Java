import org.junit.Test;
import static org.junit.Assert.*;

public class QueryStringTest {

    @Test
    public void testGetParameterBasic() {
        // Input: Query string with basic name-value pairs
        QueryString qs = new QueryString("name=John&age=25");
        
        // Action: Retrieve parameter values
        String nameValue = qs.getParameter("name");
        String ageValue = qs.getParameter("age");
        
        // Expected: Parameters should match input values
        assertEquals("John", nameValue);
        assertEquals("25", ageValue);
    }

    @Test
    public void testGetParameterNotFound() {
        // Input: Query string without email parameter
        QueryString qs = new QueryString("name=John&age=25");
        
        // Action: Try to retrieve non-existent parameter
        String result = qs.getParameter("email");
        
        // Expected: Should return null for non-existent parameter
        assertNull(result);
    }

    @Test
    public void testGetParameterWithSpecialChars() {
        // Input: Query string with URL-encoded special characters
        QueryString qs = new QueryString("message=Hello+World&url=https%3A%2F%2Fexample.com");
        
        // Action: Retrieve and decode parameters
        String messageValue = qs.getParameter("message");
        String urlValue = qs.getParameter("url");
        
        // Expected: Values should be properly decoded
        assertEquals("Hello World", messageValue);
        assertEquals("https://example.com", urlValue);
    }

    @Test
    public void testHasParameter() {
        // Input: Query string with multiple parameters including empty value
        QueryString qs = new QueryString("name=John&age=25&empty=");
        
        // Action & Expected: Check existence of various parameters
        assertTrue(qs.hasParameter("name"));    // Should exist
        assertTrue(qs.hasParameter("age"));     // Should exist
        assertTrue(qs.hasParameter("empty"));   // Empty but should exist
        assertFalse(qs.hasParameter("email")); // Should not exist
    }

    @Test
    public void testGetParameterOffset() {
        // Input: Query string with multiple parameters
        QueryString qs = new QueryString("name=John&age=25&last=Doe");
        
        // Action & Expected: Check correct offset positions
        assertEquals(0, qs.getParameterOffset("name"));  // First parameter
        assertEquals(10, qs.getParameterOffset("age"));  // Middle parameter
        assertEquals(17, qs.getParameterOffset("last")); // Last parameter
        assertEquals(-1, qs.getParameterOffset("email")); // Non-existent
    }

    @Test
    public void testDecode() {
        // Input & Action & Expected: Test various encoding scenarios
        
        // Basic space encoding
        assertEquals("Hello World", QueryString.decode("Hello+World"));
        
        // Percent encoding
        assertEquals("100% happy", QueryString.decode("100%25+happy"));
        
        // Special characters
        assertEquals("@#$", QueryString.decode("%40%23%24"));
        
        // Multiple spaces
        assertEquals("  ", QueryString.decode("++")); 
    }

    @Test
    public void testEmptyValues() {
        // Input: Query string with empty parameter value
        QueryString qs = new QueryString("empty=&next=value");
        
        // Action & Expected: Check empty and normal values
        assertEquals("", qs.getParameter("empty"));      // Empty value
        assertEquals("value", qs.getParameter("next"));  // Normal value
    }

    @Test
    public void testLastParameter() {
        // Input: Query string with no trailing ampersand
        QueryString qs = new QueryString("first=1&last=end");
        
        // Action: Get last parameter
        String lastValue = qs.getParameter("last");
        
        // Expected: Should correctly retrieve final parameter
        assertEquals("end", lastValue);
    }

    @Test
    public void testSingleParameter() {
        // Input: Query string with single parameter
        QueryString qs = new QueryString("single=value");
        
        // Action: Get the only parameter
        String value = qs.getParameter("single");
        
        // Expected: Should retrieve single parameter correctly
        assertEquals("value", value);
    }

    @Test
    public void testComplexDecoding() {
        // Input: Query string with complex encoded characters
        QueryString qs = new QueryString("complex=%40%23+%25%26");
        
        // Action: Retrieve and decode complex parameter
        String decoded = qs.getParameter("complex");
        
        // Expected: Should decode all special characters correctly
        assertEquals("@# %&", decoded);
    }
}