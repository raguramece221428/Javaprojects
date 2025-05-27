package Arrays;

public class Twodigitno {

	public static void main(String[] args) {
	int[] a= {1,25,55,45,6,75,80};
	//int sum=0;
	//int product=1;
	int num;
	int count=0;
	for(int i=0;i<a.length;i++)
	{ //num = num%10;
//if(a[i]> 9 && a[i] < 100) //2digit no
		if((num=a[i]%10) ==5) //end with 5
		{//sum = sum+a[i];
	count++;
	//product= product*a[i];
	//System.out.println(sum);
			//System.out.println(Math.pow(a[i],2));
	System.out.println(Math.sqrt(a[i]));
		}

	}
	//System.out.println(count);
	}

}
