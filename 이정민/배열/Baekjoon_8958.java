import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String str;
        int score;
        int sum;
        for (int i = 0; i < N; i++) {
            sum = 0;
            score = 0;
            str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    score++;
                    sum += score;
                } else {
                    score = 0;
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
/*
1. 테스트 케이스의 개수 N을 입력받는다.

2. N번만큼 반복한다.

  2-1. 반복을 시작할 때 점수를 더할 sum과 문제의 점수 score를 0으로 초기화한다.

  2-2. 테스트 케이스를 String타입으로 str변수에 입력받는다.

  2-3. str.length()로 문자 길이만큼 반복한다.

    1) 만약 첫문자(char)가 'O' 이라면 점수 score++ 후 sum에 더한다.

    2) 아니라면 score = 0 으로 초기화시킨다.

        (왜냐하면 연속된 정답이면 점수를 올리고 아니면 처음부터니까)

  2-4. 테스트케이스의 점수 sum을 출력한다.
  */
