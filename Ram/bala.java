package Ram;
import java.util.Arrays;
import java.util.Scanner;

public class bala {

	public static void main(String[] args) {
		System.out.println("ENTER A STRING :");
		Scanner sc = new Scanner(System.in);
		String a= sc.nextLine();
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{ char c=a.charAt(i);
		b = b+c;
		
					}
		System.out.println(b);
		if(a.equals(b))
		{System.out.println("palindrome");
		}
		else
		{System.out.println("not palindrome");}
		
		sc.close();
		}
		
	}


