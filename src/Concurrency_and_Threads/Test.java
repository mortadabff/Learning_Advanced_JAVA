package Concurrency_and_Threads;
import java.lang.Thread;
import java.lang.Runnable;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t1= new MyThread1(20);
		Thread t2= new Thread( new MyThread2(20));
		MyThread1 t3= new MyThread1(20);
		Thread t4= new Thread( new MyThread2(20));
		
		t1.start();
		t2.start();
		
		

	}

}


// First method to create a Thread : Thread 
class MyThread1 extends Thread {
	// you can create a constructor for this class with parameters needed for the task for example
	private int length;
	
	public MyThread1(int length) {
		super();
		this.length = length;
	}

	@Override
	public void run() {
		super.run();
		for (int i = 0; i < length; i++)
		{
			System.out.println("Task of the MyThreads1");
		}
	}
}

// Second method to create a Thread : Runnable 
class MyThread2 implements Runnable {
	private int length;
	//Here also ,  you can create a constructor for this class with parameters needed for the task for example
	public MyThread2(int length) {
		super();
		this.length = length;
	}
	@Override
	public void run() {
		for (int i = 0; i < length; i++)
		{
			System.out.println("Task of the MyThreads2");
		}
		
		
	}	
}

