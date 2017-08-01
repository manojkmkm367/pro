import java.util.Scanner;

public class seed17 {
	public static void main(String argh[])throws Exception
	{
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	System.out.println("Enter the seed number");
	int b=in.nextInt();
	int c=a,tot=a,digit,i=0,j;
	int digits[]=new int[10];
	while(c>0)
	{
		digit=c%10;
		c=c/10;
		digits[i]=digit;i++;
	}
	for(j=0;j<i;j++)
	{
		tot=tot*digits[j];
		
	}
	if(tot==b)
	System.out.println(a+" is a seed of "+b);
	else
		System.out.println(a+" is not a seed of "+b);
	}
}
