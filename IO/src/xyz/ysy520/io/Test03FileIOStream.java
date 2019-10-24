package xyz.ysy520.io;
/**
 * �ļ�����/�����
 */
import java.io.*;

public class Test03FileIOStream {
	public static void main(String[] args) {
		//����a.txt�е�����
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
		
		//��a.txt��д������
		if (f.exists()) {
			try {
				FileOutputStream out = new FileOutputStream(f);
				byte msg[] = "hello java ����".getBytes();
				out.write(msg);
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("a.txt������");
		}
	}
}