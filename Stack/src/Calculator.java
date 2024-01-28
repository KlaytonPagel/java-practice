import java.util.Scanner;

public class Calculator {
    Stack stack;
    boolean running;
    Scanner input;
    String state;
    String[] operators = {"+", "-", "/", "*"};

    // Constructor to initialize the calculator_________________________________________________________________________
    Calculator(){
        stack = new Stack();
        input = new Scanner(System.in);
        startupMessage();
        state = "operand";
        userInput();
        stack.display();
    }

    // display the initial program to the user and explain how it works_________________________________________________
    public void startupMessage(){
        System.out.println("This is a calculator program, please use one entry per line and \"q\"");
        System.out.println("I will show you the current total after each number entry Example:");
        System.out.println(">> 2\n>> +\n>> 2\n Total:4\n>> +\n>> 2\nTotal:6\n>> q\nYour end total is 6");
    }

    // Loops through to gather user input_______________________________________________________________________________
    public void userInput(){
        while (true){
            System.out.print(">> ");
            String entry = this.input.next();
            if (entry.equals("q")){ // If user enters "q" end the program
                break;
            }
            // Checks if the operand is valid and asks for a new one if it isn't
            else if (this.state.equals("operand")){
                this.state = "operator";
            }
            // Checks if the operator is valid and gets a new input if it isn't
            else if (this.state.equals("operator")){
                boolean valid = verifyOperator(entry);
                while (!valid){
                    System.out.print("You have entered an invalid operator, Please try again\n>> ");
                    entry = this.input.next();
                    valid = verifyOperator(entry);
                }
                this.state = "operand";
            }
            // Add the users entry to the stack
            this.stack.push(entry);
        }
    }
    // Method to check if an operator is actually_______________________________________________________________________
    public boolean verifyOperator(String entry){
        for (String operator : this.operators){
            if (entry.equals(operator)){
                return true;// Returns true if an operator is in the operators array
            }
        }
        return false;
    }
}
