package com.jano;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String action;

        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        System.out.println("Write action (buy, fill, take, remaining, exit):");
        do {
            action = scanner.nextLine();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String input = scanner.nextLine();
                    switch (input) {
                        case "1":
                            makeEspresso(coffeeMachine);
                            break;
                        case "2":
                            makeLatte(coffeeMachine);
                            break;
                        case "3":
                            makeCappuccino(coffeeMachine);
                            break;
                        case "break":
                            break;
                    }
                    printActions();
                    break;
                case "fill":
                    System.out.println("\nWrite how many ml of water you want to add: ");
                    int water = scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add: ");
                    int milk = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    int coffeeBeans = scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add: ");
                    int cups = scanner.nextInt();
                    fillCoffeeMachine(coffeeMachine, water, milk, coffeeBeans, cups);
                    printActions();
                    break;
                case "take":
                    takeCoffeeMachine(coffeeMachine);
                    printActions();
                    break;
                case "remaining":
                    coffeeMachine.printCoffeeMachine();
                    printActions();
                    break;
                default:
                    break;
            }

        } while (!action.equalsIgnoreCase("exit"));

    }

    public static void printActions() {
        System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
    }

    public static void makeEspresso(CoffeeMachine coffeeMachine) {
        if (coffeeMachine.actualWater >= 250 && coffeeMachine.actualCoffeeBeans >= 16 && coffeeMachine.actualCups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            coffeeMachine.actualWater -= 250;
            coffeeMachine.actualCoffeeBeans -= 16;
            coffeeMachine.actualCups -= 1;
            coffeeMachine.actualCash += 4;
        } else if (coffeeMachine.actualWater < 250) {
            System.out.println("Sorry, not enough water!");
        } else if (coffeeMachine.actualCoffeeBeans < 16) {
            System.out.println("Sorry, not enough coffee beans!");
        } else {
            System.out.println("Sorry, not enough disposable cups!");
        }
    }

    public static void makeLatte(CoffeeMachine coffeeMachine) {
        if (coffeeMachine.actualWater >= 350 && coffeeMachine.actualMilk >= 75 && coffeeMachine.actualCoffeeBeans >= 20 && coffeeMachine.actualCups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            coffeeMachine.actualWater -= 350;
            coffeeMachine.actualMilk -= 75;
            coffeeMachine.actualCoffeeBeans -= 20;
            coffeeMachine.actualCups -= 1;
            coffeeMachine.actualCash += 7;
        } else if (coffeeMachine.actualWater < 350) {
            System.out.println("Sorry, not enough water!");
        } else if (coffeeMachine.actualMilk < 75) {
            System.out.println("Sorry, not enough milk!");
        } else if (coffeeMachine.actualCoffeeBeans < 20) {
            System.out.println("Sorry, not enough coffee beans!");
        } else {
            System.out.println("Sorry, not enough disposable cups!");
        }
    }

    public static  void makeCappuccino(CoffeeMachine coffeeMachine) {
        if (coffeeMachine.actualWater >= 200 && coffeeMachine.actualMilk >= 100 && coffeeMachine.actualCoffeeBeans >= 12 && coffeeMachine.actualCups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            coffeeMachine.actualWater -= 200;
            coffeeMachine.actualMilk -= 100;
            coffeeMachine.actualCoffeeBeans -= 12;
            coffeeMachine.actualCups -= 1;
            coffeeMachine.actualCash += 6;
        } else if (coffeeMachine.actualWater < 200) {
            System.out.println("Sorry, not enough water!");
        } else if (coffeeMachine.actualMilk < 100) {
            System.out.println("Sorry, not enough milk!");
        } else if (coffeeMachine.actualCoffeeBeans < 12) {
            System.out.println("Sorry, not enough coffee beans!");
        } else {
            System.out.println("Sorry, not enough disposable cups!");
        }
    }

    public static void fillCoffeeMachine(CoffeeMachine coffeeMachine, int water, int milk, int coffeeBeans, int cups) {
        coffeeMachine.actualWater += water;
        coffeeMachine.actualMilk += milk;
        coffeeMachine.actualCoffeeBeans += coffeeBeans;
        coffeeMachine.actualCups += cups;
    }

    public static void takeCoffeeMachine(CoffeeMachine coffeeMachine) {
        System.out.println("I gave you $" + coffeeMachine.actualCash);
        coffeeMachine.actualCash = 0;
    }
}


