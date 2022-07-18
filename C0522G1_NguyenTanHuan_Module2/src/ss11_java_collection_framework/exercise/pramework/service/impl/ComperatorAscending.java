package ss11_java_collection_framework.exercise.pramework.service.impl;

import ss11_java_collection_framework.exercise.pramework.model.Product;

import java.util.Comparator;

public class ComperatorAscending implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice()-o2.getPrice();
    }
}
