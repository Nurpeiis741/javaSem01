package Java_seminar.seminar_2.Hw;

import java.util.Arrays;

public class Hw1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, -4, 5, -6, 7, 8, 9, 10, 11};
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isSimple(arr[i])) {
                sum += arr[i];
                System.out.print(arr[i] + ", ");
            }


            }

        System.out.println("Сумма натуральных чисел равна= "+sum);

        boolean flag= true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<=arr[i-1]) {
            flag = false;
            break;
            }}
            if(flag){
                System.out.println("Массив является строго возрастающей последовательностью");
            }
            else {
                System.out.println("Массив не является строго возрастающей последовательностью");
            }

            int summ = 0;
            for (int i = 0; i < arr.length; i++){
                if(arr[i]>=10){
                    int num = i;
                    summ +=num;
                }
            }
            for (int i = 0;i< arr.length;i++){
                if(arr[i]<0){
                    arr[i] = summ;
                }
            }
            System.out.println(Arrays.toString(arr));
            int[] number = arr;






        }




    private static boolean isSimple(int num) {
        if (num < 2) {
            return  false;
        }
        for (int k = 2; k <= Math.sqrt(num); k++){
            if (num % k == 0){
                return false;
            }

        }
        return  true;
    }

    }
