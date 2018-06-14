package threadsPractice;

public class A {
    public   void aMethod(B1 b) {
    	synchronized(b){
        System.out.println("A method");
    	}
    }

	
}
