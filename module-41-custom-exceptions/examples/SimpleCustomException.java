public class SimpleCustomException {
    public static void main(String[] args) {
        System.out.println("=== Simple Custom Exception ===");
        try {
            validateScore(-5);
        } catch (InvalidScoreException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            checkAge(150);
        } catch (InvalidAgeException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }

    static void validateScore(int score) throws InvalidScoreException {
        if (score < 0) {
            throw new InvalidScoreException("Score cannot be negative: " + score);
        }
    }

    static void checkAge(int age) {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
    }
}

class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}

class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}
