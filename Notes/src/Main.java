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
