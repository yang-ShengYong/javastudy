package xyz.ysy520.oo;
/**
 * 包装类
 * @author yangshengyong
 *
 */
public class TestWrapper {
	public static void main(String[] args) {
		//把基本类型转成包装类
		Integer a = new Integer(10);
		Integer b = Integer.valueOf(20);
		
		//把包装类转成基本数据类型
		int c = b.intValue();
		double d = b.doubleValue();
		
		//字符串转成包装类
		Integer e = new Integer("123");
		Boolean f = Boolean.parseBoolean("true");
		
		//包装类转成字符串
		String str = f.toString();
		
		System.out.println(str);
	}
}
