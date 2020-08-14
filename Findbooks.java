package com.mypack.countries;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Findbooks {

	public static void main(String[] args) {
		books b1=new books("Harry Potter","JK Rowling", 10023);
		books b2=new books("3 Mistakes of My life","Chetan Bhagat", 10124);
		books b3=new books("Five Point Someone","Chetan Bhagat", 10125);
		books b4=new books("Half Girlfriend","Chetan Bhagat", 10126);
		books b5=new books("Letters in The Rain","Anubhav Singh", 103323);

		
		HashMap<Integer,books> Bk=new HashMap<Integer, books>();
		Bk.put(b1.getIsbn(), b1);
		Bk.put(b2.getIsbn(), b2);
		Bk.put(b3.getIsbn(), b3);
		Bk.put(b4.getIsbn(), b4);
		Bk.put(b5.getIsbn(), b5);
		
		if((args[0]).equals("all")){
			
			Set<Integer> keys=Bk.keySet();



			Iterator<Integer> itr= keys.iterator();
			while(itr.hasNext())
			{
			//System.out.println( itr.next()+ " : "+ hm.get(itr.next()));

			int key=itr.next();

			System.out.println(Bk.get(key));

			}

			}
		else
		{
		int  isbn=Integer.parseInt(args[0]);
		books b= Bk.get(isbn);
		System.out.println(b);
		}
		
		}
}
