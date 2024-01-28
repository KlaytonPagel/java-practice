import java.util.Scanner;

public class Calculator {
    Stack stack;
    boolean running;
    Scanner input;

    // Constructor to initialize the calculator
    Calculator(){
        stack = new Stack();
        running = true;
        input = new Scanner(System.in);
        startupMessage();
        userInput();
        stack.display();
    }

    // display the initial program to the user and explain how it works
    public void startupMessage(){
        System.out.println("This is a calculator program, please use one entry per line and \"q\"");
        System.out.println("I will show you the current total after each number entry Example:");
        System.out.println(">> 2\n>> +\n>> 2\n Total:4\n>> +\n>> 2\nTotal:6\n>> q\nYour end total is 6");
    }

    // Loops through to gather user input
    public void userInput(){
        while (this.running == true){
            System.out.print(">> ");
            String entry = this.input.next();
            if (entry.equals("q")){
                this.running = false;
                break;
            }
            this.stack.push(entry);
        }
    }
}
