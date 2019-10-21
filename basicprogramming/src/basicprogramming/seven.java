package basicprogramming;
import java.util.Scanner;

public class seven {

	public static void main(String[] args) {
		System.out.println("Enter name");
		Scanner s=new Scanner(System.in );
		String name=s.nextLine();
		System.out.printf("%s",name);
		System.out.println("Enter college");
		String college=s.nextLine();
		System.out.printf("%s",college);
		System.out.println("Enter department");
		String department=s.nextLine();
		System.out.printf("%s",department);
		System.out.printf("Enter age");
		int age=s.nextInt();
		System.out.printf("%d",age);
		s.close();
		
		
		// TODO Auto-generated method stub

	}

}
