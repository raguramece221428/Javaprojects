package Ram;

import java.util.Arrays;

public class Anagr {

	public static void main(String[] args) {
		String a="ram";
		String b="amr";
		char[] c=a.toCharArray();
		char[] d=b.toCharArray();
Arrays.sort(c);
Arrays.sort(d);
		
		if(Arrays.equals(c,d)) {
			System.out.println("ana");
}
		else {
			System.out.println(d);
		}
		}
}
