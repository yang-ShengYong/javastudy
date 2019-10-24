
public class Constructor {
	public static void main(String[] args) {
		Point p1 = new Point(3, 4);
		Point p2 = new Point(1, 1);
		System.out.println(p2.distance(p1));
	}
}

class Point {
	double x;
	double y;
	double z;
	public Point (double x, double y) {
		this.x = x;
		this.y = y;
	}
	public Point (double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public double distance (Point p) {
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
	}
}
