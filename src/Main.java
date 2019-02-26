import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println();
        int ran = new Random().nextInt(10);
        System.out.println(ran);
        int b_g = 5;

        System.out.println("================= 랜 덤 예 제=================");
        System.out.println("점쟁이 집에 어서오세요");;
        System.out.println("당신의 이름을 입력해 주세요");;
        
        String name = new Scanner(System.in).nextLine();

        System.out.println("당싱의 나이를 입력해 주세요");

        String ageString = new Scanner(System.in).nextLine();

        int age= Integer.parseInt(ageString);

        int fortune=new Random().nextInt(5);
        System.out.println("점꾀의 결과가 나왔습니다.");
        System.out.println(age + "살의 " + name + "씨, 당신의 운세번호는 " + fortune + "입니다");


        switch (fortune){
            case 1:
                System.out.println("대길");
                break;
            case 2:
                System.out.println("중길");
                break;
            case 3:
                System.out.println("길");
                break;
            case 4:
                System.out.println("흉길");
                break;
        }

        System.out.println("================= 배 열 예 제=================");
        int[] a={1,2,3,4};
        int[] b=a;

        b[0]=100;
        a[0]=1000;
        System.out.println(a[0]);
        System.out.println(b[0]);






    }
}
