package oop;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise14 {

    public static void main(String[] args) {

        // 1. 현재의 날짜를 Date 형으로 얻는다.
        Date now = new Date();

        // 2. 얻은 날짜정보를 Calendar 에 설정한다.
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);

        //3. Calendar 에서 일(day) 값을 얻는다.
        int day = calendar.DAY_OF_YEAR;

        //4. 얻은 값에 100을 더한 값을 Calendar 의 일 에 설정한다.
        calendar.add(day, 100);

        //5. Calendar 의 날짜정보를 Date 형으로 변환한다.
        Date result = calendar.getTime();

        //6. SimpleDateFormat 을 이용하여 Date 인스턴스의 내용을 표시한다.
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("now : " + format.format(now));
        System.out.println("result : " + format.format(result));

    }
}
