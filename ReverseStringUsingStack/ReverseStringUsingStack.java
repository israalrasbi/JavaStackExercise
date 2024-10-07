import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        //take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("The reversed string: "+reverseString(str));

    }
    public static String reverseString(String str) {
        //initialize the stack
        Stack<String> stack = new Stack<String>();
        //loop through the char of the string
        for(int i=0;i<str.length();i++) {
            //push into the stack
            stack.push(String.valueOf(str.charAt(i)));
        }
        //define variable to store the reversed string
        String reversed = "";
        //loop until the stack is empty
        while(!stack.isEmpty()) {
            //pop the elements, and add them to the reverse string
            reversed += stack.pop();
        }
        return reversed;

    }
}
