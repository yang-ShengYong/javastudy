/**
 *	������д
 *	 
 */

package xyz.ysy520.oo;

public class TestOverride {
	public static void main(String[] args) {
		Car c = new Car();
	}
}

class Vehicle {
	public Person run () {
		System.out.println("run ���෽��");
		return new Person();
	}
}

class Car extends Vehicle {
	public Student run () { //����ֵ���� <= ���෵������
		System.out.println("run ���෽��");
		return new Student("lisi", 175); //��Ҫ���βε� һ��Ҫ���β�
	}
}
