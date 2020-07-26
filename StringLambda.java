import java.util.*;
import java.util.function.*;
public class StringLambda
{
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
   for(String i :list)
   {
	// for each string in the list using predicate lambda that checks whether the string starts with 'a' and has exactly 3 letters   
   Predicate<String>st= (s)->{if(s.startsWith("a") && s.length()==3) return true; return false;};
   if(st.test(i))
   {
	   System.out.println(i);
   }
   
   }
   sc.close();
}
}
