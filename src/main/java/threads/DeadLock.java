package threads;

public class DeadLock {

	
	/**
	 * @param args
	 */
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Object a = new Object();
		final Object b  = new Object();
		
		Thread t1 = new Thread(){
			public void run(){
				synchronized (a) {
					try {
						System.out.println("started a");
						sleep(1000);
						System.out.println("ended a");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (b) {
						System.out.println("a");
					}
				}
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				synchronized (b) {
					try {
						System.out.println("started b");
						sleep(1000);
						System.out.println("ended b");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (a) {
						System.out.println("b");
					}
				}
			}
		};
		t1.start();
		t2.start();

	}

}
