class EmailSenderViolation {

    public void sendEmail(String message, String recipient) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}

class NotificationServiceViolation {

    private final EmailSenderViolation emailSender = new EmailSenderViolation();

    public void notify(String message, String recipient) {
        emailSender.sendEmail(message, recipient);
    }
}

interface MessageSender {
    void send(String message, String recipient);
}

class EmailSender implements MessageSender {

    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}

class SmsSender implements MessageSender {

    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}

class PushSender implements MessageSender {

    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending push notification to " + recipient + ": " + message);
    }
}

class NotificationService {

    private final MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void notify(String message, String recipient) {
        messageSender.send(message, recipient);
    }
}

public class DipExample {

    public static void main(String[] args) {
        NotificationService emailService = new NotificationService(new EmailSender());
        emailService.notify("Hello via email!", "alice@example.com");

        NotificationService smsService = new NotificationService(new SmsSender());
        smsService.notify("Hello via SMS!", "+1234567890");

        NotificationService pushService = new NotificationService(new PushSender());
        pushService.notify("Hello via push!", "user123");
    }
}
