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
        //define a variable that store the size of the stack
        int stackSize = stack.size();
        //if the size is 0 then the stack is empty
        if(stackSize == 0){
            return true;
        }
        //otherwise, the stack is not empty
        return false;
    }
}
