package waitnotifyunderstanding;

public class TestWaitNotify {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final ALock lock = new ALock();
		Thread threadA  = new Thread(){public void run(){
			while(true){
				lock.test();
				try {
					synchronized (lock){
						lock.wait();
						lock.notify();
					}
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//System.out.println("A");

			}
		}};
		Thread threadB  = new Thread(){public void run(){
			while(true){
				lock.test();
				/*synchronized (lock){
					lock.notify();
				}*/
			}
		}};
		Thread threadC  = new Thread(){public void run(){
			while(true){
				lock.test();
				//System.out.println("C");
			}
		}};

		threadA.start();
		threadB.start();
		threadC.start();

	}

}

class ALock{

	public synchronized void test(){
		try {
			Thread.sleep(500);
			//System.out.println("finished Sleep");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}
}
