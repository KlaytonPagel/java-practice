public class Stack {
    String[] contents = new String[5];

    Stack(){

    }

    public void display() {
        for (String item : contents){
            System.out.println(item);
        }
    }
}
