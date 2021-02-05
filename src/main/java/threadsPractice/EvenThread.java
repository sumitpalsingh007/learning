package threadsPractice;

class EvenThread implements Runnable{

	Common c = null;
	EvenThread(Common c ){
		this.c = c;
	}
	public void run() {

		c.printEven(); 

	}


}

