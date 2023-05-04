package Model;

import Interface.CashierInterface;
import lombok.Data;
@Data
public class Cashier extends Staff implements CashierInterface, Runnable {
    private Store store;
    public Cashier(Store store) {
        this.store = store;
    }

    @Override
    public String sell(Store store) {

        return "Cashier sells to customer";
    }

    @Override
    public void dispenseReceipt(Customer customer, double totalPrice) {

        System.out.println("-----------RECEIPT-------------");
        System.out.println("Name: " + customer.getFirstName() + " " + customer.getLastName());
        System.out.println("TotalPrice: " + totalPrice);
    }

    @Override
    public String toString() {
        return "Cashier";
    }

    @Override
    public void run() {
        for (Customer cus : store.getCustomersList()) {
            double totalPrice = 0;
            if (!cus.getCart().isEmpty()) {
                for (Product product : cus.getCart()) {
                    totalPrice += (product.getCost() * product.getQuantity());
                }
                dispenseReceipt(cus, totalPrice);
            }

        }
//        Store store = new Store();
        Customer customer1 = new Customer();
        customer1.setFirstName("Gideon");
        Customer customer2 = new Customer();
        customer2.setFirstName("Mustapha");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        for (Customer customer : store.getCustomersList()) {
            this.sell(store);
            String threadName = Thread.currentThread().getName();
            System.out.println(customer1.getFirstName() + " is being attended to on " + threadName);
            // System.out.println(threadName + " is running" );
            sell(store);

//        }
    }
}




