package xyz.ysy520.oo2;

import java.util.Arrays;

public class MultiArrays {
	public static void main(String[] args) {
		Object[] emp1 = {1001, "name", 18,"desc"};
		Object[] emp2 = {1001, "name", 18,"desc"};
		Object[] emp3 = {1001, "name", 18,"desc"};
		
		Object[][] arr = new Object[3][];
		arr[0] = emp1;
		arr[1] = emp2;
		arr[2] = emp3;
		for(Object[] m:arr) {
			System.out.println(Arrays.toString(m));
		}
		
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
