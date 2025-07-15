package task27;

import task26.Product;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        List<Product> products = Product.initializeProducts();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        List<Product> list = products.stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .limit(n)
                .toList();

        list.forEach(System.out::println);
    }
}
