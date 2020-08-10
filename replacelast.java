
public class replacelast {
	
		String ReplaceLast(String str,char oldChar , char newChar)
		{
		char[] arr=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--){
		
		if(arr[i]==oldChar)
		{
			arr[i]=newChar;
			break;
		}
		
		}
		String manStr=new String(arr);
		return manStr;
		}

		public static void main(String[] args) {

		replacelast l=new replacelast();
		String data=l.ReplaceLast("test data", 'a', 'x');

		System.out.println(data);

		}
		}


