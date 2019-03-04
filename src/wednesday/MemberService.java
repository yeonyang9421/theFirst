package wednesday;

public class MemberService {

    boolean login(String id, String password) {
        boolean result = false;
        if ((id == "hong") && (password == "12345")) {
            result = true;
        }
        return result;
    }

    void logout(String id) {
        System.out.println("로그아웃 되었습니다.");
    }
}
