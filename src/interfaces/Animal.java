// Important *********
/* 1. An interface is a completely "abstract class" that is used to group 
 * related methods with empty bodies
 * 
 * 2. To access the interface methods, the interface must be "implemented" 
 * (kind like inherited) by another class with the implements keyword (instead of extends).
 * 
 * Notes on Interfaces:

Like abstract classes, interfaces cannot be used to create objects (in the example above, 
it is not possible to create an "Animal" object in the InterfacesOOPS	)
Interface methods do not have a body - the body is provided by the "implement" class
On implementation of an interface, you must override all of its methods
Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)
Why And When To Use Interfaces?

1) To achieve security - hide certain details and only show the important details of an object (interface).

2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). 
However, it can be achieved with interfaces, because the class can implement multiple interfaces. 
Note: To implement multiple interfaces, separate them with a comma (see example below).
 */


/* What we  have achieved in this program?? 
 * 1. 100% Abstraction using Interfaces
 * 2. Multiple Inheritance using Interfaces.
 * 3. Method Overriding.
 * 4. Encapsulation.
 * 5. Polymorphesim as Method Overriding has been implemented.
 * 6. Method Overloading.
 * 7. Created a paramaterized constructor.
 * */


package interfaces;

interface Animals {

	//This is the method of creating an interface
	//Using interfaces we can achieve 100% Abstraction
	
	public void eat();
	public void move();
	
	static void abdul() {
		System.out.println("Yes");
	}
	
	
}

interface Birds{
	
	
	// Instance variables
	int numberOfLegs = 2;
	String covering = "Feather";
	public void fly();
}


// Method of using an interface

class Eagle implements Animals, Birds{
	
	private int cost = 1000;

	
	public void cost() {
		
		System.out.println("Cost of an Eagle is "+cost);
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
		System.out.println("Eagle can fly as they have " +covering+ "and " +numberOfLegs+ " legs");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eagle Eats bird food");
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Eagle can fly");
		
	}
	
}

class Parrot implements Animals, Birds{
	
	private int cost;
	
	Parrot(int cost){
		this.cost = cost;
	}
	
	public void cost() {
		System.out.println(cost);
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Parrot can fly as they have " +covering+ " and" +numberOfLegs+ "Legs");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Parrots Eats bird food");
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Parrot can fly");
		
	}
	
}
