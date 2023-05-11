package Java_seminar.seminar_3.HwSeminar3.Hw4;

import java.util.Arrays;
import java.util.List;

public class Ex4 {
    /**
     *Задан целочисленный список ArrayList.
     * Найти минимальное, максимальное и среднее из этого списка.
     *
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

        double[] minMaxAvg = getMinMaxAvg(numbers);
        System.out.println("Минимальное значение: " + minMaxAvg[0]);
        System.out.println("Максимальное значение: " + minMaxAvg[1]);
        System.out.println("Среднее значение: " + minMaxAvg[2]);
    }

    public static double[] getMinMaxAvg(List<Integer> numbers) {
        double[] result = new double[3];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            sum += number;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        result[0] = min;
        result[1] = max;
        result[2] = (double) sum / numbers.size();
        return result;
    }
}