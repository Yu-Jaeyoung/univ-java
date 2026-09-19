# Java Programming 수업 저장소

Java 프로그래밍 수업의 예제 코드와 실습 과제를 연도별로 정리한 저장소입니다.

## 수업 개요

- **과목명:** Java 프로그래밍
- **Java Version:** Java 21
- **IDE:** IntelliJ IDEA

## 폴더 구조

```text
univ-java/
├── java-programming-2023/     # 2023년 수업 자료
│   └── chap01/ ~ chap10/      # 기본 문법, 객체 지향, 예외 처리, 파일 입출력, 스레드
├── java-programming-2025/     # 2025년 수업 자료
│   ├── chap01/ ~ chap06/      # Java 기초, 제어문, 배열, 클래스, 상속
│   └── exercise/             # 3, 5, 11, 13, 14주차 실습
├── java-programming-2026/     # 2026년 수업 자료
│   └── src/
├── README.md
└── .gitignore
```

## 실행 방법

JDK 21을 준비합니다. 연도별로 동일한 패키지와 클래스 이름이 있으므로, 실행할 연도의 소스만 선택해서 컴파일합니다.

### IntelliJ IDEA

1. 실행할 연도의 폴더를 프로젝트로 엽니다.
2. Project SDK를 JDK 21로 설정합니다.
3. 2026년 프로젝트는 `src`를 Sources Root로 지정합니다. 2023년과 2025년은 각 연도 폴더가 소스 루트입니다.
4. 실행할 클래스의 `main` 메서드를 실행합니다.
