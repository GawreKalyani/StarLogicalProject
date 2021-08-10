package star;

public class C {
	public static void main(String[] args) {
/*
			* 
			* * 
			* * * 
			* * * * 
			* * * 
			* * 
			*
*/
		for(int i=1;i<=4;i++)   //rows are constant
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	for(int i=1;i<=4;i++)   //rows are constant
	{	
		for(int j=3;j>=i;j--)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
	}
}

}
