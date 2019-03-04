package oop;

public class PoisonKinoko extends Kinoko {
    int attackAmount = 5;

    public PoisonKinoko(char suffix) {
        super(suffix);
    }

    public void attack(Hero hero) {
        super.attack(hero);
        if (attackAmount > 0) {
            System.out.println("추가로, 독 포자를 살포했다!");
            System.out.println(hero.getHp() / 5 + " 포인트의 데미지");
            attackAmount--;
            hero.setHp(hero.getHp() - (hero.getHp() / 5));
            System.out.println("남은 hp : " + hero.getHp());
            System.out.println("남은 공격횟수 : " + attackAmount);
            System.out.println("================================");
        } else {
            System.out.println("공격 횟수가 남아있지 않습니다.");
        }
    }
}
