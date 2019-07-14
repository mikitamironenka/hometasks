package by.mironenka.flowers;

import by.mironenka.constants.FreshnessLevel;

import java.math.BigDecimal;

public class Lilly extends Flower {
    /**
     * Constructor
     */
    public Lilly() {
        super("Lilly", BigDecimal.valueOf(2.50), FreshnessLevel.THREE.getLevel(), 30);
    }
}
