package Polymorphism;

// method overriding



class Animal {
	void sound() {
		System.out.println("Animal makes a sound");
	}
}
class Dog extends Animal {
	@Override 
	void sound() {
		System.out.print("Dog bark");
	}
	
}

public class problem1 {
	public static void main(String[] args) {
		Animal a1 = new Dog();
		
		a1.sound();
		
		
	}

}
