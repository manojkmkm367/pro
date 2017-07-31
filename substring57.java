import java.io.*;
public class substring57 {
public static void main(String args[])throws IOException
{
	String one,two;
	int i,j,flag=0;
	char a,b,a1,b1;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the first one");
	one=br.readLine();
	System.out.println("Enter the second two");
	two=br.readLine();
	char[]ch1=one.toCharArray();
	char[]ch2=two.toCharArray();
	int n=one.length();
	int n1=two.length();
	for(i=0;i<n-1;i++)
	{
		a=ch1[i];a1=ch1[i+1];
		for(j=0;j<n1-1;j++)
		{
			b=ch2[j];	b1=ch2[j+1];
			if((a==b)&&(a1==b1))
			{
				 flag=1;
					System.out.println("substring of A is substring of B");
				System.exit(0);
				}
		}	
	}
			if(flag==0)
			{
				System.out.println("No sub strings present");
				
			}
      }
	}
