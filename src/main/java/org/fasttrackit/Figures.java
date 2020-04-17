package org.fasttrackit;

import java.util.Scanner;

public class Figures {
    int salary;
    int moneySpent;

    public int buy(int salary, int moneySpent) {

        System.out.println("I got my salary today, " + salary + ", and I bought a jacket for " + moneySpent + "... Hm" +
                ".." + ". I think it was too expensive.");

        int leftMoney = salary - moneySpent;
        return leftMoney;
    }

    public double buy(double priceOfTomato, double priceOfOnion, double priceOfCarrot) {


        double totalSpentMoney = priceOfTomato + priceOfOnion + priceOfCarrot;
        System.out.println("Today I was shopping some things on the market. I bought tomato for " + priceOfTomato +
                ", onion for " + priceOfOnion + " and carrot for " + priceOfCarrot + ". It was " + totalSpentMoney +
                " in total.");

        return totalSpentMoney;
    }

    public int countArea(int width, int height) {

        int areaOfTheShape = width * height;

        System.out.println("The area of my rectangle is: " + areaOfTheShape + " square centimeter.");

        return areaOfTheShape;
    }

    public double countArea(double a, double b, double c) {

        double areaOfTriangle = a + b + c;

        System.out.println("The area of my triangle is " + areaOfTriangle + " square centimeter.");
        return areaOfTriangle;
    }
}
