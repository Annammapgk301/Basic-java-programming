package array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class secondlarge {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array");
		int n=Integer.parseInt(br.readLine());
		int i,c=0,big=0;
		System.out.println("Enter the array");
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
	
		}
		for(i=0;i<n;i++)
		{
			if(a[i]>big)
			{
				big=a[i];
			}
		}
		for(i=0;i<n;i++)
		{
			if(a[i]<big && big>=c)
			{
				c=a[i];
			}
		}
		System.out.print(c);
	}

}
