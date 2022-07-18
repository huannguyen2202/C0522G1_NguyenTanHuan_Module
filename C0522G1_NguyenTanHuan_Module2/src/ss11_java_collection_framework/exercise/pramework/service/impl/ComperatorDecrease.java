package ss11_java_collection_framework.exercise.pramework.service.impl;

import ss11_java_collection_framework.exercise.pramework.model.Product;

import java.util.Comparator;

public class ComperatorDecrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice()-o1.getPrice();
    }
}
