public class Employee {
 String name; double baseSalary;
 Employee(){
	 
 }
 Employee(String name, double baseSalary) {
 this.name = name;
 this.baseSalary = baseSalary;
 }
 }
  class SalesPerson extends Employee {
 double commission;
 public SalesPerson(String name, double baseSalary, double commission) {
 this.commission=commission;
 }
}