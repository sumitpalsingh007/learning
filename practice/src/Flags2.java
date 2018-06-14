import java.io.File;
import java.util.concurrent.SynchronousQueue;


public class Flags2 {

	/**
	 * @param args
	 */
	private boolean isReady = false;
	
	public synchronized void produce() throws InterruptedException{
		isReady=true;
		notifyAll();
	}
	
	public synchronized void consume(){
		while(!isReady){
			try{
				wait();
			}catch(Exception e){
				
			}
			isReady = true;
		}
	}
	
	public static boolean doesFileExist(String[] directories,String filename){
		String path="";
		for(String dir:directories){
			path=path+"/"+dir;
		}
		File file = new File(path,filename);
		//return file.exists();
		return file.exists();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
