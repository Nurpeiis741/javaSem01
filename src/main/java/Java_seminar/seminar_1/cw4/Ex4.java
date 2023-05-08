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


package Java_seminar.seminar_1.hw2;

public class hw2 {
    public static void main(String[] args) {
        System.out.println(getSum());

    }
    public static int getSum()
    {
        String str = "1 2 1 2 -1 1 3 1 3 -1 0";
        String[] strNums = str.split(" ");
        int sum = 0;
        for (int i = 1; i < strNums.length; i++) {
            int number = Integer.parseInt(strNums[i]);
            if(number == 0){
                break;
            }
            int previous = Integer.parseInt(strNums[i + 1]);
            if(previous < 0 ){
                sum += number;
            }
        }
        return sum;
    }
}

}




