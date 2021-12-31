package ch20;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		// int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int total = 0;
		
		double[] dArr = new double[5];
		int count = 0;
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
		
		for(int i=0, num=1; i<arr.length; i++) {
			arr[i] = num++;
		}
		
		// enhanced for문 (향상된 for문)
		// 처음부터 끝까지 돌때 사용
		for(int num : arr) {
			total += num;	// num에 순차적으로 값이 들어감
		}
		
		// 요소의 개수에 대한 변수(count)를 따로 유지
		double mtotal = 1;
		for(int i=0; i<count; i++) {
			mtotal *= dArr[i];
		}
		
		System.out.println(total);
		System.out.println(mtotal);

	}

}
