// Important *********
// Concepts covered
// 1. Data Abstraction using Abstract keyword
// 2. Method Overriding



package abstractionInOOP;

abstract public class Animal {
	
	// Let's create a private member that can be passed through abstract methods
	
	//private int numberOfLegs; now to access this variable we need to create getter and setter methods
	// That is basically an Encapsulation

	//Abstract Methods: These methods will not have method body.
	// Using Abstract keyword we can only achieve Partial Abstraction
	
	private int numberOfLegs;
	
	
	
	abstract void move();
	abstract void eat();
	
	//Concrete Methods: These methods can have body as they are not abstract methods
	// Concrete Class: It is a class which have all its methods implemented in the class only
	
	public void label() {
		System.out.println("This is a concrete method inside the abstract class");
	}
	
	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	
	
	
	
}

class Bird extends Animal{

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("Birds Moves by Flying");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Birds eat bird food");
		
	}
	// Initially we will get an error as we need to Override methods of 
	// class animal as they are abstract
	

}

class Fish extends Animal{

	@Override
	void move() {
		// TODO Auto-generated method stub
		
		System.out.println("Fish move by swimming");
		
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("Fishes eats fish food");
		
	}
	
}
