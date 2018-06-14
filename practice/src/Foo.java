import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Foo implements Serializable{

    public int x,y;
    public Foo(int x, int y){
    	this.x=x;this.y=y;
    }
	private void writeObject(ObjectOutputStream s) throws IOException{
		s.writeInt(x);s.writeInt(y);
	}
	private void readObject(ObjectInputStream s) throws ClassNotFoundException, IOException{
		s.defaultReadObject();
	}
	public static void main(String[] args) {
		Foo f = new Foo(1, 2);
				
	}

}
