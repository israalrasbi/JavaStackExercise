import java.util.Stack;

public class FindMaximumInStack {
    //initialize global stacks
    static Stack<Integer>stack = new Stack<>();
    static Stack<Integer> maxStack = new Stack<>();

    public static void main(String[] args) {
        push(2);
        push(1);
        push(5);
        push(4);
        System.out.println("Maximum in a stack: " +findMaximum(stack));
    }

    public static void push(int number) {
        //push the element to the stack
        stack.push(number);

        //if the maxStack was empty
        //or the current added element is bigger than the top element in the max stack
        if(maxStack.isEmpty() || number >= maxStack.peek()) {
            //add the current element to the max stack
            maxStack.push(number);
        }

    }
    public static Integer findMaximum(Stack<Integer> stack) {
        //check that the maxStack is not empty
        if(!maxStack.isEmpty()) {
            return maxStack.peek();
        }
        //if the maxStack is empty
        return null;

    }



}
