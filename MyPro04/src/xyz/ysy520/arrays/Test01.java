package xyz.ysy520.arrays;

public class Test01 {
	public static void main(String[] args) {
		int[] arr1 = null; //��������
		arr1 = new int[10]; //���������ռ�
		
		arr1[0] = 115;
		arr1[1] = 120;
		
		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
		}
		
		//������������
		User[] arr2 = new User[3];
		arr2[0] = new User(1001, "����");
		arr2[1] = new User(1002, "����");
		arr2[2] = new User(1003, "����");
		
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