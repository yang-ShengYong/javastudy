package xyz.ysy520.oo;

import java.util.*;

public class Gather {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		int i = (int)(Math.random()*list.size());
		list.remove(i);
		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
		}
	}
}
