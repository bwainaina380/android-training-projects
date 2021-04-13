package com.feelgoodapps.coffeehouse.coffee

class CoffeeDrinks(name: String, description: String) {
    var name: String = name
        get() {
            return field
        }

    var description = description
        get() {
            return field
        }

    var drinks = arrayOf(
        CoffeeDrinks("latte", "Nothing like a good latte"),
        CoffeeDrinks("espresso", "Enjoy your espresso today"),
        CoffeeDrinks("cappuccino", "Get some steamy cappuccino before your hard work")
    )
        get() {
            return field
        }
}