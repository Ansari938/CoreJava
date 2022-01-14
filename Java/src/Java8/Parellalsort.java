package Java8;

import java.util.Arrays;

public class Parellalsort {
	public static void main(String[] args) {
	
	int[] arr = {1,2,3,6,9,4,};
    Arrays.parallelSort(arr);
	for(int i : arr) {
		System.out.println(i);
	}
	}
}
