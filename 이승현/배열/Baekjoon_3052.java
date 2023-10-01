package array;

import java.util.*;

public class Baekjoon_3052 {
    public static void main(String[] args) {
        // 10개을 입력받고 각각 42로 나눈 것을 배열에 넣고 정렬. 그리고 for문을 이용해서 비교한다.
        Scanner sc = new Scanner(System.in);

        int[] rest = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int cnt = 1; // 모두 같아도 종류는 1개부터 시작

        for (int i = 0; i < 10; i ++){
            int a = sc.nextInt();
            rest[i] = a % 42;
        }

        sc.close();

        Arrays.sort(rest); // 정렬

        for (int i = 0; i < 9; i++){
            if (rest[i] != rest[i+1]){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
