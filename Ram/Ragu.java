package Ram;

import java.util.Arrays;

public class Ragu {

	
public static void main(String[] args) {
        String a = "ragu1123";
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            if (Character.isDigit(a.charAt(i))) {
                int num = Character.getNumericValue(a.charAt(i));
              sum += num;
               // System.out.println(num);
            }
        }
        System.out.println(sum);
    }
}
