public class task5 {
	
	String reverse(String str){
		String str1="";
		char[] arr=str.toCharArray();
		for (int i = arr.length-1; i>=0; i--) {
			str1=str1+arr[i];
			}
		String manStr=new String(str1);
		return manStr;
	}
	boolean isNum(String str){
		char[] arr=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
		if(!(arr[i]>='0' && arr[i]<='9'))
		return false;
		}
		return true;
		}
	boolean isNum10(String str){
		char[] arr=str.toCharArray();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
		if(arr[i]>='0' && arr[i]<='9')
			count++;
		if(count==10)
		return true;
		}
		return false;
		}
	void sort() {
		int a[]= {10,1,2,8,12,33,5,9,20,40};
		int temp=0;
		int i;
		int j;
		for ( i = 0; i < a.length; i++) {
			for ( j = i+1; j < a.length; j++) {     
	               if(a[i] > a[j]) {    
	                   temp = a[i];    
	                   a[i] = a[j];    
	                   a[j] = temp; 
	                   }
			}
		}
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			
		}
	
	}
	
	public static void main(String[] args) {
		task5 t=new task5();
		System.out.println(t.reverse("hello java"));
		System.out.println(t.isNum("Agamya12213"));
		System.out.println(t.isNum10("Agamya12345678910"));
		t.sort();
}
}
