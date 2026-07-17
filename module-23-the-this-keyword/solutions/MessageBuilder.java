class MessageBuilder {
    String message = "";

    MessageBuilder append(String text) {
        this.message += text;
        return this;
    }

    MessageBuilder prepend(String text) {
        this.message = text + this.message;
        return this;
    }

    MessageBuilder toUpperCase() {
        this.message = this.message.toUpperCase();
        return this;
    }

    void display() {
        System.out.println("Message: " + this.message);
    }
}
