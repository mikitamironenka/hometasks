package by.mironenka.bouquet;

import by.mironenka.accessories.Accessory;
import by.mironenka.flowers.Flower;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bouquet {

    /**
     * Collection for flowers in a bouquet
     */
    private final List<Flower> flowers;
    /**
     * Collection for accessories in a bouquet
     */
    private final List<Accessory> accessories;

    /**
     * Cost of bouquet
     */
    private BigDecimal costOfBouquet;

    /**
     * Constructor
     */
    public Bouquet() {
        this.flowers = new ArrayList<>();
        this.accessories = new ArrayList<>();
    }

    /**
     * Getter of flowers
     * @return
     */
    public List<Flower> getFlowers() {
        return flowers;
    }

    /**
     * Getter of accessories
     * @return
     */
    public List<Accessory> getAccessories() {
        return accessories;
    }

    /**
     * Adding flower to a bouquet
     * @param flower
     */
    public void addFlower(Flower flower) {
        this.flowers.add(flower);
//        this.costOfBouquet.add(flower.getPrice());
    }

    /**
     * Adding accessory to a bouquet
     * @param accessory
     */
    public void addAccessory(Accessory accessory) {
        this.accessories.add(accessory);
//        this.costOfBouquet.add(accessory.getPrice());
    }

    /**
     * Getter cost of a bouquet
     * @return cost
     */
    public BigDecimal getCostOfBouquet() {
        BigDecimal summ = BigDecimal.ZERO;
        for(Flower flower : this.flowers) {
            summ = summ.add(flower.getPrice());
        }
        for(Accessory accessory : this.accessories){
            summ = summ.add(accessory.getPrice());
        }
        return summ;
    }


    @Override
    public String toString() {
        return "Bouquet :" + "\n" +
                "flowers :" + flowers +
                "\n" + "accessories :" + accessories +
                "\n" + "cost of bouquet :"  + getCostOfBouquet();
    }
}
