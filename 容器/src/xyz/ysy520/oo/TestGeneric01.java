package xyz.ysy520.oo;
/**
 * ���巺��ʱ���� ������ ��������
 * 
 * @author yangshengyong
 *
 */
public class TestGeneric01 {
	public static void main(String[] args) {
		OverClass1<Integer, Boolean> oc1 = new OverClass1<Integer, Boolean>();
		oc1.setOver(13);
		oc1.setOver1(false);
		
		System.out.println(oc1.getOver());
		System.out.println(oc1.getOver1());
		
		OverClass2<Integer, String> oc2 = new OverClass2<Integer, String>();
		String b[] = {"abc", "bca", "cba"};
		oc2.setOver1(b);
		for(String m : oc2.getOver1()) {
			System.out.println(m);
		}
		
	}
}

class OverClass1<T1, T2>{
	private T1 over;
	private T2 over1;
	
	public T1 getOver() {
		return over;
	}
	public void setOver(T1 over) {
		this.over = over;
	}
	public T2 getOver1() {
		return over1;
	}
	public void setOver1(T2 over1) {
		this.over1 = over1;
	}
}

class OverClass2<T1, T2>{
	private T1 over;
	private T2[] over1;
	
	public T1 getOver() {
		return over;
	}
	public void setOver(T1 over) {
		this.over = over;
	}
	public T2[] getOver1() {
		return over1;
	}
	public void setOver1(T2[] over1) {
		this.over1 = over1;
	}
}
