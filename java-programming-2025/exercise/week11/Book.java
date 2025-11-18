package exercise.week11;

class Book {
    // 멤버 변수
    private String title;
    private String author;
    private String publisher;
    private String category;
    private int price;
    private final String isbn;

    private static int totalBooks = 0;

    public Book(String title, String author, String publisher,
                String category, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.price = price;
        this.isbn = isbn;
        totalBooks++;
    }

    public Book(String title, String author, String publisher, int price) {
        this(title, author, publisher, "일반", price, "미등록");
    }

    public Book(String title, String author) {
        this(title, author, "미정", 10000);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public void print() {
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("출판사: " + publisher);
        System.out.println("카테고리: " + category);
        System.out.println("가격: " + price + "원");
        System.out.println("ISBN: " + isbn);
        System.out.println("-------------------");
    }

    @Override
    public String toString() {
        return "제목: " + title + ", 저자: " + author;
    }
}