package blockAddition;

public class BlockABCD {
public static void main(String[] args) {
	int k=0;
	int plusSum=0;
	int sumA=0;
	int sumB=0;
	int sumC=0;
	int sumD=0;
	int eSum=0;
	int sumAA=0;
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{k++;
			if( i<=1 && j<=1)
			{System.out.println(k);
				sumA=sumA+k;   //1+2+6+7=16                     Sum of A block.... 16
			}
			if( i<=1 && j>=3)
			{System.out.println(k);
				sumB=sumB+k;   //4+5+9+10=28                     Sum of B block.... 28
			}
			if( i>=3 && j<=1)
			{System.out.println(k);
				sumC=sumC+k;   //16+17+21+22=76                  Sum of C block.... 76
			}
			if( i>=3 && j>=3)
			{
				sumD=sumD+k;   //19+20+24+25=88                  Sum of D block.... 88
			}
			if(i==2 || j==2)
			{
				plusSum=plusSum+k;  //3+8+13+18+23+11+12+14+15=117
			}
			if((i>=1 && i<=3) && (j>=1 &&  j<=3))
			{
				eSum=eSum+k;	//7+8+9+12+13+14+17+18+19=117
			}
			if((i>=0 && i<=1)&&(j>=0 && j<=1))
			{
				sumAA=sumAA+k;	//sameA
			}
		}
		System.out.println();
	}
	System.out.println("Sum of A block.... "+sumA);
	System.out.println("Sum of B block.... "+sumB);
	System.out.println("Sum of C block.... "+sumC);
	System.out.println("Sum of D block.... "+sumD);
	System.out.println("Sum of Plus Element..."+plusSum);
	System.out.println("Sum of E block..." +eSum);
	System.out.println("Another Way to add elements of BlockA"+sumAA);
}
}
// 1  2   3  4  5
// 6  7   8  9  10
//11  12  13 14  15
//16  17  18 19  20
//21  22  23  24  25
//Block A=1+2+6+7=16 