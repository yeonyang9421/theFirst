import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println("============ 연습문제 6-1 ==================");
        System.out.println("3초간 기다림");
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("끝");

        System.out.println("============ 연습문제 6-2 ==================");
        System.out.println("구구단을 작성하세요");
        for (int su = 1; su < 10; su++) {
            for (int dan = 2; dan < 10; dan++) {
                String result = "%d * %d = %2d \t\t";
                System.out.print(String.format(result, dan, su, su * dan));
            }
            System.out.println("");
        }
        System.out.println("============ 연습문제 6-3 ==================");
        String nowTime = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.println(nowTime);

        System.out.println("============ 연습문제 6-4 ==================");
        System.out.println("던질 횟수를 입력해주세요");
        long tries = new Scanner(System.in).nextLong();
        int hits = 0;
        for (long i = 0; i < tries; i++) {
            double x1 = 0.0;
            double y1 = 0.0;
            double x2 = new Random().nextDouble();
            double y2 = new Random().nextDouble();
            double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
            if (distance < 1.0) {
                hits++;
            }
        }
        double piEstimate = 4.0 * hits / tries;
        System.out.println(piEstimate);
    }
}
