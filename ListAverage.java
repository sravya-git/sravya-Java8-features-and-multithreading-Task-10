import java.util.function.*;
import java.util.*;

public class ListAverage{

	public static void main(String args[])
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements in the list:");
		int n=sc.nextInt();
		System.out.println("enter the elements:");
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextInt());
		}
	   BiFunction<ArrayList<Integer>,Integer,Double> func=(list,size)->{ Double sum=0.0; for(int i: list) sum+=i; return sum/(double)size;};
	   System.out.println(func.apply(al,n));
	   sc.close();
	}  
}
