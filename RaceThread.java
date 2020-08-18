package com.mypack.Thread;
class Hare implements Runnable
{

@Override
public void run() {

for(int i=1;i<=100;i++)
{
System.out.println("Hare is at "+i);

try {
Thread.sleep(100);
} catch (InterruptedException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}

if(i==90)
{
try {
Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}
}
}
class Tortoise implements Runnable
{

@Override
public void run() {

for(int i=1;i<=100;i++)
{
System.out.println("Tortoise "+i);

try {
Thread.sleep(100);
} catch (InterruptedException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
}
}

}

public  class RaceThread{
	
public static void main(String[] args) {
	


		Tortoise tort=new Tortoise();
		Hare har=new Hare();

		Thread t=new Thread(tort,"Tortise ");
		Thread h=new Thread(har,"Hare ");
		t.start();
		h.start();
		System.out.println(" Let the Race Begins ");
		while(true)
		{
			if(!h.isAlive()){
				System.out.println(h.getName() +"Wins");
				t.stop();
				break;
					}
			if(!t.isAlive())
			{
				System.out.println(t.getName() +"Wins");
				h.stop();
				break;
			}
		}
		System.out.println("Race ENDS");
			


	}
}


