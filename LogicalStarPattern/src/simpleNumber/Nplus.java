package simpleNumber;

public class Nplus {
public static void main(String[] args) {
/*      1
		23
		456
		78910          */
	
	int k=0;
	for(int i = 1; i <=4; i++)
	{
		for(int j = 1; j <=i; j++) 
		{		k++;
			System.out.print(k);
			
		}
		System.out.println();
	}
}
}
