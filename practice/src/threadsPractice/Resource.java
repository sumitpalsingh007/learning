package threadsPractice;

public class Resource {
	 
    public void doSomething(){
        //do some operation, DB read, write etc
    	System.out.println("doing something");
    }
     
    public void doLogging(){
        //logging, no need for thread safety
    	System.out.println("doing logging");
    }
}