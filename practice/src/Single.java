
public class Single {

	/**
	 * @param args
	 */
	
	private static Single instance;
	
	public  Single getInstance(){
		if(instance ==null) instance =create();
		return instance;
	}
	
	private Single(){
		
	}
	private Single create(){
		return new Single();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
