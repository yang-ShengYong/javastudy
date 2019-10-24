package xyz.ysy520.oo;
/**
 * 	HashMap无顺序 但效率更高
 * 	TreeMap有顺序
 */
import java.util.*;

public class UpdateStu {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
	
		map.put("001", "zhangsan");
		map.put("002", "lisi");
		map.put("003", "wangwu");
		map.put("004", null);
		map.put(null, null);
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Collection<String> coll = map.values();
		it = coll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
