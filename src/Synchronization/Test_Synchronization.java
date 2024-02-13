package Synchronization;


public class Test_Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c= new Counter();
		MyThread1 t1= new MyThread1(c);
		Thread t2= new Thread( new MyThread2(c));
		t1.start();
		t2.start();
		
	}

}



class Counter {
    

    // Synchronized method : it can be executed only by one thread at a moment
    public  synchronized void increment1(String c) {
    	for (int i = 0; i < 20; i++)
		{
    		count++;
		}
		System.out.println("INCREMENT1 : incrementing by  " + c + " / count equals  now   "  +count  );

    }
    
    

    public   void increment2(String c) {
    	for (int i = 0; i < 5; i++)
		{
			count+=1;
			
		}
    	System.out.println("INCREMENT2 :incremented  by  " + c + "  after 1st loop : / count equals  now   "  +count  );
    		synchronized (lock) {
    			for (int i = 0; i < 5; i++)
    			{
    				count*=2;
    				System.out.println(" INCREMENT2: multipliying by  " + c + " / count equals  now   "  +count  );
    			} 
    			
            
		}
    		System.out.println("INCREMENT2 : incremented and multiplied by  " + c + " / final result   "  +count  );
		

    }
    
    public int getCount() {
        return count;
    }
    
    private int count = 0;
    private Object lock = new Object();
}


