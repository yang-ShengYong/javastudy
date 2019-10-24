/**
 *	方法重写
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
		System.out.println("run 父类方法");
		return new Person();
	}
}

class Car extends Vehicle {
	public Student run () { //返回值类型 <= 父类返回类型
		System.out.println("run 子类方法");
		return new Student("lisi", 175); //需要传形参的 一定要传形参
	}
}
