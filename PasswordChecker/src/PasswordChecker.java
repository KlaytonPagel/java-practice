import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// Class used to check a password for specific requirements_____________________________________________________________
public class PasswordChecker {
    int minLength;
    int maxTypeRepeat;

    // Constructor______________________________________________________________________________________________________
    PasswordChecker() {
        minLength = 12;
        maxTypeRepeat = 3;
    }

    // Gather user input and check if for all requirements______________________________________________________________
    public void checkPassword(String password) {
        boolean length = checkLength(password);
        boolean repeat = checkRepeat(password);
        boolean contains = checkContains(password);

        if (length && repeat && contains){
            System.out.println("password is valid");
        } else {
            System.out.println("Password does not meet requirements");
        }
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

    // Checks if the password contains at least one of each value type__________________________________________________
    public boolean checkContains(String password){
        boolean digit = false;
        boolean letter = false;
        boolean special = false;
        boolean upper = false;
        for (int index = 0; index < password.length(); index++) {
            if (Character.isDigit(password.charAt(index))){ // Checks if the character is a digit
                digit = true;
            } else if (Character.isUpperCase(password.charAt(index))) { // Checks if the character is upper case
                upper = true;
            } else if (Character.isLetter(password.charAt(index))){ // checks if the character is a letter
                letter = true;
            } else { // if it's not a letter or digit it must be a special character
                special = true;
            }
        }
        if (digit && letter && special && upper){return true;}
        return false;
    }

    // Checks if the password is in a file of commonly used passwords___________________________________________________
    public boolean checkFile(String password){
        File passFile = new File("passwords.txt");
        try {
            Scanner reader = new Scanner(passFile);
            while (reader.hasNext()){
                String line = reader.next();
                if (password.contentEquals(line)){
                    System.out.println("Password is to common");
                    return false;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}