package task26;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task26 {
    public static void main(String[] args) {
        List<Product> products = Product.initializeProducts();

        Map<String, Optional<Product>> map = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.maxBy(Comparator.comparing(Product::getPrice))
                ));

        map.forEach((category, productOptional) -> {
            System.out.println(category + " = " + productOptional.orElseThrow());
        });
    }
}
