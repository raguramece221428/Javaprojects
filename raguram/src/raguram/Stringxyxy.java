package raguram;

public class Stringxyxy {
	
	    public static void main(String[] args) {
	        String s = "XYXXYXXYX";// XYXYXYXY CRT ORDER
	        int removals = countRemovals(s);
	        System.out.println(removals);
	    }

	    public static int countRemovals(String s) {
	        int count = 0;
	        for (int i = 0; i < s.length()-1; i++) {
	            if (s.charAt(i) == s.charAt(i + 1)) {
	                count++;
	            }
	        }
	        return count;
	    }
	}


