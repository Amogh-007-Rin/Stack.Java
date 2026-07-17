enum HttpStatus {
    OK(200, "OK"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

public class Exercise2Solution {
    public static void main(String[] args) {
        for (HttpStatus status : HttpStatus.values()) {
            System.out.println(status.getCode() + " " + status.getMessage());
        }
    }
}
