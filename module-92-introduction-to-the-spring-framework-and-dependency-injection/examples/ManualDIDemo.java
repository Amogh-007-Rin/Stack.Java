// Plain Java demonstration of Dependency Injection without Spring

interface MessageService {
    String getMessage();
}

class EmailService implements MessageService {
    public String getMessage() {
        return "Email sent successfully";
    }
}

class SmsService implements MessageService {
    public String getMessage() {
        return "SMS sent successfully";
    }
}

class NotificationClient {
    private final MessageService service;

    // Constructor injection — the dependency is passed in from outside
    public NotificationClient(MessageService service) {
        this.service = service;
    }

    void notifyUser() {
        System.out.println(service.getMessage());
    }
}

public class ManualDIDemo {
    public static void main(String[] args) {
        // Wiring happens here — the "container" is the main method
        MessageService email = new EmailService();
        NotificationClient client = new NotificationClient(email);
        client.notifyUser();

        // Swap implementation without changing NotificationClient
        MessageService sms = new SmsService();
        NotificationClient client2 = new NotificationClient(sms);
        client2.notifyUser();
    }
}
