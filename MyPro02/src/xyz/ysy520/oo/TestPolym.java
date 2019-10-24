package xyz.ysy520.oo;
/**
 * 	∂‡Ã¨
 * @author yangshengyong
 *
 */
public class TestPolym {
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		Animal a = new Dog();
		animalShout(d);
		animalShout(c);
		animalShout(a);
	}
	
	static void animalShout(Animal a) {
		a.shout();
	}
}

class Animal {
	public void shout () {
		System.out.println("a a a");
	}
}

class Dog extends Animal {
	public void shout () {
		System.out.println("w w w");
	}
}

class Cat extends Animal {
	public void shout () {
		System.out.println("m m m");
	}
}
