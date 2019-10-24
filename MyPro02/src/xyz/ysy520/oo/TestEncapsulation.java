package xyz.ysy520.oo;

public class TestEncapsulation {
	public static void main(String[] args) {
		System.out.println(new Human().name);
	}
}

class Human {
	private int age; //只能在Human类中使用
	String name;
	protected char sex;
	public String desc;
	
	void sayAge() {
		System.out.println(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class Man extends Human {
	
}
