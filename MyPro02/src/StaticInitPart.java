
public class StaticInitPart {
	int i = 0;
	float f = 3.14F;
	
	static {
		print();
	}
	
	static void print() {
		System.out.println('a');
	}
	
	public static void main(String[] args) {
		StaticInitPart s = new StaticInitPart();
	}
}
