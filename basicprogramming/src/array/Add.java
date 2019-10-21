package array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Add {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size");
		int n=Integer.parseInt(br.readLine());
		int[] a=new int[n];
		
		int[] b=new int[n];
		int i,j;
		System.out.print("enter two arrays");
		
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		System.out.print("enter two arrays");
		
		for(j=0;j<n;j++)
		{
			b[j]=Integer.parseInt(br.readLine());
		}
		for(j=0;j<n;j++)
		{
			System.out.print(a[j]+b[j]);
		}
		

	}

}
