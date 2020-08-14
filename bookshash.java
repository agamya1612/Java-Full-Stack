package com.mypack.countries;
import java.util.*;
public class bookshash {

	public static void main(String[] args) {
		HashSet<books> hs=new HashSet<>();

		books b1=new books("Harry Potter","JK Rowling", 10023);
		books b2=new books("3 Mistakes of My life","Chetan Bhagat", 10124);
		books b3=new books("Five Point Someone","Chetan Bhagat", 10125);
		books b4=new books("Half Girlfriend","Chetan Bhagat", 10126);
		books b5=new books("Letters in The Rain","Anubhav Singh", 103323);
		books b6=new books("Five Point Someone","Chetan Bhagat", 10125);
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		hs.add(b4);
		hs.add(b5);
		hs.add(b6);

		Iterator<books> itr=hs.iterator();
		
		while(itr.hasNext())
		{
		itr.next().dispbooks();
		}
		/*for(books bk:hs)
		{
		bk.dispbooks();
		}*/
	}

}
