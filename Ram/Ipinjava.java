package Ram;
import java.util.Scanner;

public class Ipinjava {

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
System.out.println("enter row");
int row= sc.nextInt();
System.out.println("enter col");
int col=sc.nextInt();
int[][] n=new int[100][100];
for (int i=0;i<row;i++)
{
	for(int j=0;j<col;j++) {
		 n[i][j]=sc.nextInt();
	}

}
for (int i=0;i<row;i++)
{
	for(int j=0;j<col;j++) {
		System.out.print(n[i][j] + " ");;
	}
	System.out.println();
}


	}

}
