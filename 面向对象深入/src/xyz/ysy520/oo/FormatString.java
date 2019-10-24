package xyz.ysy520.oo;

import java.util.Date;

/**
 * 	字符串格式化
 * 		日期格式化
 * @author yangshengyong
 *
 */
public class FormatString {
	public static void main(String[] args) {
		Date date = new Date();
		
		String y = String.format("%tY", date);
		String m = String.format("%tm", date);
		String d = String.format("%te", date);
		
		System.out.println(y+"年"+m+"月"+d+"日");
	}
}
