package src.chap03.enumeration;

import java.util.Calendar;

public class EnumWeek {
    public static void main(String[] args) {
        /**
         Week today = Week.TUESDAY;
         System.out.println(today);

         // 서수(순서) 출력
         System.out.println(today.ordinal());

         String name = today.name();
         System.out.println(name);
         */

        Week today = null;
        Calendar calendar = Calendar.getInstance();
        int week = calendar.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        }

        System.out.print(week);

        if (today == Week.SUNDAY) {
            System.out.println("일요일에도 랩실로 출근해요");
        }
    }
}

