package exercise.week05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {
                "사과", "배", "바나나", "딸기", "포도", "파인애플"
        };

        // fruits 배열의 모든 과일 이름을 출력한다

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.print("찾고 싶은 과일을 입력하세요: ");
        String input = scanner.next();

        // 배열에서 input과 동일한 이름을 가지는 과일이 있으면
        // 해당 인덱스(첨자)를 출력하고, 없으면 -1을 출력한다.

        int i = 0;
        for (; i < fruits.length; i++) {
            if (fruits[i].equals(input)) {
                break;
            }
        }

        if (i == fruits.length) {
            System.out.println(input + "은/는 배열에 없습니다.");
            System.out.println(-1);
        } else {
            System.out.println("위치는 " + i + "입니다.");
        }
    }
}
