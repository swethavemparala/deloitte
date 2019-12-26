package reverse;

public class StringReverse {

	public static void main(String[] args)
	{
		String n="computer";
		n= rever(n);
		int no=0;
		for(int i=0; i<n.length();i++)
		{if(n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='o'||n.charAt(i)=='u') {
			no++;
		}
	}
	System.out.println("Reversed String: "+n);
	System.out.println("No of Vowels in the string: "+no);
}

public static String rever(String n ) {
	String a="";
	
	for(int i=n.length()-1;i>=0;i-- ) {
		a=a+n.charAt(i);
	}
	return a;
}

	}


