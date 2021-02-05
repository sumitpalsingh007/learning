package threadsPractice;

class OddThread implements Runnable{

Common c = null;
OddThread(Common c ){
this.c = c;
}
public void run() {

c.printOdd();



}


}