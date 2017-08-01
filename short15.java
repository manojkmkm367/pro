import java.util.Scanner;

public class short15 {
	public static void main(String argh[])throws Exception
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=in.nextInt();
	System.out.println("Enter the elements");
	int i,j,temp;
	int num[]=new int[10];
	for(i=0;i<n;i++)
	{
		num[i]=in.nextInt();
	}
	for(i=0;i<n;i++)
	{for(j=i+1;j<n-1;j++)
	{
	if(num[i]<=num[j])
	{
		temp=num[i];
		num[i]=num[j];
		num[j]=temp;
	}
	}
	}
	System.out.println("Result :  ");
	for(i=0;i<n;i++)
	{
		System.out.println(num[i]);
	}
	
	}
	
}
