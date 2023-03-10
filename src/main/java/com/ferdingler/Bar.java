package com.ferdingler;

import java.util.Objects;

public class Bar {
 
    public static final String BEER = "Corona";
    public static final String JUICE = "Orange Juice";
    public static final String COKE = "Coca Cola";
    public static final String WATER = "Topo Chico";
    public static final String MOJITO = "Rum Mojito";
 
    public int processOrder(String drink, int quantity, boolean isStudent) {
 
        if (quantity > 2 && (Objects.equals(drink, BEER) || Objects.equals(drink, MOJITO))) {
            throw new RuntimeException("Too much alcohol, max 2 per person");
        }
 
        int price;
 
        if (drink.equals(BEER)) {
            price = 70;
        } else if (drink.equals(JUICE)) {
            price = ingredient3() + 50;
        } else if (drink.equals(COKE)) {
            price = 110;
        } else if (drink.equals(MOJITO)) {
            price = ingredient1() + ingredient2() + ingredient4();
        } else if (drink.equals(WATER)) {
            price = 10;
        } else {
            throw new RuntimeException("No such drink exists");
        }
        
        if (isStudent) {
            price = price - price/10;
        }
 
        return price * quantity;
    }
 
    // one unit of rum
    private int ingredient1() {
        return 65;
    }
 
    // one unit of grenadine
    private int ingredient2() {
        return 10;
    }
 
    // one unit of orange juice
    private int ingredient3() {
        return 10;
    }
    
    //one unit of soda water
    private int ingredient4() {
        return 10;
    }
}