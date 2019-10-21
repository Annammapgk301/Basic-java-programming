package decision;
import java.util.Scanner;
public class six {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String group=s.nextLine();
		String group1=s.nextLine();
		if(group.equals("A"))		
		{
			if(group1.equals("A+"))
			{
				System.out.print("group is A+");
			}
				
			else
			{
				System.out.print("group is A-");
			}
		}
			else if(group.equals("B"))
			{
				if(group1.equals("B+"))
				{
					System.out.print("group is B+");
					
				}
				else
				{
					System.out.print("group is B-");
					
			}
		}
		
		
		
		
		

	}

}
