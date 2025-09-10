package chap09.library;

public class Library {
    private final Book[] books;
    private int bookCnt = 0;

    public Library(final int capacity) {
        books = new Book[capacity];
    }

    public void addBook(final Book book) {
        books[bookCnt++] = book;
    }

    public void printAll() {
        System.out.println("Library Books: ");
        for (int i = 0; i < bookCnt; i++) {
            books[i].print();
        }
    }

    public void printRenting() {
        for (int i = 0; i < bookCnt; i++) {
            if (books[i].renting) {
                books[i].print();
            }
        }
    }
}
