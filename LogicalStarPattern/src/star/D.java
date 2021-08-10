package star;

public class D {
	public static void main(String[] args) {
		/*
			      * 
			    * * 
			  * * * 
			* * * * 

		*/
	for(int i=1;i<=4;i++)             //rows are constant
	{
		for(int j=3;j>=i;j--)              //For spaces in column
		{
			System.out.print(" "+" ");
		}
		for(int j=1;j<=i;j++)				//For column to print *
		{
			System.out.print("*"+" ");
		}
		System.out.println();
	}
}
}
