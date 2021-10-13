package com.jano;

class CoffeeMachine {
    int actualWater = 400;
    int actualMilk = 540;
    int actualCoffeeBeans = 120;
    int actualCups = 9;
    int actualCash = 550;

    public void printCoffeeMachine() {
        System.out.println("\nThe coffee machine has:\n" +
                + this.actualWater + " ml of water\n" +
                + this.actualMilk + " ml of milk\n" +
                + this.actualCoffeeBeans + " g of coffee beans\n" +
                + this.actualCups + " disposable cups\n" +
                "$" + this.actualCash + " of money");
    }
}
