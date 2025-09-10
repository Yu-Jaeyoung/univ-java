package chap09.library;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(2);
        try (Scanner scanner = new Scanner(new File("books.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splitLine = line.split(",");

                if (splitLine.length < 5) {
                    continue;
                }

                String title = splitLine[0].trim();
                String author = splitLine[1].trim();
                int year = Integer.parseInt(splitLine[2].trim());
                String publisher = splitLine[3].trim();
                boolean renting = Boolean.parseBoolean(splitLine[4].trim());

                Book book = new Book(title, author, year, publisher);
                book.setRenting(renting);

                // book.print();
                library.addBook(book);
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("==========");

        library.printAll();

        System.out.println("==========");

        library.printRenting();
    }
}
