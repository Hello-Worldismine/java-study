import Java.util.Arrays;
import Java.util.Scanner;

public class main{
	public static void main(String[] args) {
		int num = sc.nextInt();
		int[] arr = new int[num];
	
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}

		Array.sort(arr);
		System.out.print(arr[0] + “ ” + arr[num-1]);
	}
}
//sort => 배열 정렬, 정렬 후에 [0]자리엔 최소값이 들어감
//최대값은 num(배열의 크기) - 1
