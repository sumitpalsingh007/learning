public class Test {
 public enum Dogs {collie, harrier, shepherd};
 public static void main(String [] args) {
	 try{
 Dogs myDog = Dogs.shepherd;
 switch (myDog) {
 case collie:
 System.out.print("collie ");
 //break;
 default:
	System.out.print("retriever ");
 case harrier:
 System.out.print("harrier ");
 //break;
 }
 
 }finally{
	 
 }
 }
 }