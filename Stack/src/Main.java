public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("hello");
        System.out.println(stack.length());
        System.out.println(stack.pop());
        System.out.println(stack.length());
    }
}
