import java.util.Scanner;
import java.util.Arrays;
public class NumberCombine {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int n_cnt=0;
        int p_cnt=0;
        boolean z_cnt=false;
        int arr[]=new int[n];
        int result=0;
        for(int i=0;i<n;i++)
        {
            int tmp = sc.nextInt();
            arr[i]=tmp;
            if(tmp>0)
                p_cnt++;
            else if (tmp==0)
                z_cnt=true;
            else
                n_cnt++;

        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.println("arr = " +i +" : "+ arr[i]);
        if(p_cnt%2==0){
            int tmp = n-1;
            for(int i=0;i<p_cnt/2;i++){
                result += Math.max(arr[tmp]*arr[tmp-1],arr[tmp]+arr[tmp-1]);
                tmp-=2;
            }
            //System.out.println("in Pos_cnt__result = " + result);
        }
        else if (p_cnt%2==1){
            int tmp = n-1;
            if (p_cnt==1){
                result+=arr[tmp];
            }
            else {
            for(int i=0; i<p_cnt/2; i++){
                result += Math.max(arr[tmp]*arr[tmp-1],arr[tmp]+arr[tmp-1]);
                tmp-=2;
            }
            result+=arr[tmp];
              //  System.out.println("in Pos_cnt__result = " + result);
            }
        }

        if(n_cnt%2==0){
            for(int i=0;i<n_cnt;i+=2){
                result += Math.max(arr[i]*arr[i+1],arr[i]+arr[i+1]);
            }
        }
        else if(n_cnt%2==1){

           if(z_cnt) {
               for (int i = 0; i < n_cnt-1; i += 2) {
                   result += Math.max(arr[i] * arr[i + 1], arr[i] + arr[i + 1]);
               }
               result += arr[n_cnt - 1]*0;
           }
           else{
               if (n_cnt == 1) {
                   result += arr[n_cnt - 1];
               }
               else {
                   for (int i = 0; i < n_cnt-1; i += 2) {
                       result += Math.max(arr[i] * arr[i + 1], arr[i] + arr[i + 1]);
                   }
                   result += arr[n_cnt - 1];
                 //  System.out.println("in neg_cnt__result = " + result);
               }
        }
    }
        System.out.println(result);
    }
    public static int N_check(int arr[]) {
        int cnt=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] < 0)
                cnt++;
        }
        return cnt;
    }
    public static int P_check(int arr[]){
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0)
                cnt++;
        }
        return cnt;
    }


}
/*
* 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	37674	12593	10080	32.629%
문제
길이가 N인 수열이 주어졌을 때, 그 수열의 합을 구하려고 한다. 하지만, 그냥 그 수열의 합을 모두 더해서 구하는 것이 아니라, 수열의 두 수를 묶으려고 한다. 어떤 수를 묶으려고 할 때, 위치에 상관없이 묶을 수 있다. 하지만, 같은 위치에 있는 수(자기 자신)를 묶는 것은 불가능하다. 그리고 어떤 수를 묶게 되면, 수열의 합을 구할 때 묶은 수는 서로 곱한 후에 더한다.

예를 들면, 어떤 수열이 {0, 1, 2, 4, 3, 5}일 때, 그냥 이 수열의 합을 구하면 0+1+2+4+3+5 = 15이다. 하지만, 2와 3을 묶고, 4와 5를 묶게 되면, 0+1+(2*3)+(4*5) = 27이 되어 최대가 된다.

수열의 모든 수는 단 한번만 묶거나, 아니면 묶지 않아야한다.

수열이 주어졌을 때, 수열의 각 수를 적절히 묶었을 때, 그 합이 최대가 되게 하는 프로그램을 작성하시오.

입력
첫째 줄에 수열의 크기 N이 주어진다. N은 50보다 작은 자연수이다. 둘째 줄부터 N개의 줄에 수열의 각 수가 주어진다. 수열의 수는 -1,000보다 크거나 같고, 1,000보다 작거나 같은 정수이다.

출력
수를 합이 최대가 나오게 묶었을 때 합을 출력한다. 정답은 항상 231보다 작다.
* */