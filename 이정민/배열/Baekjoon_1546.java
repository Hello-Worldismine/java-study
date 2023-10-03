import java.util.Scanner;

public class Main {

	public static void Main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		double max = 0;
	
		for (int I =0; I < n; I++) {
			int num = sc.nextInt();
			if (num > max) {
				max = num;
			}
			sum += num;
		}
		sc.close();
		System.out.printin(((sum/max)*100.0)/n);
	}
}
//최대값이 max보다 큰 경우 최대값으로 넣어주고 나머지는 sum에 더해서 넣어준다.
