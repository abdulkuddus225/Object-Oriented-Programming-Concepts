package interfaces;

public class InterfacesOOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eagle eagle = new Eagle();
		
		eagle.eat();
		eagle.fly();
		eagle.move();
		eagle.cost();
		Parrot parrot = new Parrot(10000);
		
		parrot.eat();
		parrot.fly();
		parrot.cost();
		
		
	}

}
