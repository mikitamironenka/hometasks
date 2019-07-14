package by.mironenka.models;

import by.mironenka.constants.Ingredients;
import by.mironenka.constants.TypeOfPizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private List<Ingredients> ingredients;
    private final TypeOfPizza typeOfPizza;
    private final Order order;

    private int numberOfPizza;
    private final static int LIMIT_NUMBER_OF_PIZZAS = 10;

    public Pizza(String name, TypeOfPizza typeOfPizza, Order order, int numberOfPizza) {
        this.name = name;
        this.typeOfPizza = typeOfPizza;
        this.order = order;
        this.numberOfPizza = numberOfPizza;
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public TypeOfPizza getTypeOfPizza() {
        return typeOfPizza;
    }

    public int getNumberOfPizza() {
        return numberOfPizza;
    }

    public void setNumberOfPizza(int numberOfPizza) {
        this.numberOfPizza = numberOfPizza;
    }

//    private String checkNameOfPizza(String name) {
//
//        char[] symbolsInname = name.toCharArray();
//        if
//    }

    public double getCost(){

        double cost;

        cost = typeOfPizza.getCost();

        if(ingredients.size() > 0) {
            for(Ingredients ingredient : ingredients) {
                cost = cost + ingredient.getCost();
            }
        }

        return cost * numberOfPizza;
    }

    public double getCostOfOnePizza(){

        double cost;

        cost = typeOfPizza.getCost();

        if(ingredients.size() > 0) {
            for(Ingredients ingredient : ingredients) {
                cost = cost + ingredient.getCost();
            }
        }

        return cost;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void addIngredient(Ingredients ingredient) {

        if(ingredients.size() == 8) {
            System.out.println("Your pizza is full.");
            return;
        } else if (checkIsPizzaContainsTheIngredientAlready(ingredient)){
            System.out.println("Your pizza already contains the ingredient. Please, check your order.");
            return;
        } else {
            ingredients.add(ingredient);
        }
    }

    @Override
    public String toString() {
        return "[" + order.getNumberOfOrder() + ":" + order.getNumberOfClient() + ":" + name + ":" + numberOfPizza + "]";
    }


    private boolean checkIsPizzaContainsTheIngredientAlready(Ingredients newIngredient) {

        boolean result = false;
        for(Ingredients ingredient : ingredients) {
            if(newIngredient.equals(ingredient)) {
                result = true;
            }
        }

        return result;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pizza pizza = (Pizza) o;

        if (name != null ? !name.equals(pizza.name) : pizza.name != null) return false;
        return ingredients != null ? ingredients.equals(pizza.ingredients) : pizza.ingredients == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (ingredients != null ? ingredients.hashCode() : 0);
        return result;
    }
}
