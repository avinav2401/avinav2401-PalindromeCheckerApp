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
        System.out.println("Enter a word : ");
        String wrd=sc.nextLine();
        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeStrategy twoPointerStrategy = new TwoPointerStrategy();

        System.out.println("\n--- UC13: Performance Comparison ---");

        long startTimeStack = System.nanoTime();
        boolean res1 = stackStrategy.check(wrd);
        long endTimeStack = System.nanoTime();
        long durationStack = endTimeStack - startTimeStack;

        long startTimeTP = System.nanoTime();
        boolean res2 = twoPointerStrategy.check(wrd);
        long endTimeTP = System.nanoTime();
        long durationTP = endTimeTP - startTimeTP;

        System.out.println("1. Stack Strategy       | Result: " + res1 + " | Time: " + durationStack + " ns");
        System.out.println("2. Two-Pointer Strategy | Result: " + res2 + " | Time: " + durationTP + " ns");

        System.out.println("\nPerformance Gap: " + (durationStack - durationTP) + " ns");


    }
}
interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        String str = input.toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) stack.push(c);
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

class TwoPointerStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        String str = input.toLowerCase();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) return false;
        }
        return true;
    }
}