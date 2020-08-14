package com.mypack.countries;

 interface phnumber{
	 boolean phnumberformat(String Number);
	 
 }
 abstract class country implements  phnumber{
 
 }
 

public class task6 {
	
	public static void main(String[] args) {
		India i=new India();
		Brazil b=new Brazil();
		Norway n=new Norway();
		Qatar q=new Qatar();
		Turkey k= new Turkey();
		System.out.println(i.phnumberformat("+91-991760479a"));
		System.out.println(b.phnumberformat("+55 15 99999-9"));
		System.out.println(n.phnumberformat("+47-49-99-99-99"));
		System.out.println(q.phnumberformat("974 33999999"));
		System.out.println(k.phnumberformat("+90 509-999999"));
		
	}

}
class India extends country
{
	 @Override
	public boolean phnumberformat(String Number) {
		if(Number.length()!=14)
		{
		return false;
		}
		
		if(Number.substring(0,4).equals("+91-")) 
		{
			
		char[] arr=Number.toCharArray();
		for(int i=4;i<Number.length();i++)
		{
	if(!(arr[i]>='0' && arr[i]<='9'))
		return false;
		
		}
	 return true;
		}
		else
			return false;
		}
		
	 }
	 
class Brazil extends country
{
	 @Override
	public boolean phnumberformat(String Number) {
		 char[] arr=Number.toCharArray();
			
			if(!(arr.length==17))
				return false;
			 if(!(arr[0]=='+' && arr[1]=='5' && arr[2]=='5' && arr[3]==' ' && arr[4]=='1' && arr[5]=='5' && arr[6]==' ' && arr[12]=='-'))
	            return false;
			 for(int i=7;i<Number.length()-5;i++)
				{
					if(!(arr[i]>='0' && arr[i]<='9'))
						return false;
		}
			 for(int i=13;i<Number.length();i++)
				{
					if(!(arr[i]>='0' && arr[i]<='9'))
						return false;
		}
			 
			return true;
}
}

class Norway extends country
{
	 @Override
	public boolean phnumberformat(String Number) {
		 char[] arr=Number.toCharArray();
			
			if(!(arr.length==15))
				return false;
			 if(!(arr[0]=='+' && arr[1]=='4' && arr[2]=='7' && arr[3]=='-' && arr[4]=='4' && arr[6]=='-' && arr[9]=='-' && arr[12]=='-'))
	            return false;
			 if(!(arr[5]>='0' && arr[5]<='9'))
					return false;
			 for(int i=7;i<Number.length()-6;i++)
			 {
			 if(!(arr[i]>='0' && arr[i]<='9'))
					return false;
			 }
			 for(int i=10;i<Number.length()-3;i++)
			 {
			 if(!(arr[i]>='0' && arr[i]<='9'))
					return false;
			 }
			 
			 for(int i=13;i<Number.length();i++)
			 {
			 if(!(arr[i]>='0' && arr[i]<='9'))
					return false;
			 }
			return true;
		}
}


class Qatar extends country {
	@Override
	public boolean phnumberformat(String Number) {
		
		char[] arr=Number.toCharArray();
				
				if(!(arr.length==14))
					return false;
				 if(!(arr[0]=='+' && arr[1]=='9' && arr[2]=='7' && arr[3]=='4' && arr[4]==' ' && arr[5]=='3' && arr[6]=='3' && arr[9]=='-'))
		            return false;
				 for(int i=7;i<Number.length()-5;i++)
					{
						if(!(arr[i]>='0' && arr[i]<='9'))
							return false;
			}
				 for(int i=10;i<Number.length();i++)
					{
						if(!(arr[i]>='0' && arr[i]<='9'))
							return false;
			}
				 
				return true;
	}
			
}
package com.mypack.countries;

class Turkey extends country
{
	 @Override
	public boolean phnumberformat(String Number) {
		 char[] arr=Number.toCharArray();

			if(arr.length==12)
			{
				  if(!(arr[0]=='0' && arr[1]=='5' && arr[2]=='0'&& arr[4]=='-'&& arr[8]=='-'))
			            return false;
				 if(!(arr[3]>='0' && arr[3]<='9'))
						return false;
				 for(int i=5;i<Number.length()-4;i++)
					{
						if(!(arr[i]>='0' && arr[i]<='9'))
							return false;
					}
				 for(int i=9;i<Number.length();i++)
					{
						if(!(arr[i]>='0' && arr[i]<='9'))
							return false;	
			}
				 }
			else if(arr.length==14)
			{
				 if(!(arr[0]=='+' && arr[1]=='9' && arr[2]=='0' && arr[3]==' ' && arr[4]=='5' && arr[5]=='0' && arr[7]=='-'))
			            return false;
					 if(!(arr[6]>='0' && arr[6]<='9'))
							return false;
					 for(int i=8;i<Number.length();i++)
						{
					 if(!(arr[i]>='0' && arr[i]<='9'))
								return false;	
			}
			}
			else
			{
				return false;
			}
			
			return true;

			}
	 }





