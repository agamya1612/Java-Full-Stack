
public class employee 
{
	String empname;
	int empid;
	String empmail;
	int empage;
	int salary;
	
	void init(String ename,int eid,String email,int a,int s)
	{
		empname=ename;
		empid=eid;
		empmail=email;
		empage=a;
		salary=s;
	}
	void disp(){
	System.out.println(empname);
	System.out.println(empid);
	System.out.println(empmail);
	System.out.println(empage);
	System.out.println(salary);
	}
	public static void main(String[] args) {
	employee e=new employee();
	employee e1=new employee();
	employee e2=new employee();
	employee e3=new employee();
	e.init("Agamya", 110, "agamya@dxc", 22, 60000);
	e.disp();
	e1.init("Ashay", 111, "aashay@dxc", 22, 50000);
	e1.disp();
	e2.init("kushagra", 112, "kush@dxc", 24, 50000);
	e2.disp();
	e3.init("Gaurav", 113, "bhakru@dxc", 25, 40000);
	e3.disp();
	
	}

}
