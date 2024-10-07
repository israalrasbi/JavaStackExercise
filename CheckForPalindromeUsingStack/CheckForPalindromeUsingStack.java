import java.util.Scanner;
import java.util.Stack;

public class CheckForPalindromeUsingStack {
    public static void main(String[] args) {
        //take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        //print result
        System.out.println("Is the string palindrome? " + isPalindrome(str));

    }

    public static boolean isPalindrome(String str) {
        //initialize the stack
        Stack<String>stack = new Stack<>();

        //iterate through the string
        for(int i=0;i<str.length();i++) {
            //add the elements to the stack
            stack.push(String.valueOf(str.charAt(i)));
        }
        //define a variable reverse, to store the reverse of the string
        String reverse = "";

        //while the stack is not empty, reverse the string
        while(!stack.isEmpty()) {
            reverse += stack.pop();
        }

        //if the string and the reverse are the same then it's palindrome
        if(str.equals(reverse)) {
            return true;
        }
        //otherwise, return true
        return false;
    }
}
