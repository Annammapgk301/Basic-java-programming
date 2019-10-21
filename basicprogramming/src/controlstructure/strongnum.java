package controlstructure;
import java.util.Scanner;
public class strongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		s.close();
		int f,i=1,sum=0,t=num,r;
		while(num>0)
		{
			f=1;
			r=num%10;
			for(i=1;i<=r;i++)
			{
			f=f*i;
			}
			sum=sum+f;
			num/=10;
		}
			if(sum==t)
			{
				System.out.println("strong");
			}
			else
				System.out.println("not strong");
		}

	}


