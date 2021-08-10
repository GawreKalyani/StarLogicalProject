package star;

public class B {
	public static void main(String[] args) {
/*
			* * * * 
			* * * 
			* * 
			* 
*/
	for(int i=1;i<=4;i++)
	{	//rows are constant
		for(int j=4;j>=i;j--)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
	}
}
}