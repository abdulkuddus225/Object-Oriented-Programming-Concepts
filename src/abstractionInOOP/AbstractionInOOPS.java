package abstractionInOOP;

public class AbstractionInOOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Animal animal = new Animal(); we cannot initiate the object of Animal 
		// class as it is an Abstract class
		
		Bird parrot = new Bird();
		parrot.eat();
		
		Fish tuna = new Fish();
		tuna.move();
		
		// Accessing concrete method
		
		tuna.label();
		
		parrot.label();
		

	}

}
