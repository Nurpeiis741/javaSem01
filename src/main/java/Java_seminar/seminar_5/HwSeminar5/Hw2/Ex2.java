package Java_seminar.seminar_5.HwSeminar5.Hw2;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        );

        Map<String, Integer> nameCountMap = new HashMap<>();
        for (String employee : employees) {
            String name = employee.split(" ")[0];
            nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1);
        }

        List<Map.Entry<String, Integer>> popularNames = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : nameCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                popularNames.add(entry);
            }
        }

        popularNames.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        for (Map.Entry<String, Integer> entry : popularNames) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}