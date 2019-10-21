package controlcflstructure;
import java.util.Scanner;
public class hcflcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		s.close();
		int min=(a<b?a:b);
		int i;
		for(i=min;i>=1;i--)
		{
			if(a%i==0 && b%i==0)
			{
System.out.print(i);
break;
			}
			
		
		}
		int j;
		int max=(a>b?a:b);
		for(j=max;j<=(a*b);j++)
		{
			if(j%a==0 && j%b==0)
			{
				System.out.print(j);
				break;
			}
		}
				

	}

}
