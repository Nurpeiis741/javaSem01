package Java_seminar.seminar_3.HwSeminar3.Hw3;

public class Book {
        public String title;
        public String author;
        public double price;
        public int year;

    public Book(String title, String author, double price, int year, int pages) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
        this.pages = pages;
    }

    public int pages;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }


}
