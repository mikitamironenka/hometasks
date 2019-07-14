package by.mironenka.flowers;

import by.mironenka.constants.FreshnessLevel;

import java.math.BigDecimal;

public class Tulip extends Flower {


    /**
     * Constructor
     */
    public Tulip() {
        super("Tulip", BigDecimal.valueOf(3.50), FreshnessLevel.TWO.getLevel(), 40);
    }
}
