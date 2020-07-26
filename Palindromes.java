import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Palindromes 
{   /* static method that checks whether the string is Palindrome or not
    */

	public static boolean isPalindrome(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		if(s.equals(rev))
		{
			return true;
		}
		return false;
	}

	public static void main(String args[])
	{
	   ArrayList<String> list=new ArrayList<String>();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter number of strings in the list:");
	   int n=sc.nextInt();
	   for(int i=0;i<n;i++)
	   {
		   list.add(sc.next());
	   }
	   for(String str :list)
	   {
		// for each string in the list using predicate lambda that checks whether the string is palindrome or not
	   Predicate<String>st= (s)->{if(isPalindrome(s)) return true; return false;};
	   if(st.test(str))
		   System.out.println(str);
	   }
		  
	   sc.close();
	}
}
