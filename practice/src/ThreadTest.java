
public class ThreadTest {
	 
	void waitForSignal() throws Exception {
	   Object obj = new Object();
		 synchronized (obj) {
			 obj.wait();
			 obj.notify();
			 }
   }
}
