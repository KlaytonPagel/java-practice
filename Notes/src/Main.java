// Notes, explanations, and examples about different subjects

// Main class to store methods
public class Main {
    // Methods______________________________________________________________________________________________________
    // Methods use the Camel naming scheme
    public static void thisIsMethod() {
        System.out.println("When you call this method I run");
    }

    public  static void printName(String firstName) { // you can give the method parameters to pass in
        System.out.println(firstName); // you can use the argument passed through the parameter as a variable
    }

    public static void ageAndName(int age, String firstName) { // You can ask for multiple parameters
        System.out.println("My name is " + firstName + " My age is " + age);
    }

    static int addition(int num1, int num2) { // you can set the variable type and return a value from the method
        return num1 + num2; // the return statement returns the value to where the method was called from
    }
    // Method overloading is making the same method, but for different variable types
    static double addition(double num1, double num2) { // this is the same method as the previous, but it uses doubles
        return num1 + num2;
    }

    public static void countDown(int count) {
        if (count > 0){
            System.out.println(count);
            count--;
            countDown(count); // recursion is calling a method inside of self
        }
        else {
            System.out.println("countdown complete");
        }
    }

    public static void primitiveVariables() {
        // Primitive variable types_____________________________________________________________________________________

        // Integer type variables______________________________________________
        byte apple = 1; // Has one Byte worth of storage
        short banana = 2; // Has two Bytes worth of storage
        int orange = 4; // Has four Bytes worth of storage
        long pineapple = 4_234_567_890L; // Has eight Bytes worth of storage (Use "L" at the end of long types)

        // Decimal type variables______________________________________________
        float dog = 4.4f; // Has four Byte worth of storage (end the value with an "f")
        double cat = 8.8; // Has eight Bytes worth of storage

        // Character type variables____________________________________________
        char letter = 'A'; // Has two bytes store single Character(use single quotes)

        // Boolean type variables______________________________________________
        boolean tired = true; // Has one byte, stores true/false
    }

    public static void stringVariables() {
        // Strings______________________________________________________________________________________________________
        String name = "Klayton ";
        String name2 = "Someone \"Else\""; // Use \ to add special characters
        String combine = name + " " + name2; // Concatenate strings using "+"
        String replaced = name.replace("K", "C"); // Replaces first argument with the second
        String uppercase = name.toUpperCase(); // Returns string but uppercase
        String lowercase = name.toLowerCase(); // Returns string but lowercase
        String trimmed = name.trim(); // Returns string without added white space on the ends
        boolean checkEnd = name.endsWith("on"); // Returns true if string ends with given arguments, false if not
        boolean checkStart = name.startsWith("K"); // Returns true if string starts with given arguments, false if not
        int checkIndex = name.indexOf("K"); // Returns the index of the given argument
        int checkLength = name.length(); // Returns the length of the string
    }

    public static void operators() {
        // Operators____________________________________________________________________________________________________
        int num1 = 20;
        int num2 = 10;
        int theSum = num1 + num2; // Adding numbers
        int theDifference = num1 - num2; // Subtracting numbers
        int theProduct = num1 * num2; // Multiplying numbers
        int theQuotient = num1 / num2; // Dividing numbers
        num1++; // Increments the number up by one
        num2--; // Decrements the number down by one
        int theModulus = num1 % num2; // Returns the modulus (the remainder of the division)
        boolean isEqual = num1 == num2; // Returns true if the values are equal
        boolean notEqual = num1 != num2; // Returns true if the values are not equal
        boolean isGreater = num1 > num2; // Returns true if the first value is greater
        boolean isLesser = num1 < num2; // Returns true if the first value is lesser
        System.out.println(theModulus);
    }

    public static void conditions() {
        // Conditional Statements_______________________________________________________________________________________
        // Runs the lines in the curly braces if the statement in the parenthesis returns true
        int num1 = 20;
        int num2 = 10;
        float dog = 4.4f;
        double cat = 8.8;
        if (num1 > num2) {
            System.out.println(num1 + " is bigger than " + num2);
        }
        // Runs lines in curly braces if the previous "if" statements don't run and the condition returns true
        else if (cat == dog) {
            System.out.println(" ");
        }
        // Runs lines in curly braces if the previous "if" statements don't run
        else {
            System.out.println(num2 + " is bigger than " + num1);
        }
    }

    public static void loops() {
        // Loops________________________________________________________________________________________________________
        // While loop___________________________________________________________
        // Loops through statements enclosed in loop until the condition returns false
        int num1 = 20;
        int num2 = 10;
        while (num1 > 0) {
            System.out.println(num1);
            num1--;
        }
        // For loop____________________________________________________________
        // Loops for a specified number of times
        for (int index = 0; index < 10; index++) {
            System.out.println("Count" + index);
            // if statement to check condition of the loop
            if (index == 5) {
                break; // Breaks out of the loop
            }
            System.out.println("Next");
        }
    }

    public static void arrays() {
        // Arrays_______________________________________________________________________________________________________
        // Define array type then variable then the items you wish to store in the array
        String[] names = {"John", "Carol", "Ted"}; // String[] makes an array for strings, Arrays have a fixed size
        System.out.println(names[0]); // Access individual parts of the array using its index
        int[][] grid = {{0, 1, 2, 3},
                {0, 1, 2, 3},
                {0, 1, 2, 3}}; // Add multiple dimensions to the array by adding more brackets
        System.out.println(grid[0][2]); // Access multidimensional array using both indexes

        // Loop through each item in an array
        for (String person : names) {
            System.out.println(person);
        }
        // Loop through each item in multidimensional array
        for (int tileX = 0; tileX < grid.length; tileX++) {
            for (int tileY = 0; tileY < grid[tileX].length; tileY++) {
                System.out.println(grid[tileX][tileY]);
            }
        }
    }

    public static void switchStatements() {
        // Switch statements____________________________________________________________________________________________
        int gameState = 2;
        // Switch sets different outputs depending on a determined number
        switch (gameState) {
            case 1: // if the given number is a one it will execute case one
                System.out.println("game state is on");
                break; // break leaves the current loop or function without running the rest of it
            case 2:
                System.out.println("Game state is paused");
                break;
            case 3:
                System.out.println("Game state is off");
                break;
            default: // if the given case number is not any predetermined ones it will execute this default one
                System.out.println("Game state has not been set");
        }
    }

    public static void generalNotes() {
        // General Notes________________________________________________________________________________________________

        // You only need to define the variable type when initializing
        // you can re-assign the variable later on without declaring a variable type
        int age = 25;
        age = 20;

        //Variables use the camel naming scheme
        int largeNumber = 123_456_789; // Use underscores every three digits for readability

        // Displays an output to the user
        System.out.println(largeNumber);
    }

    // Main method run automatically when file runs
    public static void main(String[] args) {
        // You can call the other methods from inside the main method
        thisIsMethod();
        printName("Klayton");
        ageAndName(20, "Klayton");
        System.out.println(addition(2, 3)); // you can call methods as the argument for other method calls
        System.out.println(addition(2.0, 3.0)); // calls the double version of the addition method
        countDown(3);
    }
}