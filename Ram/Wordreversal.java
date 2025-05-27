package Ram;

public class Wordreversal {

	public static void main(String[] args) {
	String a="the world is blue";
		String b="";
		String[] c= a.split(" ");
		
		for(int i=c.length-1;i>=0;i--) {
		b=b+c;
		System.out.print(c[i]+ " ");
		}
		}
		

}
