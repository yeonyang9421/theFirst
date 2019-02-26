package oop;

public class Hero {
    private String name;
    private int hp;
    public static int MONEY;
    Sword sword;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    static void setRandomMoney() {
        Hero.MONEY = (int) (Math.random() * 1000);
    }

    void attack() {
        System.out.println(this.name + "는 공격했다.");
        System.out.println("적에게 5포인트의 데미지를 주었다.");

    }

    void run() {
        System.out.println(this.name + "는 도망쳤다!" + "\n GAME OVER");
        System.out.println("최종 HP는 " + this.hp + " 입니다");
    }

    void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + " 는" + sec + "초 앉았다.");
        System.out.println("HP가 " + sec + "포인트 회복되었다.");
    }

    void slip() {
        this.hp -= 5;
        System.out.println(this.name + " 는 넘어졌다.");
        System.out.println("5의 데미지!");
    }

    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "는 잠을 자고 회복했다!");
    }
}
