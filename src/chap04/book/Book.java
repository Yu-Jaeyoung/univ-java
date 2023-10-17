package src.chap04.book;

public class Book {
    String title;
    String author;

    void setMember(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title) {
        // this(title, "작자미상"); // 첫 번째 줄에서만 사용 가능
        setMember(title, "작자미상");
        System.out.println("Book1 생성자 호출");
        // this.title = title;
        // this.author = "작자미상";
    }

    public Book(String title, String author) {
        setMember(title, author);
        System.out.println("Book2 생성자 호출");
    }

    public static void main(String[] args) {
        Book javaBook = new Book("Java", "황기태");
        // 생성자 Book(String title, String author) 호출
        Book bible = new Book("Bible");
        // 생성자 Book(String title) 호출
    }
}
