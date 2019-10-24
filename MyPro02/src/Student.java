
public class Student {
	public static void main(String[] args) {
		Student stu = new Student();
		Computer comp = new Computer();
		comp.brand = "dell";
		stu.comp = comp;
		stu.play();
	}
	// Ù–‘
	int id;
	String name;
	int age;
	Computer comp;
	//∑Ω∑®
	void play() {
		System.out.println(comp.brand);
	}
}

class Computer {
	String brand;
}