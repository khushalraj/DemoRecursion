package com.example.constructors;

public class Employee {

int id;
String name;
double salary;
public Employee(int id, String name, double salary) {
	  this.id = id;
	  this.name = name;
	  this.salary = salary;
}
public void displayEmployee()
{
	System.out.println(" id : "+this.id);
	System.out.println(" name : "+this.name);
	System.out.println(" salary : "+this.salary);
}
public static void main(String[] args) {
	Employee e1 = new Employee(101, "Khushal", 60000);
	e1.displayEmployee();
}

}
