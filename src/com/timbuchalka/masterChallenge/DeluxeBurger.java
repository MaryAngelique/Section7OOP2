package com.timbuchalka.masterChallenge;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {

        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);

    }

}
