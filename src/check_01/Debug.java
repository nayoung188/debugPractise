package check_01;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Debug {

	// 디버깅 사용 연습
	// 디버깅 : 소스코드에서 잘못된 코드를 발견하고 올바르게 동작하는 과정
	
	public static void main(String[] args) {
		prac03();
		
	}
	
	public static void prac01() {
		
		Integer[] array = {1, 5, 64, 75, 80, 99};
		
		Arrays.sort(array, Collections.reverseOrder());
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("[" + array[i] + "]");
		}
	}
	
	public static void prac02() {
		int[] arr = {5, 9, 3, 7, 1};
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("최대값  : " + max);
	}
	
	public static void prac03() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0; i < arr.length; i++) {
			System.out.println("정수를 입력하세요 >>> ");
			arr[i] = sc.nextInt();
		}
		int count = 0;
//		Set<Integer> set = new HashSet<>();
//		for(int i = 0; i < arr.length; i++) {
//			int num = arr[i];
//			if(!set.contains(num)) {
//				set.add(num);
//			} else {
//				set.remove(num);
//			}
//		}
//		count = set.size();
//		
//		boolean[] isDuplicate = new boolean[arr.length];
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = i+1; j < arr.length; j++) {
//				if(arr[i] == arr[i]) {
//					isDuplicate[i] = true;
//					isDuplicate[j] = true;
//				}
//			}
//		}
//		for(int i = 0; i < isDuplicate.length; i++) {
//			if(!isDuplicate[i]) {
//				count++;
//			}
//		}
		for( int i=0; i<arr.length; i++) {
			count = Collections.frequency(Arrays.asList(arr), arr[i]);
			if(count > 1) {
				
				System.out.println("중복되지 않는 수의 개수 : " + count);
			}
		}
		
	}
	
	public static void prac04() {
		int sum = 0;
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int mul = i*j;
				sum += mul;
				System.out.println(i + " * " + j + " = " + mul);
			}
		}
		
		System.out.println("\n1 부터 9단 까지 값의 합 : " + sum);
	}
	
}
