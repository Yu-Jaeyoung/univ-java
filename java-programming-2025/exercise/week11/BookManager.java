package exercise.week11;

class BookManager {
    public static void main(String[] args) {
        // 1. Book 객체 배열 생성
        Book[] books = new Book[3];

        // 2. 3권의 책 객체 생성
        books[0] = new Book("자바의 정석", "남궁성", "도우출판",
                "프로그래밍", 30000, "978-89-7050-000-1");
        books[1] = new Book("이펙티브 자바", "조슈아 블로크", "인사이트",
                "프로그래밍", 36000, "978-89-7050-000-2");
        books[2] = new Book("클린 코드", "로버트 마틴", "인사이트",
                "프로그래밍", 33000, "978-89-7050-000-3");

        // 3. 배열의 모든 책 정보 출력
        System.out.println("=== 전체 책 정보 ===");
        for (int i = 0; i < books.length; i++) {
            books[i].print();
        }

        // 4. 첫 번째 책의 가격 변경
        books[0].setPrice(25000);
        System.out.println("=== 가격 변경 후 ===");
        System.out.println(books[0].toString());
        System.out.println();

        // 5. 두 번째 책 객체를 null로 치환
        books[1] = null;
        System.out.println("두 번째 책 객체 null 치환 완료");
        System.out.println();

        // 6. 전체 생성된 책의 개수 출력
        System.out.println("총 생성된 책의 개수: " + Book.getTotalBooks());
    }
}