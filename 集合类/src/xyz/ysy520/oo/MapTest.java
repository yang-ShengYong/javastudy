package xyz.ysy520.oo;

import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		//Hash MapŒﬁ–Ú
		Map<String, String> map = new HashMap<String, String>();
		
		Emp emp = new Emp("213", "zhangsan");
		Emp emp2 = new Emp("021", "lisi");
		Emp emp3 = new Emp("5343", "wangwu");
		
		map.put(emp.getId(), emp.getName());
		map.put(emp2.getId(), emp2.getName());
		map.put(emp3.getId(), emp3.getName());
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//TreeMap”––Ú
		TreeMap<String, String> treemap = new TreeMap<String, String>();
		treemap.putAll(map);
		it = treemap.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

class Emp {
	private String id;
	private String name;
	
	public Emp(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
