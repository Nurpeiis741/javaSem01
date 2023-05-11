package Java_seminar.seminar_3.HwSeminar3.Hw3;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    /**
     * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
     * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А»
     * и год издания после 2010 г, включительно.
     *
     */
    public static void main(String[] args) {
        List<Book> books= new ArrayList<>();
        books.add(new Book("Книга 1", "Иванов", 10.0, 2012, 100));
        books.add(new Book("Книга 2", "Петров", 20.0, 2015, 200));
        books.add(new Book("Книга 3", "Сидоров", 30.0, 2018, 300));
        books.add(new Book("Книга 4", "Абрамович", 40.0, 2011, 97));

        List<String> booksByCriteria = getBooksByCriteria(books);
        System.out.println("Книга в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно. " + booksByCriteria);
    }
    public static List<String> getBooksByCriteria(List<Book> books) {
        List<String> result = new ArrayList<>();
        for (Book book : books) {
            if (isPrime(book.getPages()) && book.getAuthor().contains("А") && book.getYear() >= 2010) {
                result.add(book.getTitle());
            }
        }
        return result;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
