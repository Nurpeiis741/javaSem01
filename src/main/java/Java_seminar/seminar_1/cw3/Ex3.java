package Java_seminar.seminar_1.cw3;

public class Ex3 {

    public static void main(String[] args) {
        System.out.println(replacePartofString("I walk through the valley of the shadow..."));
    }

    public static String replacePartofString(String str){
        int length = str.length();
        String sub1 = str.substring(0, length /2);
        String sub2 = str.substring(length /2 , length);


        return sub2 + sub1;
    }
}
