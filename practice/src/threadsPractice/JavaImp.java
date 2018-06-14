package threadsPractice;

public class JavaImp {

/**
* @param args the command line arguments
*/
public static void main(String[] args) {

Common c = new Common();
Thread t1 = new Thread(new EvenThread(c),"Even");

Thread t2 = new Thread(new OddThread(c),"Odd");

t1.start();
t2.start();
}

}