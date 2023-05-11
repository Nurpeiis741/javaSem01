package Java_seminar.seminar_2.cw4;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(1.0,2.0,3.0);
        Vector vector2 = new Vector(1.0,2.0,3.0);
        System.out.println(vector);
        System.out.println("vector.toString() = " + vector.toString());
        System.out.println("vector.scaliar() = " + vector.scaliar(vector2));
        System.out.println(vector.scaliar(new Vector(1.2,3.0,2.1)));
        System.out.println("vector.vectorPr = " + vector.vectorPr(new Vector(1.8, 2.8, 3.0)));
        System.out.println("vector.vectorCos() = " + vector.vectorCos(new Vector(1.0, 2.0, 3.0)));
    }
}


