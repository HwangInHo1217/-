import java.util.Scanner;
public class CompetitionOrIntern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, k;
        n = sc.nextInt();//여자
        m = sc.nextInt();//남자
        k = sc.nextInt();//인턴
        if (n > 0 && m > 0 && k > 0) {
            if (n >= m * 2 && n * m != 0 && n + m > k) { //여자가 많은경우
                n -= k;
                if (m <= n / 2) {
                    System.out.println(m);
                    return;
                } else if (n / 2 < (n + m) / 3) {
                    System.out.println(n / 2);
                    return;
                } else {
                    System.out.println((n + m) / 3);
                    return;
                }

            }
            /* m >= n/2 */
            else if (n * m != 0 && n + m > k) { //남자가 많은경우
                m -= k;
                if (n / 2 < (n + m) / 3) {
                    System.out.println(n / 2);
                    return;
                } else {
                    System.out.println((n + m) / 3);
                    return;
                }
            }
        }

        System.out.println(0);

    }
}

/*
* 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	136881	72820	55769	52.265%
문제
준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.

동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)

둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)

출력
첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.
* */