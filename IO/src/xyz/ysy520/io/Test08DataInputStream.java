package xyz.ysy520.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test08DataInputStream {
	public static void main(String[] args) {
		try {
			FileOutputStream fs = new FileOutputStream("datainputstream.txt");
			DataOutputStream ds = new DataOutputStream(fs);
			
			ds.writeUTF("writeUTF写入数据");
			ds.writeChars("writeChars写入数据");
			ds.writeBytes("writeBytes写入数据");
			
			ds.close();
			
			FileInputStream rf = new FileInputStream("datainputstream.txt");
			DataInputStream df = new DataInputStream(rf);
			System.out.println(df.readUTF()); //只能读取用writeUTF写入的数据
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
