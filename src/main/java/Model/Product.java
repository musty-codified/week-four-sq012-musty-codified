package Model;

import lombok.*;

@Data
public class Product {
    private String productName;
    private double cost;
    private String category;
    private int quantity;

    public Product() {
    }

    public Product(String productName, double cost, String category, int quantity) {
        this.productName = productName;
        this.cost = cost;
        this.category = category;
        this.quantity = quantity;
    }


}
