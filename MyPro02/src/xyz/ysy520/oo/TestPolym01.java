package xyz.ysy520.oo;
/**
 *	 说了半天原来是以不同类作为参数调用draw()都可以执行，只要参数是父类的子类
 * @author yangshengyong
 *
 */
public class TestPolym01 {
	public static void main(String[] args) {
		Square s = new Square();
		Parall p = new Parall();
		Parall p1 = new Parall();
		Quadrangle q = new Quadrangle();
		
		q.draw(s);
		q.draw(p);
		q.draw(p1);
	}
}

class Quadrangle {
	private Quadrangle[] qtest = new Quadrangle[6];
	private int nextIndex = 0;
	
	public void draw (Quadrangle q) {
		if (nextIndex < qtest.length) {
			qtest[nextIndex] = q;
			System.out.println(nextIndex);
			nextIndex++;
		}
	}
}

class Square extends Quadrangle {
	public Square () {
		System.out.println("Square");
	}
}

class Parall extends Quadrangle {
	public Parall () {
		System.out.println("Parall");
	}
}
