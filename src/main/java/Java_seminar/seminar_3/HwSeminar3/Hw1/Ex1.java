package Java_seminar.seminar_3.HwSeminar3.Hw1;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    /**
     * Дан массив записей: наименование товара, цена, сорт.
     * Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
     * название которых содержит «высший».
     */
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Высший", 10.0, "1"));
        products.add(new Product("Низший", 20.0, "2"));
        products.add(new Product("Низший", 30.0, "1"));
        products.add(new Product("Высший", 40.0, "2"));

        double maxPrice = 0.0;
        for (Product product : products) {
            if (product.getName().contains("Высший") && (product.getGrade().equals("1") || product.getGrade().equals("2"))) {
                if (product.getPrice() > maxPrice) {
                    maxPrice = product.getPrice();
                }
            }

        }
        System.out.println("Наибольшая цена товаров 1го или 2го сорта , название который содержит «высший»: " + maxPrice);
    }



}

