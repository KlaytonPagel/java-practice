public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int itemNum = 0; itemNum < 27; itemNum++){stack.push(itemNum);}
        stack.display();
        System.out.println(stack.pop());
    }
}
