package xyz.ysy520.oo3;
/**
 * 	测试
 * 	静态变量和方法
 * 	静态代码块
 * @author yangshengyong
 *
 */
public class TestStatic {
	static {
		System.out.println("static代码块");
	}
	public static void main(String[] args) {
		//公开静态常量可共享
		System.out.println(PublicStaticConstant.PI);
	}
	
	public static void lalala () {
		System.out.println(PublicStaticConstant.PI);
	}
}
