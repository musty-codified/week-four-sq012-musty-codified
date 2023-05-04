package Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("Test cashier print receipt")
class CashierTest{
    Store store = new Store();
    String path = "/Users/decagon/Desktop/week-two-sq012-musty-codified/src/Product Data - Sheet1.csv";
    Cashier cashier = new Cashier(store);
    Customer customer1 = new Customer();
@DisplayName("Cashier prints receipt")
    @Test
    void sell_WhenCashierSell_ShouldPrintReceipt(){
//        Arrange
        store.fileReader(path);
        customer1.setFirstName("Gideon");
        customer1.setLastName("Abel");
        customer1.setWalletBalance(2000000);
        customer1.buy(store, "rice", 3);
//        Act
       String result = cashier.sell(store);
//        Assert
        Assertions.assertEquals("Cashier sells to customer", result  , ()->"Cashier did not print receipt");

    }

}
