import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();


        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int age = Integer.parseInt(scanner.nextLine());


            books.add(new Book(title, age));
        }

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getTitle);


        Collections.sort(books, comparator);

        System.out.println("\n" + books.stream().count() + " books in total." + "\n");

        for (Book e: books) {
            System.out.println(e);
        }

    }
