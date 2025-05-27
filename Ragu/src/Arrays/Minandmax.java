package Arrays;

public class Minandmax {

	public static void main(String[] args) {
		int[] a= {1,25,55,45,6,75,80};
		int min = a[0];
		int max = a[0];
		int count=0;
		for(int i=1;i<a.length;i++) {
			
			if(min > a[i]) {
				
				min=a[i];
			
			}
if(max<a[i]) {
				
				max=a[i];
			
			}
			
		}
		
			System.out.println(min);// gives min trm
			System.out.println(max);// gives max trm
			
	}

}
