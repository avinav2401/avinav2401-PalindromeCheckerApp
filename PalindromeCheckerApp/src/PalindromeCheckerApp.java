/*
This class will print the details of the App.
* @author Avinav priyadrshi
* @Version 10.0
*
* */
import java.util.*;
public class PalindromeCheckerApp {



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word : ");
       String wrd=sc.nextLine();
        PalindromeService ps=new PalindromeService();
        boolean isPalindrome=ps.checkPalindrome(wrd);
        if(isPalindrome)
            System.out.println("word is Palindrome");
        else
            System.out.println("word is not Palindrome");

    }
}
class PalindromeService
{
    public boolean checkPalindrome(String input)
    {
        int start =0;
        int end=input.length()-1;
        while(start<end)
        {
            if(input.charAt(start)!=input.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}