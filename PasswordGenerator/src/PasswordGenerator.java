import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    int length;
    Scanner input;
    Random random;
    int[] choices = {1, 2, 3};
    String letters;
    String specials;
    String password;
    // Constructor______________________________________________________________________________________________________
    PasswordGenerator(){
        this.input = new Scanner(System.in);
        this.random = new Random();
        this.letters = "abcdefghijklmnopqrstuvwxyz";
        this.specials = "!@#$%^&*()_-=+\\|/?.>,<`~";
        this.password = "";
        setLength();
        create();
    }

    // Takes User input for how long they want the password to be_______________________________________________________
    public void setLength(){
        System.out.print("Enter the length of the password you want >> ");
        try{
            this.length = Integer.parseInt(this.input.next());
        }
        catch (Exception e){
            System.out.println("Please enter a valid whole number");
            setLength();
        }
        if (this.length < 1){
            System.out.println("Please enter a number greater than 1");
            setLength();
        }
    }

    //  Creates the password____________________________________________________________________________________________
    public void create(){
        int choice;
        int uppercase = 1;
        for (int index = 0; index < this.length; index++){
            choice = this.choices[random.nextInt(3)];
            // Generates a letter
            if (choice == 1){
                // Make uppercase letter
                String letter = String.valueOf(this.letters.charAt(random.nextInt(this.letters.length())));
                if (uppercase == 1) {
                    this.password += letter.toUpperCase();
                } else {
                    this.password += letter;
                }
                uppercase = random.nextInt(2);
            // Generates a number
            } else if (choice == 2) {
                this.password += String.valueOf(random.nextInt(9));
            // Generates a special character
            } else if (choice == 3) {
                this.password += this.specials.charAt(random.nextInt(this.specials.length()));
            }
        }
        System.out.println("Your password is:\n" + this.password);
    }
}
