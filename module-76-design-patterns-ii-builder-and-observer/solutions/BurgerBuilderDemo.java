public class BurgerBuilderDemo {

    public static class Burger {

        private final String bun;
        private final String patty;
        private final boolean cheese;
        private final boolean lettuce;
        private final boolean tomato;
        private final boolean bacon;
        private final String sauce;

        private Burger(Builder builder) {
            this.bun = builder.bun;
            this.patty = builder.patty;
            this.cheese = builder.cheese;
            this.lettuce = builder.lettuce;
            this.tomato = builder.tomato;
            this.bacon = builder.bacon;
            this.sauce = builder.sauce;
        }

        @Override
        public String toString() {
            return "Burger [bun=" + bun + ", patty=" + patty
                    + ", cheese=" + cheese + ", lettuce=" + lettuce
                    + ", tomato=" + tomato + ", bacon=" + bacon
                    + ", sauce=" + sauce + "]";
        }

        public static class Builder {

            private String bun = "sesame";
            private String patty = "beef";
            private boolean cheese = true;
            private boolean lettuce = false;
            private boolean tomato = false;
            private boolean bacon = false;
            private String sauce = "ketchup";

            public Builder bun(String bun) {
                this.bun = bun;
                return this;
            }

            public Builder patty(String patty) {
                this.patty = patty;
                return this;
            }

            public Builder cheese(boolean cheese) {
                this.cheese = cheese;
                return this;
            }

            public Builder lettuce(boolean lettuce) {
                this.lettuce = lettuce;
                return this;
            }

            public Builder tomato(boolean tomato) {
                this.tomato = tomato;
                return this;
            }

            public Builder bacon(boolean bacon) {
                this.bacon = bacon;
                return this;
            }

            public Builder sauce(String sauce) {
                this.sauce = sauce;
                return this;
            }

            public Burger build() {
                return new Burger(this);
            }
        }
    }

    public static void main(String[] args) {
        Burger classic = new Burger.Builder().build();
        System.out.println("Classic: " + classic);

        Burger deluxe = new Burger.Builder()
                .bun("brioche")
                .patty("angus beef")
                .cheese(true)
                .lettuce(true)
                .tomato(true)
                .bacon(true)
                .sauce("mayo")
                .build();
        System.out.println("Deluxe: " + deluxe);

        Burger veggie = new Burger.Builder()
                .bun("whole wheat")
                .patty("veggie")
                .cheese(true)
                .lettuce(true)
                .tomato(true)
                .bacon(false)
                .sauce("vegan aioli")
                .build();
        System.out.println("Veggie: " + veggie);
    }
}
