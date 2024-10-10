package SM.sec05.exam12;

import java.util.Calendar;

// Week 열거형 정의
enum Week {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumWeekExample {
    public static void main(String[] args) {
        Week today = null;

        // 현재 날짜와 시간 가져오기
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK); // 현재 요일 숫자 가져오기

        // 숫자를 요일로 변환
        switch(week) {
            case Calendar.SUNDAY:
                today = Week.SUNDAY; break;
            case Calendar.MONDAY:
                today = Week.MONDAY; break;
            case Calendar.TUESDAY:
                today = Week.TUESDAY; break;
            case Calendar.WEDNESDAY:
                today = Week.WEDNESDAY; break;
            case Calendar.THURSDAY:
                today = Week.THURSDAY; break;
            case Calendar.FRIDAY:
                today = Week.FRIDAY; break;
            case Calendar.SATURDAY:
                today = Week.SATURDAY; break;
        }

        // 오늘의 요일 출력
        System.out.println("Today: " + today);

        // 요일에 따른 메시지 출력
        if (today == Week.SUNDAY) {
            System.out.println("Sunday is playing soccer.");
        } else {
            System.out.println("Studying hard Java.");
        }
    }
}
