/**
 * 	重要的Object类
 * 	是所有对象继承的根
 * 	每一个类都有一个Object类作为父类
 */

package xyz.ysy520.oo;

public class TestObject {
	public static void main(String[] args) {
		TestObject obj = new TestObject();
		System.out.println(obj.toString());
	}
	
	//重写父类Object的toString方法
	public String toString () {
		return "重写toString方法";
	}
}
