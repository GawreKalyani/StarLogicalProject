package string;

public class String12 {
	public static void main(String[] args) {
		// Hello between 2 to 4
		String s = "Hello";
		//char str[] = s.toCharArray(); // {'H','e','l','l','o'}
		int vcounter = 0, cont = 0;
		
		int i = 0;
		
		for (i = 0; i < s.length(); i++) {
			char ch = s.charAt(i); // ch='H'
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u') 
			    {
             		vcounter++;
			 } else 
			 { 
				cont++;
			}
		}
		char vowel[]=new char[vcounter];
		char constrain[]=new char[cont];
		int p=0,q=0;
		for (i = 0; i < s.length(); i++) {
			char ch = s.charAt(i); // ch='H'
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u') 
			    {
				vowel[p]=ch;
				p++;
			 } else 
			 {  
			 constrain[q]=ch;
			 q++;
			}
		}
		
		System.out.println();
		System.out.println("Vowel Array..");
		for( i=0;i<vowel.length;i++){
			System.out.print(vowel[i]+ " ");
		}

		System.out.println();
		System.out.println("Constrain Array..");
		for( i=0;i<constrain.length;i++){
			System.out.print(constrain[i]+ " ");
		}
		
	}
}
//String ss="Hello"
// Vowel[]: e o
//Constrain[]: H l l