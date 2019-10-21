package switchstatements;
import java.util.Scanner;
public class Fallthrough
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int t=0;
int m=n%10;
int a=n/10;
if(a!=1)
{
	switch(m)
	{
	case 1:
	case 2:
	case 6:
	case 10:
		t=t+3;
	break;
	case 4:
	case 5:
	case 9:
		t=t+4;
		break;
	case 3:
	case 7:
	case 8:
		t=t+5;
		break;
	}
	switch(a)
	{
	case 2:
	case 3:
	case 4:
	case 8:
	case 9:
		t=t+6;
		 break;
	case 5:
	case 6:
		t=t+5;
	case 7:
		t=t+7;
		break;
		}
	}
	
	else
	{
		switch(m)
		{
		case 1:
		case 2:
			t=t+6;
			break;
		case 3:
		case 4:
	    case 8:
		case 9:
			t=t+8;
			break;
		}
	}
	System.out.println(t);
}
}		

		
	
	








	

