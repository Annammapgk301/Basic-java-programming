package array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class esumosum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size");
		int n=Integer.parseInt(br.readLine());
		System.out.print("Enter an array");
		int i,s=0,t=0,ecount=0,ocount=0;
		int[] a=new int[n];
		float e,o;
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
				s=s+a[i];
				ecount++;
				
			}
		}
			for(i=0;i<n;i++)
			{
				if(a[i]%2!=0)
			{
					System.out.println(a[i]);
				t=t+a[i];
				ocount++;
			}
			}
			 e=s/ecount;
			 o=t/ocount;
			System.out.println(e);
			System.out.println(o);
	}

}
