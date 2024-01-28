public class Stack {
    String[] contents = new String[5];

    Stack(){
    }

    public void display() {
        for (String item : contents){
            System.out.println(item);
        }
    }
    public void push(String element){
        for (int index = 0; index < contents.length; index++){
            if (contents[index] == null){
                contents[index] = element;
                break;
            }
        }
    }
    public String pop() {
            for (int index = contents.length - 1; index > 0; index--) {
                if (contents[index] != null) {
                    String element = contents[index];
                    contents[index] = null;
                    return element;
                }
            }
        return null;
    }
}
