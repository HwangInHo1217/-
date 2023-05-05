import java.util.Scanner;
public class Sum_123 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int DP[]=new int[11];
        int Result[]=new int[n];
        DP[1]=1;
        DP[2]=2;
        DP[3]=4;
        for(int i=4;i<11;i++)
            DP[i]=DP[i-3]+DP[i-2]+DP[i-1];
        for(int i=0;i<n;i++)
            Result[i]=DP[sc.nextInt()];
        for(int i=0;i<n;i++)
            System.out.println(Result[i]);
    }
}
