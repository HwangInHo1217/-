import java.util.Scanner;
///백준 1000번
public class Add {
    public static void main(String[] args) {
        int a,b;

        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(sum(a,b));

    }
   static int sum(int a, int b){
        return a+b;
    }
}
