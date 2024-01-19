import java.util.Scanner;

public class EasyStair{
    public static void main(String[] args) {

        long Result=0;
        long DP[][]=new long[101][10];
        int Mod = 1000000000;


        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        for (int i = 1; i <= 9; i++) DP[1][i] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == 0) DP[i][0] = DP[i - 1][j + 1] % Mod;
                else if (j == 9) DP[i][9] = DP[i - 1][j - 1] % Mod;
                else DP[i][j] = DP[i - 1][j - 1] + DP[i - 1][j + 1] % Mod;

            }
        }
        for (int k = 0; k <= 9; k++) Result += DP[n][k] % Mod;
        System.out.println(Result%Mod);
    }
}
/*
문제
        45656이란 수를 보자.

        이 수는 인접한 모든 자리의 차이가 1이다. 이런 수를 계단 수라고 한다.

        N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구해보자. 0으로 시작하는 수는 계단수가 아니다.

        입력
        첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.

        출력
        첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.*/
