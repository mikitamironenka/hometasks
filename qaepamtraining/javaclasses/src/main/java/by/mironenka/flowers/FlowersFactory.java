package by.mironenka.flowers;

public class FlowersFactory {


    public Flower getFlower(FlowersTypes type) {

        Flower flowerToReturn = null;

        switch (type) {

            case ROSE:
                flowerToReturn = new Rose();
                break;
            case TULIP:
                flowerToReturn = new Tulip();
                break;
            case LILLY:
                flowerToReturn = new Lilly();
                break;
        }

        return flowerToReturn;
    }
}
