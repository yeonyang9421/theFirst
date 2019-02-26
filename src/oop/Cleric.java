package oop;

import java.util.Random;

public class Cleric {
    static final int MAX_HP = 50;
    static final int MAX_MP = 10;
    int hp = MAX_HP;
    int mp = MAX_MP;
    String name;

    public Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public Cleric(String name, int hp) {
        this(name, hp, MAX_MP);
    }

    public Cleric(String name) {
        this(name, MAX_HP, MAX_MP);
    }

    void selfAid() {
        if (mp >= 5 && hp < MAX_HP) {
            this.mp -= 5;
            this.hp = MAX_HP;
        }
    }

    int pray(int prayTime) {
        int ranPoint = new Random().nextInt(2);
        int previousPoint = mp;
        int recoverPoint = prayTime + ranPoint;
        this.mp += recoverPoint;
        if (this.mp > MAX_MP) {
            this.mp = MAX_MP;
        }
        int nowPoint = mp - previousPoint;
        return nowPoint;
    }

    void slip() {
        this.hp -= 5;
    }
}
