package src.chap09.library;

public class Book {
    final String title;
    final String author;
    final int pubYear;
    final String publisher;
    boolean renting;

    public Book(final String title, final String author, final int pubYear, final String publisher) {
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
        this.publisher = publisher;
        this.renting = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPubYear() {
        return pubYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public boolean isRenting() {
        return renting;
    }

    public void setRenting(final boolean renting) {
        this.renting = renting;
    }

    public void print() {
        System.out.println(
                "title : " + this.title +
                        " , author : " + this.author +
                        " , pubYear : " + this.pubYear +
                        " , publisher : " + this.publisher +
                        " , renting : " + this.renting
        );
    }
}
