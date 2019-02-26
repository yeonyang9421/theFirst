package oop;

public class Main {
    public static void main(String[] args) {

 /*       Hero hero1 = new Hero();
        hero1.name = "멋진기사";
        System.out.println("용사 " + hero1.name + "을 생성했습니다.");

        Hero hero2 = new Hero();
        hero2.name = "귀여운기사";
        System.out.println("용사 " + hero1.name + "을 생성했습니다.");
 */

        Cleric cleric = new Cleric();
        cleric.name = "성직자";
        showPoint(cleric);

        cleric.slip();
        System.out.println(cleric.name + " 가 넘어졌습니다.");
        System.out.println("-5의 HP 데미지!");
        showPoint(cleric);

        cleric.selfAid();
        System.out.println(cleric.name + "가 mp 5를 사용하여 스스로 치료한 후 자신의 HP를 회복합니다.");
        showPoint(cleric);

        int prayTime = 1;
        int recoverPoint =  cleric.pray(prayTime);
        System.out.println(cleric.name + "가 " + prayTime + "초 기도를 해서 " + recoverPoint + "만큼 MP를 회복합니다. ");
        showPoint(cleric);
    }

    private static void showPoint(Cleric cleric) {
        System.out.println(cleric.name + "의 현재  hp는 " + cleric.hp + " 입니다");
        System.out.println(cleric.name + "의 현재  mp는 " + cleric.mp + " 입니다");
        System.out.println("===============================");
    }
}
