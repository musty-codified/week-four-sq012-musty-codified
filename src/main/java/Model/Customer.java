package Model;

import Interface.CustomerInterface;
import exceptions.InsufficientFundException;
import exceptions.OutOfStockException;
import lombok.*;

import java.util.ArrayList;
@Data
public class Customer extends Person implements Comparable<Customer>, CustomerInterface {
    private double walletBalance;
    private ArrayList<Product> cart = new ArrayList<>();
    public String buy(Store store, String productName, int Quantity) {
        Product product;
        for (Product p : store.getProductList()) {
            if (p.getProductName().equalsIgnoreCase(productName)) {
                product = p;
                if (product.getQuantity() >= Quantity) {
                    if (getWalletBalance() >= product.getCost() * Quantity) {
                        setWalletBalance(getWalletBalance() - (product.getCost()) * Quantity);
                        Product newProduct = new Product(productName, product.getCost(), product.getCategory(), Quantity);
                        getCart().add(newProduct);
                        store.getCustomersList().add(this);
                        return "Buy successful";
                    } else {
                        throw new InsufficientFundException("Insufficient Funds");
                    }

                } else {
                    throw new OutOfStockException("OUT OF STOCK");
                }
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName=" +
                "walletBalance=" + walletBalance +
                ", cart=" + cart +
                '}';
    }
    //  Play around with it to check FIFO and PriorityQueue
    @Override
    public int compareTo(Customer o) {
        return o.cart.get(0).getQuantity() - this.cart.get(0).getQuantity();
    }

    @Override
    public String buy() {
        return "Customer";
    }
}




