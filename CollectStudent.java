import java.io.BufferedReader;
import java.io.DataInput;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class CollectStudent {
public static void main(String[] args){
	String stud=null;
	ArrayList<Student> s=new ArrayList<Student>();
	int a,b,c,d;
	try {
			FileReader rd=new FileReader("data.txt");
			BufferedReader br=new BufferedReader(rd);
			 br.readLine();
			 String str = br.readLine();
			
			 while(str!=null) {
			 str=str.trim();
			 String[] arr=str.split(",");
			 a=Integer.parseInt(arr[0]);
			 b=Integer.parseInt(arr[1]);
			 c=Integer.parseInt(arr[4]);
			 d=Integer.parseInt(arr[5]);
			 Student s1 = new Student(a,b,arr[2],arr[3],c,d);
			 s.add(s1);
			 str=br.readLine();
			 }
			 for(Student s2:s){
			 System.out.println(s2);
			 }
			 }
			
		catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}
	}
	
	


}

