package chap04.enumeration;

public class EnumMethod {
    public static void main(String[] args) {
        Week today = Week.WEDNESDAY;
        String name = today.name();
        System.out.println(name);

        int ordinal = today.ordinal();
        System.out.println(ordinal);

        Week day1 = Week.MONDAY;
        Week day2 = Week.WEDNESDAY;
        System.out.println(day1.compareTo(day2));
        System.out.println(day2.compareTo(day1));

        String todayString = "WEDNESDAY";
        Week today2 = Week.valueOf(todayString);
        System.out.println(today2);

        Week[] days = Week.values();
        for (Week day : days) {
            System.out.println(day);
        }
    }
}
