import java.io.*;
import java.util.TreeSet;
public class pangram53 {
public static void main(String args[])throws IOException
{
	String a;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the String");
	a=br.readLine();
	a=a.toLowerCase();
	char[] ch=a.toCharArray();
	int n=ch.length;
	TreeSet<Character> tr=new TreeSet<Character>();
	for(char ch1:ch)
	{
		if(ch1>='a' && ch1<='z')
	tr.add(ch1);
	}		
	int size=tr.size();
	if(size==26)
	System.out.println("pangram");
	else
		System.out.println("not a pangram");
	
} 
	}
