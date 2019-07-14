package by.mironenka.accessories;

import java.math.BigDecimal;

public abstract class Accessory {

    /**
     * Name of an accessory
     */
    private final String name;
    /**
     * price of an accessory
     */
    private final BigDecimal price;

    /**
     * Constructor
     * @param name
     * @param price
     */
    public Accessory(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Getter of the name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter of the price
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\n" + "Accessory{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
