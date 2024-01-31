import java.util.Scanner;

public class PasswordGenerator {
    int length;
    Scanner input;
    // Constructor______________________________________________________________________________________________________
    PasswordGenerator(){
        this.input = new Scanner(System.in);
        setLength();
    }

    // Takes User input for how long they want the password to be_______________________________________________________
    public void setLength(){
        System.out.println("Enter the length of the password you want >> ");
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
}
