package ss16_binary_file_serialization.exercise.product_management.until;

import ss16_binary_file_serialization.exercise.product_management.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteProduct {
    public static List<Product> readProductFile(String path) {
        List<Product> productList = new ArrayList<>();

        try {
            FileInputStream file = new FileInputStream(path);
            ObjectInputStream object = new ObjectInputStream(file);
            productList = (List<Product>) object.readObject();
            object.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return productList;
    }

    public static void writeProductFile(String path, List<Product> productList) {
        try {
            FileOutputStream file = new FileOutputStream(path);
            ObjectOutputStream object = new ObjectOutputStream(file);
            object.writeObject(productList);
            object.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
