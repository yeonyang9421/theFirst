package wednesday;

public class SoundableExample {

    private static void printSound(Soundable soundable){
        System.out.println(soundable.sound());
    }
    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());


    }

    private static class Cat implements Soundable {
        @Override
        public String sound() {
            return "야옹";
        }
    }

    private static class Dog implements Soundable {
        @Override
        public String sound() {
            return "멍멍";
        }
    }
}
