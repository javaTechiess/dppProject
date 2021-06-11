package dppProject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Consecutive2MissingNumbers {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 10 };
		Arrays.sort(arr);
		List list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		int n = arr[arr.length - 1];
		for (int i = 1; i < n; i++) {
			if (!list.contains(i)) {
				System.out.println(i);
			}
		}
	}

}
