package exercise.week13;

public class Main {
    public static void main(String[] args) {
        // Character 객체 배열 생성 (크기 4)
        Character[] characters = new Character[4];

        // 4개의 캐릭터 객체를 생성하여 배열에 저장
        characters[0] = new Character("초보자", 10, 100);
        characters[1] = new Warrior("기사단장", 10, 500, 150, 80);
        characters[2] = new Warrior("검사", 100, 100, 50, 50);
        characters[3] = new Mage("마법사", 100, 100, 200, 300);

        // 배열의 모든 캐릭터 정보를 printInfo() 메소드로 출력
        System.out.println("=== 전체 캐릭터 정보 ===");
        for (int i = 0; i < characters.length; i++) {
            characters[i].printInfo();
            System.out.println("-------------------");
        }

        // 특정 캐릭터 레벨업 및 데미지 받기
        System.out.println("\n=== 캐릭터 액션 ===");
        characters[0].levelUp();
        System.out.println();

        characters[1].takeDamage(100);
        System.out.println();

        // instanceof로 타입 확인 후 직업별 특수 기술 사용
        System.out.println("=== 직업별 특수 기술 ===");
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] instanceof Warrior) {
                ((Warrior) characters[i]).powerAttack();
            } else if (characters[i] instanceof Mage) {
                ((Mage) characters[i]).castSpell(50);
            }
        }
        System.out.println();

    }
}