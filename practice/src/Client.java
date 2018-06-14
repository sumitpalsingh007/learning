   class Target {
 private int i = 0;
 public int addOne(){
 return ++i;
 }
 }

 public class Client {
 public static void main(String[] args){
 System.out.println(new Target().addOne());
 
 Animal animal = new Dog();
  Cat cat = (Cat)animal;
  System.out.println(cat.noise());
 }
 }
 
 class Animal { public String noise() { return "peep"; } }
  class Dog extends Animal {
 
  public String noise() { return "bark"; }
  }
  class Cat extends Animal {
  public String noise() { return "meow"; }
  }