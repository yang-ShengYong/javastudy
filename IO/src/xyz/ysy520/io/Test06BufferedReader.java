package xyz.ysy520.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * ��д�ļ��Ǿ���������
 * BufferedReader BufferedWriter
 * @author yangshengyong
 *
 */
public class Test06BufferedReader {
	public static void main(String[] args) {
		File f = new File("BufferedReaderTest.txt");
		String s[] = {"string0", "string1", "string2"};
		
		//ͨ��bufferedWriter�Ļ�����д���ļ�
		try {
			FileWriter fw = new FileWriter(f);
			BufferedWriter bwfw = new BufferedWriter(fw);
			for (int i = 0; i<s.length;i++) {
				bwfw.write(s[i]);
				bwfw.newLine();
			}
			bwfw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//��ȡ�ļ�
		try {
			FileReader fr = new FileReader(f);
			BufferedReader brfr = new BufferedReader(fr);
			
			String str = null;
			while ((str = brfr.readLine()) != null) {
				System.out.println(str);
			}
			
			brfr.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}