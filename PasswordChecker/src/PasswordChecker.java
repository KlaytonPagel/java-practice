// Class used to check a password for specific requirements_____________________________________________________________
public class PasswordChecker {
    String password;
    int minLength;
    int maxTypeRepeat;
    String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h"};

    // Constructor______________________________________________________________________________________________________
    PasswordChecker() {
        minLength = 12;
        maxTypeRepeat = 3;
    }

    // Gather user input and check if for all requirements______________________________________________________________
    public void run() {
    }

    // Method to check if the password meets the length requirement_____________________________________________________
    public boolean checkLength(String password) {
        if (password.length() < this.minLength) {
            return false;
        } else {
            return true;
        }
    }

    // Method to check if the password meets the repetitive requirement_________________________________________________
    public boolean checkRepeat(String password) {
        String previous = null;
        int repeatCount = 0;
        for (int index = 0; index < password.length(); index++) {

            // checks if the character is a letter
            if (Character.isLetter(password.charAt(index))) {
                if (previous == "string") {
                    repeatCount++;
                } else {repeatCount = 0;}
                if (repeatCount == maxTypeRepeat) {
                    System.out.println("Too many of the same character types next to each other");
                    return false;
                } else {
                    previous = "string";
                }

            // Checks if the character is a digit
            } else if (Character.isDigit(password.charAt(index))) {
                if (previous == "digit") {
                    repeatCount++;
                } else {repeatCount = 0;}
                if (repeatCount == maxTypeRepeat) {
                    System.out.println("Too many of the same character types next to each other");
                    return false;
                } else {
                    previous = "digit";
                }

            // if it's not a character or a digit then it must be a special character
            } else {
                if (previous == "special") {
                    repeatCount++;
                } else {repeatCount = 0;}
                if (repeatCount == maxTypeRepeat) {
                    System.out.println("Too many of the same character types next to each other");
                    return false;
                } else {
                    previous = "special";
                }
            }
        }
        return true;
    }
}