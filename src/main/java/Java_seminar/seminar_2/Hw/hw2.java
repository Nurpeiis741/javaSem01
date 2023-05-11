package Java_seminar.seminar_2.Hw;

public class hw2 {
    public static void main(String[] args) {

        int index = 0;

        int[] arr = {1, 2, 10, 4, 11};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 10) {
                index += i;
            }
        }

        System.out.println(index);
    }
}
