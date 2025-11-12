package chap05.access.book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();

        book.setTitle("돈의 속성");
        book.setAuthor("김승호");
        book.setPrice(16020);

        System.out.println(book.getTitle());
    }
}
