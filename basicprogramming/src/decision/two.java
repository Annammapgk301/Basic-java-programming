package decision;
import java.util.Scanner;
public class two
{

	public static void main(String[] args) {
		System.out.print("Enter three numbers");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b && a>c)
		{
			System.out.print("a is greater");
		}
		else if(b>a && b>c) 
		{
			System.out.print("b is greter");
		}
		else
		{
			System.out.print("c is greater");
		}
	}
}	