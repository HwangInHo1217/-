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