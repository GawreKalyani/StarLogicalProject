package blockAddition;

public class TwoDiagonal {
public static void main(String[] args) {
	int dia2=0,upperTri=0;
	int k=0,dia1=0,lowerTri=0;
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{	k++;

		if((i==j))	
			dia1=dia1+k;
		if(i+j==6)	
			dia2=dia2+k;
		if(i<j)
			upperTri=upperTri+k;
		if(j<i)
			lowerTri=lowerTri+k;
		}
		System.out.println();
	}
	System.out.println(dia1);
	System.out.println(dia2);
	System.out.println(upperTri);
	System.out.println(lowerTri);
	}
}
//   j=0  1  2  3  4
//i=0  1  2  3  4  5                 diag1=1+7+13+19+25;         diag2=5+9+13+17+21
//i=1  6  7  8  9  10
//i=2  11 12 13 14 15          2+3+4+5+8+9+10+14+15+20=
//i=3  16 17 18 19 20         
//i=4  21 22 23 24 25