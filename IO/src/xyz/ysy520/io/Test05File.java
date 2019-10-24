package xyz.ysy520.io;

import java.io.File;

/**
 * 获取文件信息
 * @author yangshengyong
 *
 */
public class Test05File {
	public static void main(String[] args) {
		File f = new File("a.txt");
		if (f.exists()) {
			String name = f.getName();
			long len = f.length();
			System.out.println(name);
			System.out.println(len);
		} else {
			System.out.println("文件不存在");
		}
	}
}
