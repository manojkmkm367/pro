
import java.util.Scanner;

public class divid2part21 {
public static void main(String argh[])throws Exception
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=in.nextInt();
	System.out.println("Enter the elements");
	int i,j,temp,n1,sum=0,sum1=0,s,s1;
	int num[]=new int[10];
	for(i=0;i<n;i++)
	{
		num[i]=in.nextInt();
	}
	n1=n/2;
	for(i=0;i<n1;i++)
	{
		sum=sum+num[i];
	}
	for(i=n1;i<n;i++)
	{
		sum1=sum1+num[i];
	}
	s1=sum1/(n1+1); s=sum/n1;
	if(s1==s)
	{System.out.println("Possible");
	for(i=0;i<=n1;i++)
		System.out.print(num[i]+" ");
	System.out.print(",");
	for(i=n1+1;i<n;i++)
		System.out.print(num[i]+" ");
	
	}
	else
	System.out.println("Not Possible");
	}
	
}
