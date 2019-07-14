package by.mironenka;

import by.mironenka.constants.Ingredients;
import by.mironenka.constants.TypeOfPizza;
import by.mironenka.models.Order;

public class Runner {

    public static void main(String[] args) {

            Order order = new Order();

            order.addPizzaToOrder("Margarita", TypeOfPizza.CALZONE, order, 2);
            order.getPizzas().get(0).addIngredient(Ingredients.TOMATO_PASTE);
            order.getPizzas().get(0).addIngredient(Ingredients.CHEESE);

            System.out.println(order.toString());

        Order newOrder = new Order();

        newOrder.addPizzaToOrder("Margarita", TypeOfPizza.BAZEPZZ, order, 12);
    }
}
