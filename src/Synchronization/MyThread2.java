package Synchronization;

//First  thread 
class MyThread2 extends Thread {
	
	public MyThread2( Counter c) {
		super();
		this.c = c;
	}

	@Override
	public void run() {
		super.run();
		
		// here you  comment on of these two lines to view to test just one  method :
		//either "increment" that uses Synchronized method , or "increment2" that uses Synchronized block 
			// incrementing the counter   : Synchronized method 
			
			c.increment1("thread2");
		
		   // incrementing  and multiplying the counter   : Synchronized block 
			c.increment2("thread2");

	}
	
	private Counter c;
	
}
