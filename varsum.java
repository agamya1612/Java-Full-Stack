
public class varsum {
		int sum(int... x){
			int add=0;
			int min=x[0];
			int max=x[0];
			int count=0;
		for (int i = 0; i <x.length; i++) {
			add=add+x[i];
			if(x[i]>max)
			{
				max=x[i];
				
			}
			else if(x[i]<min)
				min=x[i];
			
			if(x[i]%2==0)
		{
			System.out.println("Even Digits ="+ x[i]);
		}
			else
				System.out.println("Odd Digits ="+x[i]);
		}
		for (int i = 0; i < x.length; i++) {
			if (x[i]%3==0)
			{
				count++;
				System.out.println("Numbers divisible by three =" +count);
			}
		}
		System.out.println("Maximum value=" +max);
		System.out.println("Minimum Value="+min);
		return add;
		}

		public static void main(String[] args) {
		varsum c=new varsum();
		System.out.println(c.sum(10,1,4,5,9));
		}

		}
