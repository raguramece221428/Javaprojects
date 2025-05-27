package Ram;

public class Piglatin {
	public static void main(String[] args) {
		String a="raean";
		char[] e=a.toCharArray();
		char ch=a.charAt(0);
		String d="";
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println(a+"way");
		}
		else {
			for(int i=0;i<a.length();i++) {
				char v=a.charAt(i);
				if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u')
				{
					 d= a.substring(i)+ a.substring(0,i)+"ay";
					// System.out.println(d);
				}
				//System.out.println(d);
			}
			System.out.println(d);
		}
	}


}
