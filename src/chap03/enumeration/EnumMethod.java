package src.chap03.enumeration;

public class EnumMethod {
    public static void main(String[] args) {
        Week today = Week.SUNDAY;
        String name = today.name();    // name() 메소드
        System.out.println(name);

        int ordinal = today.ordinal();      // ordinal() 메소드
        System.out.println(ordinal);

        Week day1 = Week.MONDAY;
        Week day2 = Week.WEDNESDAY;
        int result1 = day1.compareTo(day2);      // compareTo() 메소드
        int result2 = day2.compareTo(day1);
        System.out.println(result1);
        System.out.println(result2);

        if (args.length == 1) {
            String strDay = args[0];
            Week weekDay = Week.valueOf(strDay);
            if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
                System.out.println("주말 이군요");
            } else {
                System.out.println("평일 이군요");
            }
        }

        Week[] days = Week.values();    // values() 메소드

        for (Week day : days) {
            System.out.println(day);
        }
    }
}

