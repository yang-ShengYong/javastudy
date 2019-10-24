package xyz.ysy520.oo2;
/**
 * 数组拷贝
 * System.arraycopy(src, srcPos, dest, destPos, len)
 * 从数组中删除元素（利用数组拷贝）
 * @author yangshengyong
 *
 */
public class TestArrayCopy {
	public static void main(String[] args) {
		String[] s1 = {"aa", "bb", "cc", "dd", "ee"};
		String[] s2 = new String[10];
		System.arraycopy(s1, 2, s2, 6, 3);
		for(int i=0;i<s2.length;i++) {
			System.out.println(s2[i]);
		}
		
		removeElement(s1, 2);
		for(int i=0;i<s1.length;i++) {
			System.out.println(s1[i]);
		}
	}
	
	public static String[] removeElement(String[] s, int i) {
		System.arraycopy(s, i+1, s, i, s.length-(i+1));
		s[s.length-1] = null;
		return s;
	}
}
