package by.mironenka.bouquet;

import by.mironenka.accessories.Accessory;
import by.mironenka.accessories.AccessoryFactory;
import by.mironenka.accessories.AccessoryTypes;
import by.mironenka.flowers.Flower;
import by.mironenka.flowers.FlowersFactory;
import by.mironenka.flowers.FlowersTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BouquetController {


    public static List<Flower> getFlowersFromStalkLengthDiapason(int bottomLimit, int topLimit, List<Flower> flowers) {
        List<Flower> result = new ArrayList<>();

        flowers.stream().filter(flower -> flower.getLengthOfStalk() >= bottomLimit && flower.getLengthOfStalk() <= topLimit)
                .forEach(result::add);

        return result;
    }

    /**
     * Get random flower
     * @param flowersFactory
     * @return Flower
     */
    public static Flower getRandomFlower(FlowersFactory flowersFactory) {

        Random random = new Random();
        FlowersTypes type = FlowersTypes.values()[random.nextInt(FlowersTypes.values().length)];

        return(flowersFactory.getFlower(type));
    }

    /**
     * Add random flower to bouquet
     * @param bouquet
     * @param flowersFactory
     */
    public static void addRandomFlower(Bouquet bouquet, FlowersFactory flowersFactory) {

        Flower randomFlower = getRandomFlower(flowersFactory);
        bouquet.addFlower(randomFlower);
    }

    /**
     * Get random accessory
     * @param accessoryFactory
     * @return Accessory
     */
    public static Accessory getRandomAccessory(AccessoryFactory accessoryFactory) {

        Random random = new Random();
        AccessoryTypes type = AccessoryTypes.values()[random.nextInt(AccessoryTypes.values().length)];

        return(accessoryFactory.getAccessory(type));
    }

    /**
     * Add random accessory to bouquet
     * @param bouquet
     * @param accessoryFactory
     */
    public static void addRandomAccessory(Bouquet bouquet, AccessoryFactory accessoryFactory) {

        Accessory randomAccessory = getRandomAccessory(accessoryFactory);
        bouquet.addAccessory(randomAccessory);
    }
}
