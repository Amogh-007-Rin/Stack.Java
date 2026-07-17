import java.util.ArrayList;
import java.util.List;

interface MessageListener {
    void onMessage(String sender, String message);
}

class ChatRoom {

    private final List<MessageListener> participants = new ArrayList<>();

    public void join(MessageListener participant) {
        participants.add(participant);
    }

    public void leave(MessageListener participant) {
        participants.remove(participant);
    }

    public void broadcast(String sender, String message, MessageListener excludeSender) {
        for (MessageListener p : participants) {
            if (p != excludeSender) {
                p.onMessage(sender, message);
            }
        }
    }
}

class User implements MessageListener {

    private final String name;
    private final ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
        chatRoom.join(this);
    }

    public void send(String message) {
        System.out.println(name + " sends: " + message);
        chatRoom.broadcast(name, message, this);
    }

    @Override
    public void onMessage(String sender, String message) {
        System.out.println(name + " received from " + sender + ": " + message);
    }

    public void leave() {
        chatRoom.leave(this);
    }
}

public class ChatRoomDemo {

    public static void main(String[] args) {
        ChatRoom room = new ChatRoom();

        User alice = new User("Alice", room);
        User bob = new User("Bob", room);
        User charlie = new User("Charlie", room);

        alice.send("Hello everyone!");
        bob.send("Hi Alice!");
        charlie.send("Hey folks!");

        charlie.leave();
        alice.send("Where did Charlie go?");
    }
}
