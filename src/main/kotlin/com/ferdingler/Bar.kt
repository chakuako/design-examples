package com.ferdingler

class Bar {

    val BEER = "Corona"
    val JUICE = "Orange Juice"
    val COKE = "Coca Cola"
    val WATER = "Topo Chico"
    val MOJITO = "Rum Mojito"

    fun processOrder(drink: String, quantity: Int, isStudent: Boolean): Int {
        if (quantity > 2 && (drink == BEER || drink == MOJITO)) {
            throw RuntimeException("Too much alcohol, max 2 per person")
        }
        var price: Int
        price = if (drink == BEER) {
            70
        } else if (drink == JUICE) {
            ingredient3() + 50
        } else if (drink == COKE) {
            110
        } else if (drink == MOJITO) {
            ingredient1() + ingredient2() + ingredient4()
        } else if (drink == WATER) {
            10
        } else {
            throw RuntimeException("No such drink exists")
        }

        if (isStudent) {
            price = price - price / 10
        }

        return price * quantity
    }

    // one unit of rum
    private fun ingredient1(): Int {
        return 65
    }

    // one unit of grenadine
    private fun ingredient2(): Int {
        return 10
    }

    // one unit of orange juice
    private fun ingredient3(): Int {
        return 10
    }

    //one unit of soda water
    private fun ingredient4(): Int {
        return 10
    }

}