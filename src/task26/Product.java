package task26;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String name;

    private int price;

    private String category;

    public Product(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public static List<Product> initializeProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("milk", 3, "milk"));
        products.add(new Product("cheese", 2, "milk"));
        products.add(new Product("pepper", 1, "vegetable"));
        products.add(new Product("cucumber", 2, "vegetable"));
        products.add(new Product("banana", 4, "fruit"));
        products.add(new Product("apple", 3, "fruit"));

        return products;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", category=" + category + "]";
    }
}
