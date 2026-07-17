public class Lab_01_Part_1 {

    // ===================== Section 1: ZodiacApp =====================


    static void zodiacApp() {
        String name = "Amogh Dath Kalasapura Arunkumar"; 
        String starSign = "Libra";
        String studentID = "24168333";   

        System.out.println("=== Zodiac App ===");
        System.out.println("Name: " + name);
        System.out.println("StudentID " + studentID);
        System.out.println("Star Sign: " + starSign);
        System.out.println();
    }

    // ===================== Section 2: Evaluate Expressions =====================
    static void evaluateExpressions() {
        System.out.println("=== Evaluating Java Expressions ===");

        // 1. Arithmetic operations
        System.out.println("1 + 1 = " + (1 + 1));
        System.out.println("5 - 2 * 3 = " + (5 - 2 * 3));
        System.out.println("(5 - 2) * 3 = " + ((5 - 2) * 3));
        System.out.println("4.5 + 6.7 = " + (4.5 + 6.7));
        System.out.println("3 - 2.1 = " + (3 - 2.1));
        System.out.println("6 / 2 = " + (6 / 2));
        System.out.println("7 / 2 = " + (7 / 2));
        System.out.println("7.0 / 2.0 = " + (7.0 / 2.0));
        System.out.println("8 % 2 = " + (8 % 2));
        System.out.println("9 % 2 = " + (9 % 2));

        // 2. Comparison operations
        System.out.println("1 + 1 == 2 → " + (1 + 1 == 2));
        System.out.println("1 + 1 != 3 → " + (1 + 1 != 3));
        System.out.println("1 < 3 → " + (1 < 3));
        System.out.println("1 > 3 → " + (1 > 3));
        System.out.println("3 <= 3 → " + (3 <= 3));
        System.out.println("3 >= 1 → " + (3 >= 1));

        // 3. Logical operations
        System.out.println("true && false → " + (true && false));
        System.out.println("true || false → " + (true || false));
        System.out.println("!false → " + (!false));

        // 4. String operations
        System.out.println("\"Hello, \" + \"world!\" = " + ("Hello, " + "world!"));
        System.out.println("\"Catch \" + 22 = " + ("Catch " + 22));
        System.out.println("\"A piece of string\".length() = " + ("A piece of string".length()));
        System.out.println("\"ABCDEFG\".charAt(3) = " + ("ABCDEFG".charAt(3)));
        System.out.println("\"MMXVIII\".toLowerCase() = " + ("MMXVIII".toLowerCase()));
        System.out.println("\"Yellow Submarine\".startsWith(\"Yellow\") = " + ("Yellow Submarine".startsWith("Yellow")));

        // 5. Type conversions
        System.out.println("(double) 5 = " + ((double) 5));
        System.out.println("(int) 5.3 = " + ((int) 5.3));
        System.out.println("(int) 'a' = " + ((int) 'a'));
        System.out.println("(char) 120 = " + ((char) 120));
        System.out.println("String.valueOf(1234) = " + (String.valueOf(1234)));
        System.out.println("Integer.parseInt(\"5678\") = " + (Integer.parseInt("5678")));
        System.out.println("Double.parseDouble(\"3.14159\") = " + (Double.parseDouble("3.14159")));

        // Types (expected outputs)
        System.out.println("1 + 1.5 → " + (1 + 1.5)); 
        System.out.println("\"a\" + \"b\" → " + ("a" + "b"));
        System.out.println("\"1\" + 1.5 → " + ("1" + 1.5));
        System.out.println("'a' + 'b' → " + ('a' + 'b'));  // adds ASCII values
        System.out.println("'a' + 1 → " + ('a' + 1));
        System.out.println("false || !false → " + (false || !false));
        System.out.println("\"Hello\".length() → " + ("Hello".length()));

        System.out.println();
    }

    // ===================== Section 3: Variables =====================


    static void variablesDemo() {
        System.out.println("=== Variables Demo ===");

        int x; 
        x = 5;
        int y = 8;
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x + y = " + (x + y));

        x = 11;
        x += 23;
        System.out.println("Updated x = " + x);

        double pi = 3.14159;
        char letter = 's';
        String name = "Ada Lovelace";

        System.out.println("pi = " + pi);
        System.out.println("letter = " + letter);
        System.out.println("name = " + name);

        System.out.println();
    }

    // ===================== Section 4: Declaring new variables =====================


    static void newVariables() {
        System.out.println("=== Declaring New Variables ===");

        int age = 19;
        char grade = 'A';
        double gigaWatts = 1.21;
        boolean isBlue = true;
        String phoneNumber = "555-1234";

        System.out.println("age = " + age);
        System.out.println("grade = " + grade);
        System.out.println("gigaWatts = " + gigaWatts);
        System.out.println("isBlue = " + isBlue);
        System.out.println("phoneNumber = " + phoneNumber);

        System.out.println();
    }

    // ===================== MAIN FUNCTION TO CALL ALL THE SOURCE FUNCTIONS =====================


    public static void main(String[] args) {
        zodiacApp();
        evaluateExpressions();
        variablesDemo();
        newVariables();
    }
}

