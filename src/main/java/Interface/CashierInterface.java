package Interface;

import Model.Customer;
import Model.Store;

public interface CashierInterface {
    String sell(Store store);
     void dispenseReceipt(Customer customer, double totalPrice);

}
