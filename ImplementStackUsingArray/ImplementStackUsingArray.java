public class ImplementStackUsingArray {
    //define global variables to be used in the functions
    static final int MAX = 1000; //maximum size of the stack
    static int top = -1; //the top element in the stack
    static int[] stack = new int[MAX]; //initialize the stack

    public static void main(String[] args) {
        //push 10, 20, 30 into the stack
        push(10);
        push(20);
        push(30);

        //pop the top element
        System.out.println(pop() + " // (result of pop)");

        //peek at the current top element
        System.out.println(peek() + " // (result of peek)");

        //check if the stack is empty or not
        System.out.println(isEmpty() + " // (result of isEmpty)");

        //print the stack to visualize the remaining elements
        System.out.print("Current stack:");
        printStack();
    }

    public static void push(int x) {
        //first check if the stack is full
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
        }
        //if not full, then add the element to the stack
        else {
            //increment the top, and store the added value in the new position ++top
            stack[++top] = x;
            System.out.println(x + " pushed into stack");
        }
    }

    public static int pop() {
        //check if the stack is empty
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        //if not empty, return the top element, and decrement the top
        else {
            int x = stack[top--];
            return x;
        }
    }

    public static int peek() {
        //check if the stack is empty
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        //if not empty, return the top element without changing the position
        else {
            int x = stack[top];
            return x;
        }
    }

    public static boolean isEmpty() {
        //if the stack is empty it will return true, otherwise, false
        return (top < 0);
    }

    public static void printStack() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + stack[i]);
        }
    }
}
