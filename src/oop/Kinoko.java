package oop;

public class Kinoko {
    int hp=50;
    final int LEVEL=10;
    private char suffix;

    public Kinoko(char suffix) {
        this.suffix = suffix;
    }

    public char getSuffix() {
        return suffix;
    }

    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }

    public void attack(Hero hero){
        System.out.println("키노코 " + this.suffix + "의 공격");;
        System.out.println("10의 데미지");
        hero.setHp(hero.getHp()-10);
        System.out.println("현재 hp :" + hero.getHp());
    }
    void run(){
        System.out.println("괴물 버섯 " + this.suffix + " 는 도망갔다! ");
    }
}