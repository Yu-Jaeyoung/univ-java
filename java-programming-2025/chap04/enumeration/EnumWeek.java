package chap04.enumeration;

import java.util.Calendar;

public class EnumWeek {
    public static void main(String[] args) {
        Week today = Week.WEDNESDAY;

        Calendar calendar = Calendar.getInstance();
        int week = calendar.get(Calendar.DAY_OF_WEEK);

        today = switch (week) {
            case 1 -> Week.SUNDAY;
            case 2 -> Week.MONDAY;
            case 3 -> Week.TUESDAY;
            case 4 -> Week.WEDNESDAY;
            case 5 -> Week.THURSDAY;
            case 6 -> Week.FRIDAY;
            case 7 -> Week.SATURDAY;
            default -> today;
        };

        System.out.println(today);

        if (today == Week.WEDNESDAY) {
            System.out.println("자바 수업이 있습니다.");
        } else {
            System.out.println("자바 공부를 합니다.");
        }
    }
}
