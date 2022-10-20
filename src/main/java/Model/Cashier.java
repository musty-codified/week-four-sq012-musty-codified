package Model;

import Interface.CashierInterface;

public class Cashier extends Staff implements CashierInterface, Runnable {

    public Cashier() {
    }

//    public Cashier(String firstName, String lastName, String gender, String age, String email,
//                   long contactNo, String position, String StaffId) {
//        super(firstName, lastName, gender, age, email, contactNo, position, StaffId);
//    }
    @Override
    public String sell(Store store) {
        for (Customer cus : store.getCustomersList()) {
            double totalPrice = 0;
            if (!cus.getCart().isEmpty()) {
                for (Product product : cus.getCart()) {
                    totalPrice += (product.getCost() * product.getQuantity());
                }
                dispenseReceipt(cus, totalPrice);
            }

        }
        return "Thank you for your patronage";
    }
     @Override
    public void dispenseReceipt(Customer customer, double totalPrice){

        System.out.println("-----------RECEIPT-------------------");
        System.out.println("Name: " + customer.getFirstName() + " " + customer.getLastName());
        System.out.println("TotalPrice: " + totalPrice);
    }
    @Override
    public String toString() {
        return "Cashier";
    }


    @Override
    public void run() {
        Store store = new Store();
            for (int i = 0; i < 2; i++) {
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName + "" + sell(store) );
                //                System.out.println(threadName + " is running" );


            }
        }
    }

