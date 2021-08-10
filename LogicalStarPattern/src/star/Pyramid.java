package star;

public class Pyramid {
public static void main(String[] args) {
/*            *          1
		    * * *        3
		  * * * * *      5
		* * * * * * *    7Star        */ 
	for(int i=1;i<=4;i++)
	{
		for(int j=3;j>=i;j--){
			System.out.print(" "+" ");
		}
		for(int j=1;j<=i;j++){
			System.out.print("*"+" ");
		}
		for(int j=2;j<=i;j++){
			System.out.print("*"+" ");
		}
		System.out.println();
	}
}
}
