package decision;
import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String option=s.nextLine();
		String rice=s.nextLine();
		
		if(option.equals("veg"))
		{
			if(rice.equals("friedrice"))
			{
				System.out.print("friedrice is available");
			}
			else
			{
				System.out.print("friedrice not available");
			}
		}


	else
	{
		System.out.print("veg is  not avilable");
	}
}
}