package oop;

public class Wand {
    public static final double MIN_POWER = 0.5;
    public static final int MAX_POWER = 100;
    private String name;
    private double power;

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

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if (power < MIN_POWER && power > MAX_POWER) {
            throw new IllegalArgumentException("지팡이의 마력은 0.5 이상 100.0 이하여야 함");
        }
        this.power = power;
    }
}
