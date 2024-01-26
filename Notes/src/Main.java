// Notes, explanations, and examples about different subjects

// Main class to store methods
public class Main {

    // Methods use the Camel naming scheme
    // Main method to show examples and explanations
    public static void main(String[] args){

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

        // Operators____________________________________________________________________________________________________
        int num1 = 20;
        int num2 = 10;
        int theSum = num1 + num2; // Adding numbers
        int theDifference = num1 - num2; // Subtracting numbers
        int theProduct = num1 * num2; // Multiplying numbers
        int theQuotient = num1 / num2; // Dividing numbers
        num1 ++; // Increments the number up by one
        num2 --; // Decrements the number down by one
        int theModulus = num1 % num2; // Returns the modulus (the remainder of the division)
        boolean isEqual = num1 == num2; // Returns true if the values are equal
        boolean notEqual = num1 != num2; // Returns true if the values are not equal
        boolean isGreater = num1 > num2; // Returns true if the first value is greater
        boolean isLesser = num1 < num2; // Returns true if the first value is lesser
        System.out.println(theModulus);

        // Conditional Statements_______________________________________________________________________________________
        // Runs the lines in the curly braces if the statement in the parenthesis returns true
        if (num1 > num2) {
            System.out.println(num1 + " is bigger than " + num2);
        }
        // Runs lines in curly braces if the previous "if" statements don't run and the condition returns true
        else if (cat == dog){
            System.out.println(" ");
        }
        // Runs lines in curly braces if the previous "if" statements don't run
        else {
            System.out.println(num2 + " is bigger than " + num1);
        }

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
}
