package xyz.ysy520.oo;
/**
 * 可变字符序列
 * StringBuilder 线程不安全，效率高
 * 		.append()
 * 		.insert()
 * 		.delete()
 * StringBuffer 线程安全，效率低
 * @author yangshengyong
 *
 */
public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("hello world");
		
		str.setCharAt(3, 'M'); //更改
		str.insert(5, '你').insert(7, '爱'); //插入，可链式调用
		
		System.out.println(str);
		
		StringBuilder str2 = new StringBuilder();
		for(int i=0;i<26;i++) {
			str2.append((char)('a'+i));
		}
		System.out.println(str2);
		str2.delete(15, 23); //删除一个区间
		System.out.println(str2.reverse());
	}
}
