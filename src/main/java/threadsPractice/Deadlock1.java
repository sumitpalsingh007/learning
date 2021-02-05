package threadsPractice;

public class Deadlock1 {

    public static void main(String[] args) {

        final A a=new A();
        final B1 b = new B1();

        new Thread(new Runnable(){
            @Override
            public void run() {
                 a.aMethod(b);

            }
        },"Thread-1").start();

        new Thread(new Runnable(){
                @Override
            public void run() {
                b.bMethod(a);
            }
        },"Thread-2").start();
    }
}



