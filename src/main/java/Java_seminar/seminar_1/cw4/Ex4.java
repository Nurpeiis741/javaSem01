//hw1

package Java_seminar.seminar_1.cw4;

public class Ex4 {
    public static void main(String[] args) {
      System.out.println(reverseWords("the sky is blue"));
    }
    static String reverseWords(String s){
        String[] words=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for (int i = words.length-1; i >=0 ; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return  sb.toString().trim();
    }

}

//HW2

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[] {1,2,1,2,-1,1,3,1,3,-1,0};
        int n = scanner.nextInt();
        int summ = 0;


        for (int i = 0; nums > i; i++) {
            int b = scanner.nextInt();
            if (b<0) {
                summ+=i-1;
            }
            if (b == 0){
                break;
            }

        }
        System.out.println(summ);
        scanner.close();
    }

}



