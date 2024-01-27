public class SecondClass {
    // Access modifiers_________________________________________________________________________________________________
    String defaultString = "Default"; // Default variable have no access modifier, they are visible within the package
    public String publicString = "public"; // Public makes the variable visible within the project
    private String privateString = "private"; // Private makes the variable visible to its class only
    protected String protectedString = "protected"; // Protected makes the variable visible to subclasses
    int num1;
    int num2;

    // a constructor is a method that runs when the class object is initialized
    // any code in the constructor will run when you create an object
    SecondClass(){
        num1 = 10; // set default value for when the object is created
    }
}
