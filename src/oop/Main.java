package oop;

public class Main {
    public static void main(String[] args) {

        Hero.setRandomMoney();
        System.out.println(Hero.MONEY);

        Sword sword = new Sword();
        sword.name = "불의 검";
        sword.damage = 10;
        Hero.MONEY = 100;

        Hero hero1 = new Hero("멋진기사", 100);
        Hero hero2 = new Hero("아서스", 50);

        Wizard wizard = new Wizard();
        wizard.setName("제이나");
        wizard.setHp(50);
        Wand wand = new Wand();
        wizard.setWand(wand);

        wizard.heal(hero1);
        wizard.heal(hero2);
        wizard.heal(hero2);

        hero1.sword = sword;
        System.out.println("용사 " + hero1.getName() + "을 생성했습니다.");
        System.out.println("현재의 무기는  " + hero1.sword.name);
        Kinoko kinoko1 = new Kinoko();
        kinoko1.hp = 50;
        kinoko1.suffix = 'A';

        Kinoko kinoko2 = new Kinoko();
        kinoko2.hp = 48;
        kinoko2.suffix = 'B';

        //모험의 시작
        hero1.slip();
        kinoko1.run();
        kinoko2.run();
        hero1.run();

        Cleric cleric = new Cleric("성직자");
        showPoint(cleric);

        cleric.slip();
        System.out.println(cleric.name + " 가 넘어졌습니다.");
        System.out.println("-5의 HP 데미지!");
        showPoint(cleric);

        cleric.selfAid();
        System.out.println(cleric.name + "가 mp 5를 사용하여 스스로 치료한 후 자신의 HP를 회복합니다.");
        showPoint(cleric);

        int prayTime = 7;
        int recoverPoint = cleric.pray(prayTime);
        System.out.println(cleric.name + "가 " + prayTime + "초 기도를 해서 " + recoverPoint + "만큼 MP를 회복합니다. ");
        showPoint(cleric);
    }

    private static void showPoint(Cleric cleric) {
        System.out.println(cleric.name + "의 현재  hp는 " + cleric.hp + " 입니다");
        System.out.println(cleric.name + "의 현재  mp는 " + cleric.mp + " 입니다");
        System.out.println("===============================");
    }
}
