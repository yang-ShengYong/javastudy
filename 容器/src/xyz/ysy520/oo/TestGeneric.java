package xyz.ysy520.oo;
/**
 * 泛型
 * 1、可以传不同类型（引用类型和包装类）参数，但不能是原始类型
 * 2、可以对传进来的参数有所限制
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
