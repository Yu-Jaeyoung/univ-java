package chap05.access.book;

public class Book {
    String title;
    String author;
    int price;
    boolean outOfPrint;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isOutOfPrint() {
        return this.outOfPrint;
    }

    public void setOutOfPrint(boolean outOfPrint) {
        this.outOfPrint = outOfPrint;
    }
}
