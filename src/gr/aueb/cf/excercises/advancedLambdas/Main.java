package gr.aueb.cf.excercises.advancedLambdas;

import java.util.ArrayList;
import java.util.List;

import static gr.aueb.cf.excercises.advancedLambdas.Product.getFilteredProducts;

public class Main {

    public static void main(String[] args) {
    List<Product> products = new ArrayList<>();
    products.add(new Product(1, "Apples",10.0, 10));
    products.add(new Product(2, "Oranges",8.5, 15));


        List<Product> cheapProducts = getFilteredProducts(products, product -> product.getPrice() < 100);
        System.out.println("Cheap Products:");
        cheapProducts.forEach(System.out::println);
    }
}
