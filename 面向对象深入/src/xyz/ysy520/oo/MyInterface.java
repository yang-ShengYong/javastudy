package xyz.ysy520.oo;
/**
 * 	接口定义方法省略abstract
 * 	
 * @author yangshengyong
 *
 */
public interface MyInterface {
	int MAX_AGE = 100; //接口中定义的任何字段都是自动static 和 final的
	void test();		//方法自动public和abstract的
}

interface Interface1 {
	void test1();
}

interface Interface2 extends Interface1, MyInterface {
	void test2();
}

 class Test implements Interface2 { //由于接口多继承所以上面三个方法都得实现
	 @Override 
	 public void test() {
		
	 }
	 
	 @Override
	 public void test1() {
		 
	 }
	 
	 @Override
	 public void test2() {
		 
	 }
 }
 