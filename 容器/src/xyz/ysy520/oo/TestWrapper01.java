package xyz.ysy520.oo;
/**
 * 	包装类及常用方法
 * 	Byte
 * 	Short
 * 	Integer
 * 	Long
 * 	Float
 * 	Double
 * 	Character
 * 	Boolean
 * 	
 * @author yangshengyong
 *
 */
public class TestWrapper01 {

	public static void main(String[] args) {
		Integer i1 = new Integer(129);
		Integer i2 = new Integer("131"); //可以传数值型字符串
		
		System.out.println(i1.byteValue());
		System.out.println(i1.compareTo(i2));
		System.out.println(i1.toString());
		System.out.println(Integer.SIZE);
		
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("true");
		
		System.out.println(b1.booleanValue());
		System.out.println(b2);
	}

}
