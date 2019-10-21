package controlstructure;
import java.util.Scanner;
public class fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
int a=0,b=1,i;
System.out.printf("%d %d",a ,b);
for(i=3;i<=n;i++)
{
	int c=a+b;
System.out.printf(" %d ", c);
a=b;
b=c;
}

	}

}
