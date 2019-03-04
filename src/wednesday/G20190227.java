package wednesday;

import java.util.Random;

public class G20190227 {

    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                result += i;
            }
        }
        System.out.println("3의 배수의 합 :" + result);


        int su1 = 0;
        int su2 = 0;
        while (su1 + su2 != 5) {
            su1 = new Random().nextInt(6) + 1;
            su2 = new Random().nextInt(6) + 1;
            System.out.println("(" + su1 + "," + su2 + ")");

        }

        System.out.println("exercise05");
        for (int x = 1; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                if (4 * x + 5 * y == 60) {
                    System.out.println("(" + x + "," + y + ")");
                }
            }
        }
        System.out.println("exercise06");
        for (int star = 1; star <= 5; star++) {
            for (int i = 1; i <= star; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("exercise07");
        int max = 0;
        int[] array = {1, 5, 3, 8, 2};
        for (int i = 0; i < 4; i++) {
            if (array[i] > array[i + 1]) {
                max = array[i];
            }
        }
        System.out.println("max : " + max);


        System.out.println("exercise08");
        int[][] array2 = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
        int sum = 0;
        double avg = 0.0;
        double count = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                sum += array2[i][j];
                count += 1;
            }
            avg = sum / count;
            System.out.println(sum);
            System.out.println(avg);
        }
    }
}

