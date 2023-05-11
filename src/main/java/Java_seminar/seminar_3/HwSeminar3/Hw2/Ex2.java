package Java_seminar.seminar_3.HwSeminar3.Hw2;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    /**
     *Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
     * Получить наименования товаров заданного сорта с наименьшей ценой.
     */
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Товар 1", "Казастан", 1.0, 10.0, "1"));
        products.add(new Product("Товар 2", "Россия", 2.0, 20.0, "2"));
        products.add(new Product("Товар 3", "Китай", 3.0, 30.0, "1"));
        products.add(new Product("Товар 4", "Сша", 4.0, 40.0, "4"));

        List<String> productsMinPrice = getProductsMinPrice(products, "1");
        System.out.println("Товаров заданного сорта с наименьшей ценой: " + productsMinPrice);
    }


    public static List<String> getProductsMinPrice(List<Product> products, String grade) {
        List<String> result = new ArrayList<>();
        double minPrice = Double.MAX_VALUE;
        for (Product product : products) {
            if (product.getGrade().equals(grade)) {
                if (product.getPrice() < minPrice) {
                    minPrice = product.getPrice();
                    result.clear();
                    result.add(product.getName());
                } else if (product.getPrice() == minPrice) {
                    result.add(product.getName());
                }
            }
        }
        return result;
    }

}
