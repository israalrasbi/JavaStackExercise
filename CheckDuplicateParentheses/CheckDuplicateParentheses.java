import java.util.Scanner;
import java.util.Stack;

public class CheckDuplicateParentheses {
    public static void main(String[] args) {
        //ask the user to enter a string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Is duplicate found? "+isDuplicated(str));
    }

    public static boolean isDuplicated(String str) {
        //create a stack
        Stack<Character> Stack = new Stack<>();

        //convert the string into a sequence of characters to access them individually
        char[] charOfStr = str.toCharArray();
        //loop through the new string
        for (char ch : charOfStr) {
            //if current character is close parenthesis ')'
            if (ch == ')') {
                //pop character from the stack
                char top = Stack.peek();
                Stack.pop();

                //define a variable that stores the number of char between a closing and opening parenthesis
                int elementsInside = 0;
                //while the top is not an opening parenthesis
                while (top != '(') {
                    //increment the elements inside the parenthesis
                    elementsInside++;
                    top = Stack.peek();
                    //pop the elements until an open parenthesis is found
                    Stack.pop();
                }
                //if this count is less than or equal to 1
                //then the brackets are redundant else not
                if (elementsInside < 1) {
                    return true;
                }
            }
            //if the current element is not a close parenthesis, then keep pushing it to the stack
            else {
                Stack.push(ch);
            }
        }
        //no duplicates found
        return false;
    }
}
