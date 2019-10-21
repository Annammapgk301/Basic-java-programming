package decision;
import java.util.Scanner;
public class one {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter then number");
		int a=s.nextInt();
		if(a%2==0)
		{
			System.out.print("a is an even number");
		}
		else
		{
			System.out.print("A is an odd number ");
		}

	}

}
