
public class Threads1 {
   int x=0;
   public class Runner implements Runnable{
	   public void run(){
		   int current=0;
		   for (int i=0;i<4;i++){
			   current=x;
			   System.out.println(current+",");
			   x=current+2;
		   }
	   }
   }
   
   public static void main(String[] args){
	   new Threads1().go();
   }
   
   public void go(){
	   Runnable r = new Runner();
	   new Thread(r).start();
	   new Thread(r).start();
   }
}
