/*
This class will print the details of the App.
* @author Avinav priyadarshi
* @Version 10.0
*
* */
import java.util.*;
public class PalindromeCheckerApp {



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PalindromeStrategy strategy = new StackStrategy();
        System.out.println("Enter a word : ");
       String wrd=sc.nextLine();
        boolean isPalindrome = strategy.check(wrd);
        System.out.println("Input : " + wrd);
        System.out.println("Is Palindrome? : " + isPalindrome);

    }
}
interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        if (input == null) return false;
        String cleanedInput = input.toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : cleanedInput.toCharArray()) {
            stack.push(c);
        }
        for (char c : cleanedInput.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}