package chap05.access.book2;

public class Book {
    String title;
    String author;
    int price;
    boolean outOfPrint;

    public Book(String title, String author, int price, boolean outOfPrint) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.outOfPrint = outOfPrint;
    }

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
        this.price = 0;
    }

    void print() {
        System.out.println(this.title);
        System.out.println(this.author);

        if (this.outOfPrint) {
            System.out.println("절판");
        } else {
            System.out.println(this.price);
        }
    }
}
