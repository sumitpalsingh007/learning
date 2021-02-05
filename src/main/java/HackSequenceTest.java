import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HackSequenceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HackSequenceTest t=new HackSequenceTest();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
		String i=	br.readLine();
		for(int j=1;j<= Math.abs(Integer.valueOf(i));j++){
			System.out.println(t.getHackSequence(new Integer(br.readLine())));
		}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private int getHackSequence(int i){
		if(i>2)
		return getHackSequence(i-1)*2014+69*getHackSequence(i-2);
		else
			return 1;
		
	}

}
