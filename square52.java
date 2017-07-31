import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class square52 {
public static void main(String argh[]) throws NumberFormatException, IOException
{
	int a1,a2,a3,a4,b1,b2,b3,b4,a,b,c,d;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a1& b1");
	a1=Integer.parseInt(br.readLine());b1=Integer.parseInt(br.readLine());
	System.out.println("Enter a1& b2");
	a2=Integer.parseInt(br.readLine());b2=Integer.parseInt(br.readLine());
	System.out.println("Enter a2& b1");
	a3=Integer.parseInt(br.readLine());b3=Integer.parseInt(br.readLine());
	System.out.println("Enter a21& b2");
	a4=Integer.parseInt(br.readLine());b4=Integer.parseInt(br.readLine());
	a=a1-a3; c=b1-b3;
	b=a2-a4; d=b2-b4;
	a=Math.abs(a);b=Math.abs(b);c=Math.abs(c);d=Math.abs(d);
	if(a==b && b==c && c==d && d==a)
	{
		if(a1==a2 && a3==a4)
	System.out.println("square");
		else
			System.out.println(" Not a square");
	}
	else
		System.out.println(" Not a square");
}
}
