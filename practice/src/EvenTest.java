
public class EvenTest {
    
	static int i =7;
	public static void main(String []args){
		System.out.println("hi sumit");
		String s=null;
		for (int j=1;j<=i;j++){
			s=s+"Sumit";
		}
		System.out.println(s.replaceAll("SumitSumit", ""));
	}
}
