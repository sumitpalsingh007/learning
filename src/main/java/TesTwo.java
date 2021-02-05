
public class TesTwo extends Thread {

	/**
	 * @param args
	 */
	public static void main (String[] args) throws Exception{
		TesTwo t = new TesTwo();
		t.start();
	//	t.join();
		//t.run();
		t.doIt();
	}
    public void run(){
    	System.out.println("Run ");
    }
    public void doIt(){
    	System.out.println("doIt ");
    	System.out.println(Element.EARTH.info());
    }
}


