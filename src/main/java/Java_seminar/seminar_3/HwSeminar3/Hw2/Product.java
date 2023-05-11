package Java_seminar.seminar_3.HwSeminar3.Hw2;

public class Product {
    public String name;
    public String  country;
    public double weight;
    public double price;
    public String grade;

    public Product(String name, String country, double weight, double price, String grade) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.price = price;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    public double getWeight() {
        return weight;
    }
    public double getPrice() {
        return price;
    }
    public String getGrade() {
        return grade;
    }

}
