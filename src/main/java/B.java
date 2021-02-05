
public class B{
	static class C extends A1 {
        @Override
		void process() 
		{ System.out.println("B"); 
		}

		public static void main(String[] args) {
			new C().process();
		}
	}
	static class A1{
		void process() throws Exception { throw new Exception(); }
	}
}