public class Stack {
    int maxSize = 5;
    String[] container = new String[maxSize];

    Stack(){
    }

    // Displays everything currently in the stack_______________________________________________________________________
    public void display() {
        // iterates through all items in the stack and prints them out
        for (String item : container){
            if (item != null) {
                System.out.println(item);
            }
        }
    }
    // adds a string to the stack_______________________________________________________________________________________
    public void push(String element){
        // iterates through the stack to find the next open slot and puts the item their
        for (int index = 0; index < container.length; index++){
            if (container[index] == null){
                container[index] = (element);
                // increase the size of the stack if it reaches the max size
                if (this.length() == maxSize){this.increaseSize();}
                break;
            }
        }
    }
    // Adds an integer to the stack_____________________________________________________________________________________
    public void push(int element){
        // iterates through the stack to find the next open slot and puts the item their
        for (int index = 0; index < container.length; index++){
            if (container[index] == null){
                container[index] = (String.valueOf(element));
                // increase the size of the stack if it reaches the max size
                if (this.length() == maxSize){this.increaseSize();}
                break;
            }
        }
    }
    // Adds a float to the stack________________________________________________________________________________________
    public void push(float element){
        // iterates through the stack to find the next open slot and puts the item their
        for (int index = 0; index < container.length; index++){
            if (container[index] == null){
                container[index] = (String.valueOf(element));
                // increase the size of the stack if it reaches the max size
                if (this.length() == maxSize){this.increaseSize();}
                break;
            }
        }
    }
    // removes and returns the last item added to the stack_____________________________________________________________
    public String pop() {
        // iterates back words through the stack and returns the last item
        for (int index = container.length - 1; index >= 0; index--) {
            if (container[index] != null) {
                String element = container[index];
                container[index] = null;
                return element;
            }
        }
        return null;
    }

    // returns the current size of the stack____________________________________________________________________________
    public int length(){
        int size = 0;
        // iterates through each item in the stack counting how many slots are full
        for (String item : container){
            if (item != null){
                size++;
            }
        }
        return size;
        }

    public void increaseSize(){
        maxSize += 5;
        String[] newContainer = new String[maxSize];
        for (int index = 0; index < container.length; index++){
            newContainer[index] = container[index];
        }
        container = newContainer;
    }
    }

