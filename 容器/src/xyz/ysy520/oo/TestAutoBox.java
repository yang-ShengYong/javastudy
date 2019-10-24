package xyz.ysy520.oo;
/**
 * 自动装箱 自动拆箱
 * @author yangshengyong
 *
 */
public class TestAutoBox {
	public static void main(String[] args) {
		//装箱
		Integer i = 100; //编译器自动 Integer i = new Integer(100);
		
		//拆箱
		int b = i; //编译器自动 int b = i.intValue();
		
		//缓存[-128， 127]之间的数
		Integer i1 = -128;
		Integer i2 = -128;
		System.out.println(i1 == i2); //true
		
		Integer i3 = 1000;
		Integer i4 = 1000;
		System.out.println(i3 == i4); //false
	}
}
