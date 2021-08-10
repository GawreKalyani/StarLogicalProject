package blockAddition;

public class BB {
/*j=  1   2     3   4   5
i=1	  1   2    3    4   5 
i=2   6   7    8    9   10
i=3	 11  12   13   14   15
i=4	 16  17   18   19   20
i=5	 21  22   23   24   25
	                               //if((i>=0 && i<=1)&&(j>=0 && j<=1))
*/
	public static void main(String[] args) {
	int sumB=0;
	int k=0,sumA=0,sumC=0,sumD=0,plus=0,neE=0;
	for(int i=1;i<=5;i++){
	
		for(int j=1;j<=5;j++)
		{k++;

		if((i>=1 && i<=2)&&(j>=1 && j<=2))	
			sumA=sumA+k;
		if((i>=1 &&i<=2)&&(j>=4 && j<=5))	
			sumB=sumB+k;
		if((i>=4 && i<=5)&&(j>=1 && j<=2))	
		sumC=sumC+k;
		if((i>=4 && i<=5)&&(j>=4 && j<=5))	
		sumD=sumD+k;
		if(i==3 || j==3)
			plus+=k;
		if((i>=2 && i<=4)&&(j>=2 && j<=4))
			neE+=k;
		}
		System.out.println();
	}
	System.out.println("Block A (1,2,6,7): "+sumA);
	System.out.println("Block B (4,5,9,10): "+sumB);
	System.out.println("Block C (16,17,21,22): "+sumC);
	System.out.println("Block D (19,20,24,25): "+sumD);
	System.out.println("Middle plus(11,12,13,14,15,8,18,23,3): "+plus);
	System.out.println("Mid Square(7,8,9,12,13,14,17,18,19): "+neE);
}

}
