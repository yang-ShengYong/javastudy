package xyz.ysy520.io;
/**
 * BufferedReader
 * read() 读字符
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

public class Test01 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c;
		
		System.out.println("输入字符，直到q退出");
		
		do {
			c = (char) br.read();
			System.out.println(c);
		} while(c != 'q');
	}
}
