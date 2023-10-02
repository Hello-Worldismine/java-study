package array;

import java.util.*;

public class Baekjoon_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String ans = sc.next(); // 문자열로 입력
            char[] ans_arr = ans.toCharArray(); // 문자열을 char형 배열로 변환

            int cnt = 0; // 'O'의 개수를 새는 변수
            int sum = 0; // 점수 합 변수

            for (int j = 0; j < ans_arr.length; j++) {
                cnt += 1;
                if (ans_arr[j] == 'X') {
                    cnt = 0;
                }
                sum += cnt;
            }

            System.out.println(sum);
        }

        sc.close();
    }
}