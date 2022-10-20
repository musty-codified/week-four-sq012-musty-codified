package Model;

import Interface.CustomerInterface;
import exceptions.InsufficientFundException;
import exceptions.OutOfStockException;

import java.util.ArrayList;


public class Customer extends Person implements Comparable<Customer>, CustomerInterface {
    private double walletBalance;
    private ArrayList<Product> cart = new ArrayList<>();

    public Customer() {
    }

    public Customer(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    //    public Customer(String firstName, String lastName, String gender, String age, String email, long contactNo, double walletBalance, ArrayList<Product> cart) {
//        super(firstName, lastName, gender, age, email, contactNo);
//        this.walletBalance = walletBalance;
//        this.cart = cart;
//    }
    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Product> cart) {
        this.cart = cart;
    }

    public String buy(Store store, String productName, int Quantity) {
        Product product = new Product();
        for (Product p : store.getProductList()) {
            if (p.getProductName().equalsIgnoreCase(productName)) {
                product = p;
            }
        }

        if (product.getQuantity() >= Quantity) {
            if (getWalletBalance() >= product.getCost() * Quantity) {
                setWalletBalance(getWalletBalance() - (product.getCost()) * Quantity);
                Product newProduct = new Product(productName, product.getCost(), product.getCategory(), Quantity);
                getCart().add(newProduct);
                store.getCustomersList().add(this);
                return "buy successful";
            } else {
                throw new InsufficientFundException("Insufficient Funds");
            }

        } else {
            throw new OutOfStockException("OUT OF STOCK");
        }
    }
//        checkStock(store, Quantity, product);
//        return productName;

//    private static void checkStock(Store store, int Quantity, Product product) {
//        if (Quantity > product.getQuantity()){
//
//        }else{
//            store.removeFromProductList(product, Quantity);
//        }
//    }

    @Override
    public String toString() {
        return "Customer{" +
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




