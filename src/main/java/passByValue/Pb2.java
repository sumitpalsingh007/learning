package passByValue;

public class Pb2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void test(Pb1 pb){
		pb.name="Pal";
		pb.a=pb.a+3;
		System.out.println(pb.toString());
		System.out.println(pb.name);
		System.out.println(pb.a);
		
	}
	
	public void test2(int i){
		i++;
		System.out.println(i);
	}
}
