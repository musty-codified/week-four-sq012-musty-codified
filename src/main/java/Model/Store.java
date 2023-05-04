package Model;

import lombok.Data;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;

@Data
public class Store {
    private ArrayList<Product> productList = new ArrayList<>();
    private PriorityQueue<Customer> customersList = new PriorityQueue<>();

    public void fileReader(String path){
        BufferedReader reader;
        ArrayList<Product> productArray = getProductList();
        try {
            String line = "";
            reader = new BufferedReader( new FileReader(path));
            while ((line = reader.readLine()) != null) {;
                String[] arr = line.split(",");
                Product product = new Product(arr[0], Double.parseDouble(arr[1]), arr[2], Integer.parseInt(arr[3]));
                productArray.add(product);
            }
            reader.close();
            System.out.println(productArray);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
