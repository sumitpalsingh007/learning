package threads;

public class Deadlock1 {

    public static void main(String[] args) {

        final A a=new A();
        final B b = new B();

        new Thread(new Runnable(){
            @Override
            public void run() {
            	try {
					System.out.println("started a");
					Thread.sleep(1000);
					System.out.println("ended a");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                 a.aMethod(b);

            }
        },"Thread-2").start();

        new Thread(new Runnable(){
                @Override
            public void run() {
                	try {
						System.out.println("started b");
						Thread.sleep(1000);
						System.out.println("ended b");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                b.bMethod(a);
            }
        },"Thread-2").start();
    }
}

class A {
    public synchronized void aMethod(B b) {
        System.out.println("A method");
    }
}

class B {
    public synchronized  void bMethod(A a) {
        System.out.println("B method");
    }
}