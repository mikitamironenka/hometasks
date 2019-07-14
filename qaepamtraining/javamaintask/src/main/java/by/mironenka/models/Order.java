package by.mironenka.models;

import by.mironenka.constants.Ingredients;
import by.mironenka.constants.TypeOfPizza;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class Order {

    private final int numberOfOrder;
    private final int numberOfClient;
    private List<Pizza> pizzas;
    private final LocalTime timeOfCreatingOrder;
    private static int countOfOrders = 0;
    private static int countOfClients = 0;

    private static final String newLine = System.getProperty("line.separator").toString();

    public Order() {
        this.numberOfOrder = createNumberOfOrder();
        this.numberOfClient = createNumberOfClient();
        this.pizzas = new ArrayList<>();
        this.timeOfCreatingOrder = LocalTime.now();
    }

    private int createNumberOfOrder(){

        countOfOrders++;
        return countOfOrders + 10000;
    }

    private int createNumberOfClient(){
        countOfClients++;
        return countOfOrders + 1000;
    }

    public LocalTime getTimeOfCreatingOrder() {
        return timeOfCreatingOrder;
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public int getNumberOfClient() {
        return numberOfClient;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void addPizzaToOrder(String name, TypeOfPizza typeOfPizza, Order order, int numberOfPizzas){

        if(numberOfPizzas > 10) {
            System.out.println("Check your order. Sorry, but you can order maximum 10 your favorite pizzas");
            return;
        }
        String finalName = setName(name);
        pizzas.add(new Pizza(finalName, typeOfPizza, order, numberOfPizzas));
    }

    private String setName(String pizzaName){

        String result;
        char[] symbolsOfPizzaName = pizzaName.toCharArray();
        if(symbolsOfPizzaName.length > 4 && symbolsOfPizzaName.length < 20 && isStringContainsLatinCharactersOnly(pizzaName)){
            result = pizzaName;
        } else {
            result = numberOfClient + "_" + (pizzas.size() + 1);
        }
        return result;
    }

    private boolean isStringContainsLatinCharactersOnly(String stringToCheck)
    {
        return stringToCheck.matches("^[a-zA-Z0-9.]+$");
    }

    private double getCostOfOrder(){

        double cost = 0;
        for(Pizza pizza : pizzas) {

            cost = cost + pizza.getCost();
        }

        return cost;
    }

    @Override
    public String toString() {
        return printPizzas();
    }


    private String printPizzas() {

        StringBuilder sbuf = new StringBuilder();
        Formatter fmt = new Formatter(sbuf);

        fmt.format("********************************%n");
        fmt.format("%-9s %-15d%n", "Заказ:", numberOfOrder);
        fmt.format("%-10s %-10d%n", "Клиент:", numberOfClient);

        for(Pizza pizza : pizzas) {

            fmt.format("%-10s %-10s%n", "Название: ", pizza.getName());
            fmt.format("--------------------------------%n");
            fmt.format("%-10s %-10s %5s %2s%n", "Pizza Base: ", pizza.getTypeOfPizza().getName(), pizza.getTypeOfPizza().getCost(), "€");
            for(Ingredients ingredient : pizza.getIngredients()) {

                fmt.format("%-15s %13.2f %2s%n", ingredient.getName(), ingredient.getCost(), "€");
            }
            fmt.format("--------------------------------%n");
            fmt.format("%-15s %13.2f %2s%n", "Всего: ", pizza.getCostOfOnePizza(), "€");
            fmt.format("%-15s %13.2s %2s%n", "Количество:", pizza.getNumberOfPizza(), "шт");
            fmt.format("--------------------------------%n");

        }

        fmt.format("%-15s %13.2f %2s%n", "Общая сумма: ", getCostOfOrder(), "€");
        return fmt.toString();
    }

}
