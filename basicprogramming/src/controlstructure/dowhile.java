package controlstructure;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class dowhile {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int  i,sum=0,n;
		do
		{
			System.out.println("Enter number");
			 n=Integer.parseInt(br.readLine());
			if(n>0)
			{
				sum=sum+n;
			}
			
			}while(n>0);
		System.out.print(sum);
		}
}
