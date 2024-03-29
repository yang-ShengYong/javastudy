package xyz.ysy520.io;
/**
 * 文件输入/输出流
 */
import java.io.*;

public class Test03FileIOStream {
	public static void main(String[] args) {
		//读出a.txt中的数据
		File f = new File("a.txt");
		
		try {
			FileInputStream in = new FileInputStream(f);
			byte byt[] = new byte[1024];
			int len = in.read(byt);
			System.out.println(new String(byt, 0, len));
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//往a.txt中写入数据
		if (f.exists()) {
			try {
				FileOutputStream out = new FileOutputStream(f);
				byte msg[] = "hello java 汉字".getBytes();
				out.write(msg);
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("a.txt不存在");
		}
	}
}
