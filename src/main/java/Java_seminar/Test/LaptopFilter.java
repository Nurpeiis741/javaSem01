package Java_seminar.Test;

import java.util.*;

public class LaptopFilter {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Asus", 8, 512, "Windows", "черный"));
        laptops.add(new Laptop("Lenovo", 16, 256, "Ubuntu", "серый"));
        laptops.add(new Laptop("HP", 4, 1024, "Windows", "белый"));
        laptops.add(new Laptop("Dell", 8, 512, "Windows", "серый"));
        laptops.add(new Laptop("Apple", 16, 512, "macOS", "серый"));


        Map<Integer, String> filterCriteria = new HashMap<>();
        filterCriteria.put(1, "ОЗУ");
        filterCriteria.put(2, "Объем ЖД");
        filterCriteria.put(3, "Операционная система");
        filterCriteria.put(4, "Цвет");


        Map<String, Object> filterParams = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (Integer key : filterCriteria.keySet()) {
            System.out.println("Введите \"" + filterCriteria.get(key) + "\":");
            Object value = null;
            if (key == 1 || key == 2) {
                value = scanner.nextInt();
            } else {
                value = scanner.next();
            }
            filterParams.put(filterCriteria.get(key), value);
        }


        Set<Laptop> filteredLaptops = new HashSet<>();
        for (Laptop laptop : laptops) {
            boolean isMatch = true;
            for (String key : filterParams.keySet()) {
                Object value = filterParams.get(key);
                if (key.equals("ОЗУ")) {
                    if (laptop.getRam() < (int) value) {
                        isMatch = false;
                        break;
                    }
                } else if (key.equals("Объем ЖД")) {
                    if (laptop.getHdd() < (int) value) {
                        isMatch = false;
                        break;
                    }
                } else if (key.equals("Операционная система")) {
                    if (!laptop.getOs().equals(value)) {
                        isMatch = false;
                        break;
                    }
                } else if (key.equals("Цвет")) {
                    if (!laptop.getColor().equals(value)) {
                        isMatch = false;
                        break;
                    }
                }
            }
            if (isMatch) {
                filteredLaptops.add(laptop);
            }
        }


        System.out.println("Найденные ноутбуки:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }
    }
}
