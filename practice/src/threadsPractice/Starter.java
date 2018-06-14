package threadsPractice;

public class Starter implements Runnable{

	void go(long id){
		System.out.println(id);
	}
	
	public static void main(String[] args){
		System.out.println(Thread.currentThread().getId()+" ");
	try {
		new Thread(new Starter()).join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//Thread.join();
	}
	public void run(){
		go(Thread.currentThread().getId());
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
