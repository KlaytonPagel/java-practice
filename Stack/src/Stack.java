public class Stack {
    String[] contents = new String[5];

    Stack(){
    }

    // Displays everything currently in the stack_______________________________________________________________________
    public void display() {
        // iterates through all items in the stack and prints them out
        for (String item : contents){
            System.out.println(item);
        }
    }
    // adds an item to the stack________________________________________________________________________________________
    public void push(String element){
        // iterates through the stack to find the next open slot and puts the item their
        for (int index = 0; index < contents.length; index++){
            if (contents[index] == null){
                contents[index] = element;
                break;
            }
        }
    }
    // removes and returns the last item added to the stack_____________________________________________________________
    public String pop() {
        // iterates back words through the stack and returns the last item
        for (int index = contents.length - 1; index >= 0; index--) {
            if (contents[index] != null) {
                String element = contents[index];
                contents[index] = null;
                return element;
            }
        }
        return null;
    }

    // returns the current size of the stack____________________________________________________________________________
    public int length(){
        int size = 0;
        // iterates through each item in the stack counting how many slots are full
        for (String item : contents){
            if (item != null){
                size++;
            }
        }
        return size;
        }
    }

