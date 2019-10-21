package controlstructure;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class amstrong {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter thwe number");
		int n=Integer.parseInt(br.readLine());
		int ams=0,b=n,r;
		while(n>0)
		{
			r=n%10;
			ams=(r*r*r)+ams;
			n=n/10;
		}
		if(b==ams)
		{
			System.out.println("amstrong");
		}
		else
		{
			System.out.println("notamstrong");
		}
	}
}
