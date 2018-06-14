package threadsPractice;

import java.util.Hashtable;

public class Thread1to511to1521to25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		test();
	}
	
	private static void test(){

		// TODO Auto-generated method stub
		final Thread t3 = new Thread(){
			public void run(){
				for(int i =21;i<=30;i++){
					System.out.println(i);
					if (i==25){
						System.out.println("=============");
						Thread.yield();
						System.out.println("=============");
					}
						
				}
			}
		};
		
		 final Thread t2 = new Thread(){
				public void run(){
					for(int i =11;i<=20;i++){
						System.out.println(i);
						if (i==15){
							System.out.println("=============");
							 try {
								 t3.start();
								t3.join();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.println("=============");
						}
							
					}
				}
			};
			
			
		final Thread t1 = new Thread(){
			public void run(){
				for(int i =1;i<=10;i++){
					System.out.println(i);
					if (i==5){
						System.out.println("=============");
						 try {
							 t2.start();
							t2.join();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("=============");
					}
						
				}
			}
		};
	  
		t1.start();
		new Hashtable();new String();
	
	}

}
