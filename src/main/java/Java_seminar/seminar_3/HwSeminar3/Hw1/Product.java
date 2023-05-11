package Java_seminar.seminar_3.HwSeminar3.Hw1;

public class Product {
    public String name;
    public double price;

    public Product(String name, double price, String grade) {
        this.name = name;
        this.price = price;
        this.grade = grade;
    }

    public   String grade;

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String getGrade() {
        return grade;
    }

}
