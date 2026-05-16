package login;

public class UserID {

    private static String userLogin;

    public static void setUserLogin(
    String user) {

        userLogin = user;
    }

    public static String getuserLogin() {

        return userLogin;
    }
}