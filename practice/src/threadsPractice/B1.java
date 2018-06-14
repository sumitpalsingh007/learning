package threadsPractice;

class B1 {
    public   void bMethod(A a) {
    	synchronized(a){    		
    	
        System.out.println("B method");
    	}
    }
}
