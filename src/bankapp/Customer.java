package bankapp;

import java.util.ArrayList;

/**
 *
 * @author Mustafa Shubbar <codingbox@outlook.com>
 */
public class Customer {

    private String name;
    // ArrayList can't accept primitive type
    // double value wrapped in Double is a solution
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        // Before we can use transaction, we need to initialize it
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

}
