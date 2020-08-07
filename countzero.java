
public class countzero {
	public static void main(String[] args) {
		int n=1000042,digit=0,count=0;
		while(n!=0)
		{
			digit=n%10;
			n=n/10;
			if(digit==0)
			count++;
		}
			System.out.println("Number of zeros =" +count);
	}

}
