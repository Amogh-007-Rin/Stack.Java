public class BuilderPattern {

    public static class Pizza {

        private final String dough;
        private final String sauce;
        private final boolean cheese;
        private final boolean pepperoni;
        private final boolean mushrooms;

        private Pizza(Builder builder) {
            this.dough = builder.dough;
            this.sauce = builder.sauce;
            this.cheese = builder.cheese;
            this.pepperoni = builder.pepperoni;
            this.mushrooms = builder.mushrooms;
        }

        @Override
        public String toString() {
            return "Pizza [dough=" + dough + ", sauce=" + sauce
                    + ", cheese=" + cheese + ", pepperoni=" + pepperoni
                    + ", mushrooms=" + mushrooms + "]";
        }

        public static class Builder {

            private String dough = "thin";
            private String sauce = "tomato";
            private boolean cheese = true;
            private boolean pepperoni = false;
            private boolean mushrooms = false;

            public Builder dough(String dough) {
                this.dough = dough;
                return this;
            }

            public Builder sauce(String sauce) {
                this.sauce = sauce;
                return this;
            }

            public Builder cheese(boolean cheese) {
                this.cheese = cheese;
                return this;
            }

            public Builder pepperoni(boolean pepperoni) {
                this.pepperoni = pepperoni;
                return this;
            }

            public Builder mushrooms(boolean mushrooms) {
                this.mushrooms = mushrooms;
                return this;
            }

            public Pizza build() {
                return new Pizza(this);
            }
        }
    }

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .dough("thick")
                .sauce("bbq")
                .cheese(true)
                .pepperoni(true)
                .mushrooms(true)
                .build();

        System.out.println(pizza);

        Pizza defaultPizza = new Pizza.Builder().build();
        System.out.println(defaultPizza);
    }
}
