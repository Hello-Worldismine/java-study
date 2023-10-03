import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();

		int[] counts = new int[10];
		int number = A * B * C;
		while (number > 0) {
			counts[number % 10]++;
			number /= 10;
		}
		for (int i = 0; i < counts.length; ++i) {
			System.out.println(counts[i]);
		}
	}
}
//숫자를 10으로 나눈 나머지는 1의 자리의 수가 됨
//이렇게 나머지를 구하여 0~9 인덱스를 가지는 배열에 카운트를 더하고,
//실제 숫자를 10으로 나눈다.
//그리고 while을 사용하여 나눈 숫자가 0보다 큰 동안 반복
