public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("============ 연습문제 5-1 ==================");
        introduceOneself();

        System.out.println("============ 연습문제 5-2 ==================");
        email("메일제목", "younyang@naver.com", "안녕하세요");

        System.out.println("============ 연습문제 5-3 ==================");
        email("younyang@naver.com", "hello");

        System.out.println("============ 연습문제 5-4 ==================");
        System.out.println("삼각형의 넓이는? " + calcTriangleArea(20, 10) + "cm");
        System.out.println("원의 넓이는? " + calcCircleArea(20) + "cm²\n");
    }

    private static double calcCircleArea(double radius) {
        final double PI = 3.141592;
        return radius * radius * PI;
    }

    private static double calcTriangleArea(double bottom, double height) {
        return (bottom * height) / 2;
    }

    private static void introduceOneself() {
        String name = "연성희";
        int age = 99;
        float myheight = 160f;
        String gender = "여자";
        System.out.println("안녕하세요. 저의 이름은 " + name + "이고, 나이는" + age + "이며 저의 키는 " + myheight + "인 " + gender + "입니다.\n");
    }

    private static void email(String title, String address, String text) {
        System.out.println(address + "에 아래의 메일을 송신한다. \n" +
                "제목 :" + title + "\n본문  : " + text + "\n");
    }

    private static void email(String address, String text) {
        System.out.println(address + "에 아래의 메일을 송신한다. \n" +
                "제목 :제목없음" + "\n본문  : " + text + "\n");
    }

}
