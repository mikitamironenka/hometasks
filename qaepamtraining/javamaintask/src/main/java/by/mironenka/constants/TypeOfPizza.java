package by.mironenka.constants;

public enum  TypeOfPizza {

    BAZEPZZ{

        public String getName(){
            return "BasePZZ";
        }
        public double getCost() {
            return 1;
        }
    },

    CALZONE {

        public String getName(){
            return "Calzone";
        }
        @Override
        public double getCost() {
            return 1.5;
        }

    };

    public abstract double getCost();
    public abstract String getName();
}
