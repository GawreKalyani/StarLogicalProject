package star;

public class Dia2 {
public static void main(String[] args) {
/*	    *
	   *
	  *
	 *                      */
	for(int i=1;i<=4;i++)
	{
		for(int j=4;j>=i;j--)
		{
			if(i==j)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
