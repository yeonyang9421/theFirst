package oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.lang.Thread.sleep;

public class ApiTime {
    static class Empty{}

    public static void main(String[] args) throws ParseException {
        long start=System.currentTimeMillis();

        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end=System.currentTimeMillis();
        System.out.println("처리 시간 :" + (end - start) + "ms");

        Date now=new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        Date past = new Date(1316622225935L);
        System.out.println(past);

        Calendar calendar=Calendar.getInstance();
        calendar.setTime(now);

        int year = calendar.get(Calendar.YEAR);
        System.out.println("올 해는 " + year + "년 입니다");
        calendar.set(2019,3,1,23,4,22);
        calendar.set(Calendar.YEAR,2019);
        Date past2=calendar.getTime();
        System.out.println("+++"+past2);

        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        String s=format.format(now);
        System.out.println(s);

        Date d=format.parse("2011/09/22 01:23:45");
        System.out.println(d);

        Empty e=new Empty();
        String s2= e.toString();
        System.out.println(s2);

        Object o1=new Hero("영웅",10);
        Object o2=new Wizard();
        Object o3="안녕하세요";

        printAnything(o2);
    }

    private static void printAnything(Object object) {
        System.out.println(object.toString());
    }




}
