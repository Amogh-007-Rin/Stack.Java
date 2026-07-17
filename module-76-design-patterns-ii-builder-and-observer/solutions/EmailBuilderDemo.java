import java.util.ArrayList;
import java.util.List;

public class EmailBuilderDemo {

    public static class Email {

        private final String from;
        private final String to;
        private final String subject;
        private final String body;
        private final List<String> cc;
        private final List<String> bcc;
        private final boolean isHtml;

        private Email(Builder builder) {
            this.from = builder.from;
            this.to = builder.to;
            this.subject = builder.subject;
            this.body = builder.body;
            this.cc = builder.cc;
            this.bcc = builder.bcc;
            this.isHtml = builder.isHtml;
        }

        @Override
        public String toString() {
            return "Email [from=" + from + ", to=" + to
                    + ", subject=" + subject + ", body=" + body
                    + ", cc=" + cc + ", bcc=" + bcc + ", isHtml=" + isHtml + "]";
        }

        public static class Builder {

            private String from;
            private String to;
            private String subject = "";
            private String body = "";
            private List<String> cc = new ArrayList<>();
            private List<String> bcc = new ArrayList<>();
            private boolean isHtml = false;

            public Builder from(String from) {
                this.from = from;
                return this;
            }

            public Builder to(String to) {
                this.to = to;
                return this;
            }

            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            public Builder body(String body) {
                this.body = body;
                return this;
            }

            public Builder cc(List<String> cc) {
                this.cc = cc;
                return this;
            }

            public Builder bcc(List<String> bcc) {
                this.bcc = bcc;
                return this;
            }

            public Builder isHtml(boolean isHtml) {
                this.isHtml = isHtml;
                return this;
            }

            public Email build() {
                if (from == null || from.isEmpty()) {
                    throw new IllegalStateException("'from' must not be null or empty");
                }
                if (to == null || to.isEmpty()) {
                    throw new IllegalStateException("'to' must not be null or empty");
                }
                return new Email(this);
            }
        }
    }

    public static void main(String[] args) {
        try {
            Email email = new Email.Builder()
                    .from("alice@example.com")
                    .to("bob@example.com")
                    .subject("Hello")
                    .body("Hi Bob!")
                    .cc(List.of("cc@example.com"))
                    .isHtml(false)
                    .build();
            System.out.println(email);
        } catch (IllegalStateException e) {
            System.err.println("Validation failed: " + e.getMessage());
        }

        try {
            new Email.Builder()
                    .from("")
                    .to("bob@example.com")
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Correctly caught: " + e.getMessage());
        }
    }
}
