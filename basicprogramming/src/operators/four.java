package operators;
import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers to be sorted");
		int a=s.nextInt();
		int b=s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.printf("value of a is %d",a);
		System.out.printf("value of b is %d", b)
		
		// TODO Auto-generated method stub

	}

}
