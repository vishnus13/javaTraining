import java.util.LinkedList;

/*Created Animal class which is parent class with eat and sleep methods
 */
class Animal {
	String name;
	int weight;

	public Animal() { // Animal constructor is created

		System.out.println("Animal is called");

	}

	public Animal(String name) { // Animal constructor with single parameter
		this.name = name;
	}

	public Animal(String name, int weight) { // Animal constructor with two
												// parameters
		this.name = name;
		this.weight = weight;
	}

	void eat() {
		System.out.println("Animals eat ");
	}

	void sleep() {
		System.out.println("Animals sleep");
	}
}

/*
 * Lion class is a child class of Animal class
 */
class Lion extends Animal {

	public Lion() { // Lion constructor

		System.out.println("Lion object is being created");
	}

	final static String animalType = "Carnivorus"; // animal type is final and
													// static because lions are
													// always carnivorus

	void animalType() {
		System.out.println("Lion is a " + animalType + " Animal");
	}

}

/*
 * Test class is the child class of Lion
 */
public class Test extends Lion {
	public static void main(String[] args) {
		Animal myPet = new Animal("tommy"); // object is created to animal class
											// and value is passed to Animal
											// constructor
		Animal myPet2 = new Animal("tiger ");
		Animal myPet3 = new Animal("Browny", 5);
		System.out.println("My pet name is " + myPet.name);
		System.out.println("My second pet name is " + myPet2.name);
		System.out.println("my third pet is " + myPet3.name + " "
				+ "and its weight is " + myPet3.weight + " " + "pounds");
		Lion wildAnimal = new Lion(); // object is created to lion class and
										// lion constructor is called
		wildAnimal.eat(); // methods are called with reference
		wildAnimal.sleep();
		wildAnimal.animalType();
		System.out.println("my pets are not " + animalType + " animals");

		Lion[] Lions = new Lion[1000];// created 1000 lions
		String name = "Tim";
		int i = 1;

		for (i = 1; i <= 10; i++) {
			System.out.println("lions name " + name);
		}

		LinkedList LionLinkedList = new LinkedList<Lion>();// initialized lions
															// linked list
	}
}
