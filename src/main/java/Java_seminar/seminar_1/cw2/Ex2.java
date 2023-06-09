package Java_seminar.seminar_1.cw2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество ");
        int n = scanner.nextInt();
        System.out.println(countDiff(n, scanner));
        scanner.close();
    }

    /**
     *
     * @param n количество чисел в последовательности
     * @return количество положительных чисел идуших перед отрицю
     */
    public static int countDiff(int n, Scanner scanner){
        int count = 0;
        int a = scanner.nextInt();

        for (int i = 0; i < n-1 ; i++) {
            int b = scanner.nextInt();
            if(a > 0 && b < 0){
                count++;
            }
            a = b;
        }
        return count;
    }
}
