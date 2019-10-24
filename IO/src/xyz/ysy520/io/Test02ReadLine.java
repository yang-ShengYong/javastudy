package xyz.ysy520.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test02ReadLine {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		do {
			str = (String) br.readLine();
			System.out.println(str);
		} while(!str.equals("end")); //字符串最好别用 == 比较， 使用equals就完事了
	}
}
