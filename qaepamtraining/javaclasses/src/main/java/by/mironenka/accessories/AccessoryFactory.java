package by.mironenka.accessories;

/**
 * Factory for creating accessories
 */
public class AccessoryFactory {

    public Accessory getAccessory(AccessoryTypes type) {

        Accessory accessoryToReturn = null;

        switch (type) {

            case FLOWERSTAPE:
                accessoryToReturn = new FlowersTape();
                break;
            case FLOWERSCOVER:
                accessoryToReturn = new FlowersCover();
                break;
            case FLOWERSPAPER:
                accessoryToReturn = new FlowersPaper();
                break;
        }

        return accessoryToReturn;
    }
}
