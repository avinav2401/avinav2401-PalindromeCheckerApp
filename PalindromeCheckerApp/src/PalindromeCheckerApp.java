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
       String wrd=sc.nextLine(),normalized=wrd.replaceAll(" ","").toLowerCase();;

        boolean isPalindrome=true;

        for(int i=0;i<normalized.length();i++)
        {
            if(normalized.charAt(i)!=normalized.charAt(normalized.length()-1-i))
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