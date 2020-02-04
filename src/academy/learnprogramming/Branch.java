package academy.learnprogramming;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;

    public void addCustomer(String name, Double firstTransaction) {
        Customer customer = new Customer(name, firstTransaction);
        if (findCustomer(name) == -1) {
            this.customers.add(customer);
        }else {
            System.out.println("This name is already in use");
        }
    }
    public int findCustomer(String name){
        for(int i = 0; i< customers.size(); i++){
            if (customers.get(i).getCustomerName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void transaction(String customerName, Double transactionValue){
        if (findCustomer(customerName) != -1){
        int customerId = findCustomer(customerName);
        customers.get(customerId).addTransaction(transactionValue);
        }else {
            System.out.println("There is now customer named "+customerName+"in this branch!");
        }

    }

    public void showCustomers(){
        for (int i = 0; i <customers.size(); i++){
            System.out.println(customers.get(i).getCustomerName());
        }
    }

    public void showHistory(String name){
        int customerId = findCustomer(name);
        customers.get(customerId).showTransaction();
    }
}
