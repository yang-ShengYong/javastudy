package xyz.ysy520.arrays;
/**
 * 数组初始化
 * @author yangshengyong
 *
 */
public class Test02 {
	public static void main(String[] args) {
		//静态初始化
		int[] a = {2,3,4};
		User[] u = {
				new User(1001, "张三"),
				new User(1002, "李四"),
				new User(1003, "王五")
		};
		
		//默认初始化
		int[] a1 = new int[3];
		
		//动态初始化
		int[] a2 = new int[3];
		a2[0] = 1;
		a2[2] = 3;
	}
}
