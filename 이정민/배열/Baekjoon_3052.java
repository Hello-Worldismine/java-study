import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in); //입력 받기 위한 스캐너 클래스
        
        int[] arr = new int[10];
        boolean bl; // 배열의 n번째 나머지와 n+1번째 나머지 동일 여부 판단 변수
        int count = 0; // 서로 다른 나머지들의 개수 변수
        
        for(int i=0; i<arr.length; i++) {
        	arr[i] = sc.nextInt()%42;
        }
        
        for(int i=0; i<arr.length; i++) {
        	bl = false; // 기본값 초기화
            for(int j=i+1; j<arr.length; j++) {
            	if(arr[i] == arr[j]) {
                	bl = true;
                    break;
                }
            }
            if(bl==false) {
            	count++;
            }
        }
        
        system.out.println(count);
	}
}
//처음 반복문(for)을 통해서 배열의 길이만큼 수를 입력받습니다. 그리고 입력받은 수를 42로 나누었을 때의 나머지를 배열에 넣는다.
//이중 반복문(for)을 활용하여 배열 내부의 값이 동일한지 여부를 체크한다.
//즉, 첫 번째 for문의 i 값이 0일 때 j는 i보다 1부터 9까지 반복을 한다.
//따라서 배열에서 0번째 값과 1~9에 위치한 수들을 비교하는 것인데
//만약 값이 다르다면, 나머지 값 동일 여부 판단 변수인 bl이 false일 것이다.
//예를 들어서 1~9번째까지 동일한 수가 없다면 arr[0]의 값과 동일한 수는 어떤 위치에도 없다는 뜻이다.
//그렇다면 내부 for문은 종료가 되고 if문으로 넘어가서 count를 1 증가시킨다.
//반대로 내부 반복문을 도는 도중에 동일 값이 있다면 bl은 true가 되고 반복문을 그 시점에서 멈춘다.
//bl이 true이기 때문에 count 값도 증가하지 않는다. 이제 첫 for문의 처음으로 돌아가고 i는 1이 된다.
