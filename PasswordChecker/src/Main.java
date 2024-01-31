public class Main {
    public static void main(String[] args) {
        PasswordChecker passCheck = new PasswordChecker();
        String password = "LmA7ZTyx120!@#";
        System.out.println(password);
        boolean repeat = passCheck.checkRepeat(password);
        System.out.println(repeat);
    }
}