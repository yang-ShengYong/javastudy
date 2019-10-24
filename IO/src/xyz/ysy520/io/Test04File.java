package xyz.ysy520.io;

import java.io.File;

/**
 * 文件的从创建与删除
 * @author yangshengyong
 *
 */
public class Test04File{
   public static void main(String args[]) {
       File f = new File("word.txt");
       
       if (f.exists()) {
    	   f.delete();
    	   System.out.println("word.txt 已删除");
       } else {
    	   try {
    		   f.createNewFile();
    		   System.out.println("word.txt 已创建");
    	   } catch (Exception e) {
    		   e.printStackTrace();
    	   }
       }
   } 
}
