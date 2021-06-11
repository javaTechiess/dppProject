package dppProject;

public class FindLastIndexOf1 {
	public static void main(String[] args) {
		System.out.println(lastIndex("000011001"));
	}
	/*
	 * worst case: Space: O(1) Time: O(n) best case: Space: O(1) Time: O(1)
	 */
	public static int lastIndex(String s) {
		int index = -1;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '1') {
				index = i;
				break;
			}
		}
		return index;
	}
}
