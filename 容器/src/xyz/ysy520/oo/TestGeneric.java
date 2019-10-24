package xyz.ysy520.oo;
/**
 * ����
 * 1�����Դ���ͬ���ͣ��������ͺͰ�װ�ࣩ��������������ԭʼ����
 * 2�����ԶԴ������Ĳ�����������
 * @author yangshengyong
 *
 */
public class TestGeneric {
	public static void main(String[] args) {
	    OverClass<Float> f = new OverClass<Float>();
	    OverClass<Boolean> b = new OverClass<Boolean>();
	    
	    f.setOver(3.14F);
	    b.setOver(true);
	    
	    System.out.println(f.getOver());
	    System.out.println(b.getOver());
	}
}

class OverClass<T> {
	private T over;
	
	public T getOver() {
		return this.over;
	}
	public void setOver(T over) {
		this.over = over;
	}
}
