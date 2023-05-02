import java.util.Scanner;
public class Make_one {//백준1463
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int X[]=new int[size+1];
        X[0]=X[1]=0;

        for(int i=2;i<size+1;i++){
            X[i]=X[i-1]+1;
            if(i%2==0) X[i]=(X[i]<=X[i/2]+1) ? X[i]:X[i/2]+1;
            if(i%3==0) X[i]=(X[i]<=X[i/3]+1) ? X[i]:X[i/3]+1;
        }
        System.out.println(X[size]);
    }
}