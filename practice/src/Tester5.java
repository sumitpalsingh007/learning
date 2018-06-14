import java.io.IOException;

class A12 {
 void foo() throws Exception { throw new Exception(); }
 }
 class SubB23 extends A12 {
 void foo() throws IOException { System.out.println("B "); }
 }
 class Tester5 {
 public static void main(String[] args) {
 A12 a = new SubB23();
 System.out.println("hi");
 a.foo();  
 }}