public class Main {
    public static void main(String[] args) {
        PasswordChecker passCheck = new PasswordChecker();
        String password = "password";
        passCheck.checkPassword(password);
        passCheck.checkFile(password);
    }
}