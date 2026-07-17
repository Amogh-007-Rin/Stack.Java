interface Message {
    void send();
}

public class AnonymousLocalVariableDemo {
    public static void main(String[] args) {
        String recipient = "Alice";
        String text = "Hello!";

        Message msg = new Message() {
            @Override
            public void send() {
                System.out.println("To: " + recipient + ", Message: " + text);
            }
        };

        msg.send();

        int times = 3;
        Message repeater = new Message() {
            @Override
            public void send() {
                for (int i = 0; i < times; i++) {
                    System.out.println("Message " + (i + 1));
                }
            }
        };
        repeater.send();
    }
}
