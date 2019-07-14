package by.mironenka.constants;

public enum Ingredients {

    TOMATO_PASTE {

        public double getCost() {
            return 1;
        }

        @Override
        public String getName() {
            return "Tomato Paste";
        }
    },

    CHEESE {

        public double getCost() {
            return 1;
        }

        @Override
        public String getName() {
            return "Cheese";
        }
    },

    SALAMI {

        public double getCost() {
            return 1.5;
        }

        @Override
        public String getName() {
            return "Salami";
        }
    },

    BACON {

        public double getCost() {
            return 1.2;
        }

        @Override
        public String getName() {
            return "Bacon";
        }
    },

    GARLIC {

        public double getCost() {
            return 0.3;
        }

        @Override
        public String getName() {
            return "Garlic";
        }
    },

    CORN {

        public double getCost() {
            return 0.7;
        }

        @Override
        public String getName() {
            return "Corn";
        }
    },

    PEPPERONI {

        public double getCost() {
            return 0.6;
        }

        @Override
        public String getName() {
            return "Pepperoni";
        }
    },

    OLIVES {

        public double getCost() {
            return 0.5;
        }

        @Override
        public String getName() {
            return "Olives";
        }
    };

    public abstract double getCost();
    public abstract String getName();
}
