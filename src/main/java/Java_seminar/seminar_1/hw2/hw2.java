
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
