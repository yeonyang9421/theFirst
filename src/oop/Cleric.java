package oop;

import java.util.Random;

public class Cleric {
    String name;
    int hp = 50;
    final int MAXHP = 50;
    int mp = 10;
    final int MAXMP = 10;


    void selfAid() {
        this.mp -= 5;
        this.hp = MAXHP;
    }

    int pray(int prayTime) {
        int ranPoint = new Random().nextInt(2);
        int recoverPoint = 0;
        recoverPoint = prayTime + ranPoint;
        this.mp += recoverPoint;
        if (this.mp > MAXMP) {
            this.mp = MAXMP;
        }
        return recoverPoint;
    }

    void slip() {
        this.hp -= 5;
    }
}
