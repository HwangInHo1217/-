import java.util.Scanner;
public class SickKnight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        int cnt=1;
        n=sc.nextInt();
        m=sc.nextInt();
        if (m < 7){
            while(m>0){
                m-=1;
                cnt++;
                m-=2;
                cnt++;
            }
        }
        System.out.println("m = " + m);
        System.out.println("cnt = " + cnt);
       /* while(n > 0 && m > 0){

        }*/
    }
}
/*
* 이동횟수가 4번 이상일 경우 최소 조건
* ㄴ> n >= 4 m >=7
* ㄴ> 병든 나이트는 우측으로 밖에 이동하지 못해서 가로 길이 중요
* ㄴ> 즉 새로길이는 최소 3줄 이상 가로길이
* */
