package decision;
import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int year=s.nextInt();
s.close();
if(year%4==0)
{
if(year%100==0)
	{
	if(year%400==0)
			System.out.println("leap year");
	
else

	System.out.println("not leap year");

	}
	else
	{
		System.out.println("leap year");
	}
}
else
{
	System.out.println("not leap year");
}
}
}


