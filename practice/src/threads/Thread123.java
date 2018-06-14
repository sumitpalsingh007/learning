package threads;

public class Thread123 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		Thread t1 = new Thread(){
			int i=0;
			public void run(){
				while(i<10){
					System.out.println(i);
					i=i+2;
				}
			}
		};
		Thread t2 = new Thread(){
			int i=1;
			public void run(){
				while(i<10){
					System.out.println(i);
					i=i+2;
				}
			}
		};
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.yield();

	}

}
