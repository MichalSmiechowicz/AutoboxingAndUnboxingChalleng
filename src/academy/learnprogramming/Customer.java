package academy.learnprogramming;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transaction;
    private double balance;

    public Customer(String customerName, Double firstTransaction) {
        this.customerName = customerName;
        this.transaction.add(firstTransaction);
        this.balance = firstTransaction;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public void addTransaction(Double value){
        transaction.add(value);
        balance += value;
    }

    public void showTransaction(){
        for(int i =0; i<transaction.size();i++){
            System.out.println(transaction.get(i));
        }
    }
}
