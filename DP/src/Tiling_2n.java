import java.util.Scanner;
public class Tiling_2n {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int DP[]=new int[1000];
        int n=sc.nextInt();
        DP[1]=1;
        DP[2]=2;
        for(int i=3;i<=n;i++){
            DP[i]=DP[i-2]+DP[i-1];
        }
        System.out.println(DP[n]%10007);
    }
}
