package xyz.ysy520.oo;
/**
 * 	�ӿڶ��巽��ʡ��abstract
 * 	
 * @author yangshengyong
 *
 */
public interface MyInterface {
	int MAX_AGE = 100; //�ӿ��ж�����κ��ֶζ����Զ�static �� final��
	void test();		//�����Զ�public��abstract��
}

interface Interface1 {
	void test1();
}

interface Interface2 extends Interface1, MyInterface {
	void test2();
}

 class Test implements Interface2 { //���ڽӿڶ�̳���������������������ʵ��
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
 