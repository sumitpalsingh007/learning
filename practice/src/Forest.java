import java.io.*;
public class Forest  extends Tree implements Serializable {
	//private  Tree tree = new Tree();
	public static void main(String [] args) {
		
		Forest f = new Forest();
		Forest forest;
		try {
			FileOutputStream fs = new FileOutputStream("Forest.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(f); os.close();
			
			FileInputStream fin = new FileInputStream("Forest.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);
			forest = (Forest) ois.readObject();
			
			System.out.println("-->>>"+forest.name);
		} catch (Exception ex) { ex.printStackTrace(); }
	} }

class Tree  { 
	 String name="mango";
}