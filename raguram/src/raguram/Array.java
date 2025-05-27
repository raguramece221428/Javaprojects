package raguram;

public class Array {

	public static void main(String[] args) {
		
		        int[] a = {1, 2, 2, 3, 2, 5, 4, 6, 5, 4, 7, 7 , 89};

		        // Find the maximum value to size the frequency array
		        int max = a[0];
		        for (int i = 1; i < a.length; i++) {
		            if (a[i] > max) {
		                max = a[i];
		            }
		        }

		        // Frequency array
		        int[] freq = new int[max + 1];

		        // Count frequencies
		        for (int i = 0; i < a.length; i++) {
		            freq[a[i]]++;
		        }

		        // Print frequencies
		        for (int i = 0; i < freq.length; i++) {
		            if ( freq[i] > 0) {
		                System.out.println(i + " " + freq[i]);
		            }
		        }
		    

	}

}
