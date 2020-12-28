package course;

import java.util.Scanner;

public class PKB {
	
	public static void PkbForYears(int a[])
	{
		for(int i = a.length - 1; i >= 0; i-- )
		{
			System.out.println(a[i]);
		}
		
		
	}
	
	public static void PkbForYear(int a[])
	
	{
		Scanner read = null;
		int rok = 0;
		try
		{
			read = new Scanner(System.in);
			System.out.println("PKB z roku?");
			rok = read.nextInt();	
		}
		finally
		{
			if(read !=null) {
				read.close();
			}
				
		}
		if(rok == 2009)
		{
			System.out.println(a[9]);
		}
		else if(rok == 2008)
		{
			System.out.println(a[8]);
		}
		else if(rok == 2007)
		{
			System.out.println(a[7]);
		}
		else if(rok == 2006)
		{
			System.out.println(a[6]);
		}
		else if(rok == 2005)
		{
			System.out.println(a[5]);
		}
		else if(rok == 2004)
		{
			System.out.println(a[4]);
		}
		else if(rok == 2003)
		{
			System.out.println(a[3]);
		}
		else if(rok == 2002)
		{
			System.out.println(a[2]);
		}
		else if(rok == 2001)
		{
			System.out.println(a[1]);
		}
		else if(rok == 2000)
		{
			System.out.println(a[0]);
		}
		else System.out.println("Error podano z³y rok.");
	}
	
	public static void PkbHighest(int a[])
	{
		int max = a[0];
		for(int i=1; i < a.length; i++ )
		{
			if(max < a[i])
			{
				max = a[i];
			}
			
		}
		System.out.println(max);
	}
	public static void PkbLowest(int a[])
	{
		int min = a[0];
		for(int i=1; i < a.length; i++ )
		{
			if(min > a[i])
			{
				min = a[i];
			}
			
		}
		System.out.println(min);
	}
	
	public static void PkbAverage(int a[])
	{
		int sum = 0;
		int average = 0;
		
		for(int i=0; i < a.length; i++ )
		{
			sum += a[i];
		}
		average = sum/a.length;
		System.out.println(average);
	}
	
	public static void main(String[] args) {
		
		int PKB[] = {19527, 20391, 21203, 22148, 24438, 25955, 28056, 31158, 33741, 35966};
		PkbAverage(PKB);
	}
}
