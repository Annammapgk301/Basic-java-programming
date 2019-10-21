package array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class greatest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i,big=0;
		int n=Integer.parseInt(br.readLine());
		System.out.print("Enter an array");
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
		System.out.println("big is"+big);

	}

}
