package oop;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("마법사 지팡이는 null 값을 가질 수 없음");
        }
        this.wand = wand;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
            throw new IllegalArgumentException("HP 값은 0 이상이여야 함");
        }
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            this.mp = 0;
            throw new IllegalArgumentException("MP 값은 0 이상이여야 함");
        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null 값이 아니어야 함");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("이름은 3글자 이상이어야 함");
        }
        this.name = name;
    }

    void heal(Hero hero) {
        int basePoint = 10;
        wand.setPower(4);
        int recoverPoint = (int) (basePoint * this.wand.getPower());
        hero.setHp(hero.getHp() + recoverPoint);
        System.out.println(hero.getName() + "의 HP를 " + recoverPoint + "회복하여 HP가 " + hero.getHp() + "가 됨.");
    }
}
