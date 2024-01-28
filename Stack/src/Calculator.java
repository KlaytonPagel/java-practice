public class Calculator {
    Stack stack;
    boolean running;

    // Constructor to initialize the calculator
    Calculator(){
        stack = new Stack();
        running = true;
        startupMessage();
    }

    // display the initial program to the user and explain how it works
    public void startupMessage(){
        System.out.println("This is a calculator program, please use one entry per line and \"q\"");
        System.out.println("I will show you the current total after each number entry Example:");
        System.out.println("2\n+\n2\n Total:4\n+\n2\nTotal:6\nq\nYour end total is 6");
    }

    // Loops through to gather user input
    public void userInput(){
        while (this.running == true){

        }
    }
}
