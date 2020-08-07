import java.util.Scanner;
public class reverse {
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter number:");        
			int num=in.nextInt();
			int r=0;
			while(num != 0) {
	            int digit = num % 10;
	           r= r*10 + digit;
	            num =num/ 10;
	        }
			System.out.println("The reverse of a number =" +r);



		}
}
