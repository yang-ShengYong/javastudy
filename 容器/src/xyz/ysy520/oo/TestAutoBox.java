package xyz.ysy520.oo;
/**
 * �Զ�װ�� �Զ�����
 * @author yangshengyong
 *
 */
public class TestAutoBox {
	public static void main(String[] args) {
		//װ��
		Integer i = 100; //�������Զ� Integer i = new Integer(100);
		
		//����
		int b = i; //�������Զ� int b = i.intValue();
		
		//����[-128�� 127]֮�����
		Integer i1 = -128;
		Integer i2 = -128;
		System.out.println(i1 == i2); //true
		
		Integer i3 = 1000;
		Integer i4 = 1000;
		System.out.println(i3 == i4); //false
	}
}
