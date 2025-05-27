package Ram;

public class Noss {

	public static void main(String[] args) {
		int n= 123;
		for (int i=0;i<=n;i++) {
			int rem=n%10;
			n=n/10;
			System.out.print( rem );
		}
System.out.print(n);
	}

}
