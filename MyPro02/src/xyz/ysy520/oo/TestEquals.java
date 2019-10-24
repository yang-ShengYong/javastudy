/**
 * 	判断对象（地址）是否相等
 * 	源码：
 * 	 public boolean equals(Object obj) {
 *		return (this == obj);
 *   }
 */

package xyz.ysy520.oo;

public class TestEquals {
	public static void main(String[] args) {
		Object obj;
		String str;
		
		User u = new User(001, "张三");
		User u2 = new User(002, "李四");
		System.out.println(u.equals(u2));
	}
}

class User {
	int id;
	String name;
	
	public User (int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals (Object obj) {
		
		
		return true;
	}
}
