package Lab_03;
// NAME : AMOGH DATH KALASAPURA
// STUDENT ID : 24168333

// Manual testing for quary string

public class QueryStringMain {
    
    public static void main(String args[]) {
        System.out.println("=== QUERY STRING MANUAL TESTING ===");
        
        // Test Case 1: Basic Parameters
        System.out.println("TEST CASE 1: Basic Parameters");
        System.out.println("-----------------------------");
        QueryString data1 = new QueryString("name=Ironman&age=20&country=UK");
        System.out.println("Query String: name=Ironman&age=20&country=UK");
        System.out.println("name parameter: " + data1.getParameter("name"));
        System.out.println("age parameter: " + data1.getParameter("age"));
        System.out.println("country parameter: " + data1.getParameter("country"));
        System.out.println();
        
        // Test Case 2: Special Characters
        System.out.println("TEST CASE 2: Special Characters");
        System.out.println("-----------------------------");
        QueryString data2 = new QueryString("message=Hello+World&url=https%3A%2F%2Fexample.com");
        System.out.println("Query String: message=Hello+World&url=https%3A%2F%2Fexample.com");
        System.out.println("decoded message: " + data2.getParameter("message"));
        System.out.println("decoded url: " + data2.getParameter("url"));
        System.out.println();
        
        // Test Case 3: Parameter Existence
        System.out.println("TEST CASE 3: Parameter Existence");
        System.out.println("-----------------------------");
        System.out.println("Has 'name' parameter?: " + data1.hasParameter("name"));
        System.out.println("Has 'email' parameter?: " + data1.hasParameter("email"));
        System.out.println();
        
        // Test Case 4: Parameter Offsets
        System.out.println("TEST CASE 4: Parameter Offsets");
        System.out.println("-----------------------------");
        System.out.println("Offset of 'name': " + data1.getParameterOffset("name"));
        System.out.println("Offset of 'age': " + data1.getParameterOffset("age"));
        System.out.println("Offset of 'country': " + data1.getParameterOffset("country"));
        System.out.println();
        
        // Test Case 5: Empty Values
        System.out.println("TEST CASE 5: Empty Values");
        System.out.println("-----------------------------");
        QueryString data3 = new QueryString("empty=&next=value");
        System.out.println("Query String: empty=&next=value");
        System.out.println("empty parameter: '" + data3.getParameter("empty") + "'");
        System.out.println("next parameter: " + data3.getParameter("next"));
        System.out.println();
        
        System.out.println("=== END OF TESTING ===");
    }
}
