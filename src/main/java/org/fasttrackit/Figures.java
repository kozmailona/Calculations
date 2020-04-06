package org.fasttrackit;

public class Figures {
    int salary;
    int moneySpent;

    public int buy(int salary, int moneySpent) {

        System.out.println("I got my salary today, " + salary + ", and I bought a jacket for " + moneySpent + "... Hm" +
                ".." + ". I think it was too expensive.");

        int leftMoney = salary - moneySpent;
        return leftMoney;
    }
}
