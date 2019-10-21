package decision;
import java.util.Scanner;
public class leap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int y=s.nextInt();
		s.close();
		if(y%4==0 && y%100!=0 || y%400==0 )
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
	}

}
