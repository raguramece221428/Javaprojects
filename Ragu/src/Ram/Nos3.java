package Ram;

public class Nos3 {

	public static void main(String[] args) {
	StringBuilder sb= new StringBuilder("120");
//String s= "";

    
     
			 
		StringBuilder b= new StringBuilder(sb.reverse());
		if(b.charAt(0)-'0'==0) // b.charat(0)== 0"48" , 48-48=0 {b.charat(0)-'0'} or '0'-'0'
		{ // s= b.substring(1,b.length());
			System.out.println(b.substring(1));
		}
		else {
	System.out.println(b);
		}
	}
	
}
