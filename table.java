import java.util.Scanner;
public class table {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number:");        
		int num=in.nextInt();
		for (int i = 0; i <=10; i++) {
			int tab=num*i;
			System.out.println(num + "*" + i + "="  +tab);
			
		}
	}

}
