package Ram;

import java.util.Arrays;

public class Nos2 {

	public static void main(String[] args) {
		int n= 123;
	String str= Integer.toString(n);
	
			char[] b = str.toCharArray();
			for(int i=b.length-2;i>=0;i--){
				System.out.print(b[i]);
			}
		//System.out.print(Arrays.toString(b));
	}

}
