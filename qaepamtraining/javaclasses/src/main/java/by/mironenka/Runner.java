package by.mironenka;

import by.mironenka.bouquet.Bouquet;
import by.mironenka.bouquet.BouquetController;
import by.mironenka.flowers.Flower;
import by.mironenka.flowers.FlowersFactory;
import java.util.Comparator;

public class Runner {

    public static void main(String[] args) {

        /**
         * creates flowers factory
         */
        FlowersFactory flowersFactory = new FlowersFactory();

        Bouquet bouquet = new Bouquet();
        /**
         * Create bouquet with random flowers
         */
        for (int i = 0; i < 20; i++) {
            BouquetController.addRandomFlower(bouquet, flowersFactory);
        }

        System.out.println(bouquet);
        /**
         * Sorting of the bouquet
         */
        bouquet.getFlowers().sort(Comparator.comparing(Flower::getFreshnessLevel));
        System.out.println(bouquet);
        /**
         * getting flowers with certain length of stalks
         */
        System.out.println(BouquetController.getFlowersFromStalkLengthDiapason(50, 60, bouquet.getFlowers()));
    }





}
