package org.example;

public class Main {
    public static void main(String[] args) {

        Drink mateDrink = new Drink();
        mateDrink.setName("Mate");
        mateDrink.setIngredients("Wasser, Zucker, Kräutermischung");
        mateDrink.setEan("5865164");
        mateDrink.setInStock(true);

        Drink evian = new Drink();
        evian.setName("Wasser");
        evian.setIngredients("Wasser");
        evian.setEan("0003021");
        evian.setInStock(true);

        System.out.println(evian.getIngredients());
    }
}
