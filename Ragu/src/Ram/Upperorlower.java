package Ram;


public class Upperorlower {

	public static void main(String[] args) {
		String a="a2d3f4s";
		String b="";
		for(int i=0;i<=a.length();i++)
		{
			if(Character.isAlphabetic(a.charAt(i)))
			{

System.out.println(a.charAt(i));
				}
			else
{   int num=Character.getNumericValue(a.charAt(i));
         //int num=Integer.parseInt(a);
         for(int j=1;j<num;j++) {
        	System.out.println(a.charAt(i+1));
        	
         }
         
			}
				}

	}

}
