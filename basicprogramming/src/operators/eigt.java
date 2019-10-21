package operators;
import java.util.Scanner;
public class eigt {

	public static void main(String[] args) {
		System.out.print("Enter the coordinates");
		Scanner s=new Scanner(System.in);
		int x1=s.nextInt();
	    int x2=s.nextInt();
	    int y1=s.nextInt();
	    int y2=s.nextInt();
	    int x=x1+x2/2;
        int y=y1+y2/2;
        System.out.printf("midpoint is %d %d",x,y);

	}

}
