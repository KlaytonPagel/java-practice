// Class used to check a password for specific requirements_____________________________________________________________
public class PasswordChecker {
    String password;
    int minLength;
    // Constructor______________________________________________________________________________________________________
    PasswordChecker(){
        minLength = 12;
    }

    // Gather user input and check if for all requirements______________________________________________________________
    public void run(){}

    // Method to check if the password meets the length requirement_____________________________________________________
    public boolean checkLength(String password){
        if (password.length() < this.minLength){
            return false;
        }else {
            return true;
        }
    }

    // Method to check if the password meets the repetitive requirement_________________________________________________
    public void checkRepetitive(){}


}
