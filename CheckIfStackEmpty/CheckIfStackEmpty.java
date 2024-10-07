import java.util.Stack;

public class CheckIfStackEmpty {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        //add 1 to the stack
        stack.push(1);
        //remove 1 from the stack
        stack.pop();
        //call the function
        System.out.println("Is stack empty? "+isStackEmpty(stack));

    }
    public static boolean isStackEmpty(Stack<Integer> stack) {
        //call the isEmpty function to check
        return stack.isEmpty();
    }
}
