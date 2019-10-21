package controlstructure;
import java.util.Scanner;
public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int a=0,b=1,f=0,i,c;
		if(t==0 ||t==1)
		{
			System.out.println("yes");
			
		}
for(i=0;i<=100;i++)
{
	c=a+b;
	if(c==t)
	{
		f++;
	}
	a=b;
	b=c;
}
if(f!=0)
{
System.out.print("yes");
}
else
{
	System.out.print("no");
}
}
}