package com.mypack.countries;
import java.util.Vector;
public class vectorexample {

public static void main(String[] args) {
Vector<Integer> marks=new Vector<Integer>(5);

marks.add(50);
marks.add(60);
marks.add(70);
marks.add(80);
marks.add(90);

int x=11;
marks.add(x);//auto boxing

System.out.println(marks);
System.out.println(marks.size());
System.out.println(marks.capacity());
}
}