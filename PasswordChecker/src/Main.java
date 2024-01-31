public class Main {
    public static void main(String[] args) {
        PasswordChecker passCheck = new PasswordChecker();
        String password = "LmA7ZTyx120!@#";
        System.out.println(password);
        boolean length = passCheck.checkLength(password);
        boolean repeat = passCheck.checkRepeat(password);
        boolean contains = passCheck.checkContains(password);
        System.out.println("Repeat Test Pass: " + repeat);
        System.out.println("Length Test Pass: " + length);
        System.out.println("Contains Test Pass: " + contains);
    }
}