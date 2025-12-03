package exercise.week14;

public class Main {
    public static void main(String[] args) {
        // Character 객체 배열 생성 (크기 4)
        Character[] characters = new Character[4];

        // Warrior, Mage 객체를 생성하여 배열에 저장
        characters[0] = new Warrior("검사", 100, 100, 50, 50);
        characters[1] = new Warrior("기사단장", 10, 500, 150, 80);
        characters[2] = new Mage("마법사", 100, 100, 200, 300);
        characters[3] = new Mage("현자", 15, 200, 300, 400);

        // 배열의 모든 캐릭터 정보를 printInfo() 메소드로 출력
        System.out.println("=== 전체 캐릭터 정보 ===");
        for (Character character : characters) {
            character.printInfo();
            System.out.println("-------------------");
        }

        // 특정 캐릭터 레벨업 및 데미지 받기
        System.out.println("\n=== 캐릭터 액션 ===");
        characters[0].levelUp();
        System.out.println();

        characters[1].takeDamage(100);
        System.out.println();

        // 인터페이스 기반 특수 기술 사용
        System.out.println("=== 직업별 특수 기술 ===");
        for (Character character : characters) {
            if (character instanceof Attackable) {
                ((Attackable) character).powerAttack();
            } else if (character instanceof Magical) {
                ((Magical) character).castSpell(50);
            }
        }
        System.out.println();
    }
}