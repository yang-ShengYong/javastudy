package xyz.ysy520.oo;
/**
 * 非静态内部类
 * @author yangshengyong
 *
 */
public class TestInnerClass {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner();
		inner.show();
	}
}

class Outer {
	private int age = 10;
	public void testOuter() {
		
	}
	class Inner{ //内部类，可直接访问外部类的成员变量
		public void show () {
			int age = 30;
			System.out.println(Outer.this.age);
			System.out.println(age);
		}
	}
}
