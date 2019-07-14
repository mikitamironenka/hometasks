package by.mironenka.flowers;

import by.mironenka.constants.FreshnessLevel;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Class for creating flowers
 */
public abstract class Flower {

    /**
     * Name of a flower
     */
    private final String name;
    /**
     * price of a flower
     */
    private final BigDecimal price;
    /**
     * Freshness level
     */
    private final int freshnessLevel;
    /**
     * Length of flower's stalk
     */
    private final int lengthOfStalk;

    /**
     * Constructor
     * @param name
     * @param price
     * @param freshnessLevel
     * @param lengthOfStalk
     */
    public Flower(String name, BigDecimal price, int freshnessLevel, int lengthOfStalk) {
        this.name = name;
        this.price = price;
        this.freshnessLevel = freshnessLevel;
        this.lengthOfStalk = lengthOfStalk;
    }


    /**
     * Geeter of the flower's name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Getter of the flower's price
     * @return
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Getter of the flower's freshness
     * @return
     */
    public int getFreshnessLevel() {
        return freshnessLevel;
    }

    /**
     * Getter of the flower's length of stalk
     * @return
     */
    public int getLengthOfStalk() {
        return lengthOfStalk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return price == flower.price &&
                freshnessLevel == flower.freshnessLevel &&
                lengthOfStalk == flower.lengthOfStalk &&
                name.equals(flower.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, freshnessLevel, lengthOfStalk);
    }

    @Override
    public String toString() {
        return "\n" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", freshnessLevel=" + freshnessLevel +
                ", lengthOfStalk=" + lengthOfStalk
                ;
    }
}
