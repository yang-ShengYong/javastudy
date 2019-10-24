package xyz.ysy520.arrays;

public class Test01 {
	public static void main(String[] args) {
		int[] arr1 = null; //声明数组
		arr1 = new int[10]; //给数组分配空间
		
		arr1[0] = 115;
		arr1[1] = 120;
		
		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
		}
		
		//创建引用类型
		User[] arr2 = new User[3];
		arr2[0] = new User(1001, "张三");
		arr2[1] = new User(1002, "李四");
		arr2[2] = new User(1003, "王五");
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i].getId() + " " + arr2[i].getName());
		}
	}
}

class User {
	private int id;
	private String name;
	
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}