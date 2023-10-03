import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[9];
        int max = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] > max) {					
                max = arr[i];	//max를 array에 최대값으로 넣어줌			
                count = i+1;					
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
//arr [] 배열에 들어가 있는 값이 max = 0 보다 클 경우 max로 들어감.
//count = i+1인 이유는 배열 안의 저장소 위치는 0부터 시작하기 때문. [0,1,2,3,4,5,6,7,8] = 9
//몇 번째 수인지 구해야 하니 +1을 해줌
