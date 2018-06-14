package threadsPractice;

public class CreateDeadlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread a = new Thread(new ThreadA());
		Thread b  = new Thread( new ThreadB());
		a.start();
		b.start();
		//a.

	}

}
