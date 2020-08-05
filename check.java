
public class check 
{
	public static void main(String args[])
	{
		char c='w';
		if(!(c>=65&&c<=90 || c>=97&&c<=122 ))
		{
			System.out.println("Invalid Alphabet");
		}
		else {
		if(c<=90&&c>=65)
			System.out.println("Charcter is in Capital Case" +" " +c);
		else 
			System.out.println("Charcter is in Small Case" +" "+c);
		}
		
			
	}

}
