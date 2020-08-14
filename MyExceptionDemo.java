
public class MyExceptionDemo {
		public static void main(String[] args) {
		BookMyShow b=new BookMyShow();
		BookMyShow b1=new BookMyShow();
	   
		try{
		b.bookTicket(4);
		b.bookTicket(2);
		b1.bookTicket(1);
		b.bookTicket(2);

		}
		catch (Exception e) {

		System.out.println(e);
		}

		System.out.println("end of main");
		}
		}
