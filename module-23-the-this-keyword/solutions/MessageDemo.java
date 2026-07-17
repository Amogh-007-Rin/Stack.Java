public class MessageDemo {
    public static void main(String[] args) {
        MessageBuilder mb = new MessageBuilder();
        mb.append("world")
          .prepend("Hello, ")
          .append("!")
          .toUpperCase()
          .display();

        MessageBuilder mb2 = new MessageBuilder();
        mb2.append("java").prepend("I love ").append("!").display();
    }
}
