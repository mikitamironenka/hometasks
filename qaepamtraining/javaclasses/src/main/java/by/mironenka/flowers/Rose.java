package by.mironenka.flowers;

import by.mironenka.constants.FreshnessLevel;

import java.math.BigDecimal;

public class Rose extends Flower {


    /**
     * Constructor
     */
    public Rose() {
        super("Rose", BigDecimal.valueOf(5.00), FreshnessLevel.ONE.getLevel(), 50);
    }
}
