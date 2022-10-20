package Model;

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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", unitPrice=" + cost +
                ", quantity=" + quantity +
                ", category='" + category + '\'' +
                '}';
    }
}
