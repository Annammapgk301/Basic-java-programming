package basicprogramming;
import java.util.Scanner;
public class eleven {

	public static void main(String[] args) {
		System.out.print("Enter the floatnum");
		
		Scanner s=new Scanner(System.in);
		float num=s.nextFloat();
		System.out.printf("%.000f",num);
		System.out.printf("\n%.1f",num);
		System.out.printf("\n%.2f",num);
		System.out.printf("\n%.3f",num);

	}

}
