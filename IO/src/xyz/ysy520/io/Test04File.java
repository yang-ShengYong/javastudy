package xyz.ysy520.io;

import java.io.File;

/**
 * �ļ��ĴӴ�����ɾ��
 * @author yangshengyong
 *
 */
public class Test04File{
   public static void main(String args[]) {
       File f = new File("word.txt");
       
       if (f.exists()) {
    	   f.delete();
    	   System.out.println("word.txt ��ɾ��");
       } else {
    	   try {
    		   f.createNewFile();
    		   System.out.println("word.txt �Ѵ���");
    	   } catch (Exception e) {
    		   e.printStackTrace();
    	   }
       }
   } 
}
