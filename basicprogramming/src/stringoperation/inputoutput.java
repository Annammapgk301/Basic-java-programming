package stringoperation;
import java.util.Scanner;
public class inputoutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String[] a=new String[n];
		
		int t=s.nextInt();
		int i,j;
		System.out.println("Enter the array");
		for(i=0;i<=n;i++)
		{
			a[i]=s.next();
		}
		char c;
		for(j=0;j<n;j++)
		{
			c=a[j].charAt(0);
			if(c=='a' || c=='e' || c=='i' || c=='o' ||c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
			{
				System.out.println(a[j]);
			}
			}
		s.close();
		}
}