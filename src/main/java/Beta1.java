class Alpha{
	public void bar(int...x){

	}
	public void bar(int x){

	}
}
public class Beta1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int bar(String x){
		return 1;
	}
	
	public Alpha bar(int x){
		return new Alpha();
	}
}
