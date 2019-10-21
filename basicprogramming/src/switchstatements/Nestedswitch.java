package switchstatements;
import java.util.Scanner;
public class Nestedswitch {

	public static void main(String[] args) {
		// branch can be C,E,M;
		Scanner s=new Scanner(System.in);
		System.out.printf("enter year");
		int collegeyear=s.nextInt();
		switch(collegeyear)
		{
		case 1:
			System.out.printf("english, malayalam ,maths");
			break;
		case 2:
			System.out.printf("enter branch");
			char branch=s.next().charAt(0);
			switch(branch)
			{
			case 'c':
				System.out.printf("os ,java,ds");
				break;
			case 'e':
				System.out.printf("es,is");
				break;
			case 'm':
				System.out.printf("drawing,mm");
				break;
			
				default:
					System.out.printf("invalid input");
					break;
			}
			break;
		default:
				System.out.printf("invalid year");
				break;
		}
		//break;
	}
	}

				
				

			
		
		
		

	


