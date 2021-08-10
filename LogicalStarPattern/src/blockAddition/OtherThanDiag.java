package blockAddition;

public class OtherThanDiag {
public static void main(String[] args) {
	int k=0,sum1=0;
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 5; j++) {
			k++;
			if(i<=1){
				if(i==0){
					if((j>i)&&(j<4))
						sum1=sum1+k;
				}
			}
		}
	}
	System.out.println("Sum1..."+sum1);
}
}
//   j=0  1  2  3  4
//i=0  1  2  3  4  5                 diag1=1+7+13+19+25;         diag2=5+9+13+17+21
//i=1  6  7  8  9  10
//i=2  11 12 13 14 15            upper(2+3+4+8=17)
//i=3  16 17 18 19 20
//i=4  21 22 23 24 25