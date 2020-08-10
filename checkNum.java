
public class checkNum {
	boolean isNum(String str){
		char[] arr=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
		if(arr[i]>='0' && arr[i]<='9')
		return true;
	
		}
		
		return false;
		}
public static void main(String[] args) {

		checkNum first=new checkNum();
		System.out.println(first.isNum("String!"));
		}
		}
