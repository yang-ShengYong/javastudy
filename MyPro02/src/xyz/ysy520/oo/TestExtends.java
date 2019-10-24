/**
 * 	�̳�
 */
package xyz.ysy520.oo;

public class TestExtends {
	public static void main(String[] args) {
		Student s = new Student("zhangsan", 180, "java");
		s.major = "C++";
		s.study();
		s.rest();
		System.out.println(s instanceof Student);
		System.out.println(s instanceof Person);
		System.out.println(s instanceof Object);
		System.out.println(new Person() instanceof Student);
	}
}

class Person {
	String name;
	int height;
	
	public void rest() {
		System.out.println("Peron �� rest");
	}
}

class Student extends Person {
	String major;
	
	public Student (String name, int height) {
		this.name = name;
		this.height = height;
	}
	
	public Student (String name, int height, String major) {
		this(name, height);
		this.major = major;
	}
	
	public void study() {
		System.out.println("Student �� study" + name + height + major);
	}
}
