/*
This class will print the details of the App.
* @author Avinav priyadrshi
* @Version 1.0
*
* */
import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word : ");
        String wrd=sc.nextLine(),temp = "";
        LinkedList<Character> list=new LinkedList<>();
        for(char c: wrd.toCharArray())
        {
            list.add(c);
        }
        boolean isPalindrome=true;
        while(list.size()>1)
        {
            if(list.removeFirst()!=list.removeLast())
            {
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome)
            System.out.println("word is Palindrome");
        else
            System.out.println("word is not Palindrome");

    }
}