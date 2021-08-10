package simpleNumber;

public class N4 {
public static void main(String[] args) {
/*  54321         11111
	5432		  2222
	543			  333
	54			  44
	5			  5                         */
	for (int i = 1; i <=5; i++) 
	{
		for (int j = 5; j >=i; j--) 
		{
			System.out.print(j);
		}
		System.out.println();
	}
//Another pattern
	for (int i = 1; i <=5; i++) 
	{
		for (int j = 5; j >=i; j--) 
		{
			System.out.print(i);
		}
		System.out.println();
	}	
}
}
