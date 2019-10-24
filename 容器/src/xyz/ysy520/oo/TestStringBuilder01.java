package xyz.ysy520.oo;

import java.sql.Date;

/**
 * 	不可变字符序列的坑
 * 	可变字符序列的好处 StringBuilder
 * @author yangshengyong
 *
 */
public class TestStringBuilder01 {
	public static void main(String[] args) {
		String str = "hello world";
		StringBuilder str1 = new StringBuilder("hello world");
		
		long time1 = System.currentTimeMillis();
		for (int i=0; i<10000; i++) {
			str = str + i;
		}
		long time2 = System.currentTimeMillis();
		System.out.println(time2 - time1); //186ms 这种方式的耗时长，禁用
		
		long time3 = System.currentTimeMillis();
		for (int i=0; i<10000; i++) {
			str1.append(i);
		}
		long time4 = System.currentTimeMillis();
		System.out.println(time4 - time3); //1ms 推荐这种可变序列的方法，耗时短
	}
}
