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
			
			ds.writeUTF("writeUTFд������");
			ds.writeChars("writeCharsд������");
			ds.writeBytes("writeBytesд������");
			
			ds.close();
			
			FileInputStream rf = new FileInputStream("datainputstream.txt");
			DataInputStream df = new DataInputStream(rf);
			System.out.println(df.readUTF()); //ֻ�ܶ�ȡ��writeUTFд�������
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
