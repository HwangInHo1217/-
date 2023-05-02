import java.util.Scanner;
public class Add_5 {
    public static void main(String[] args) {//10952 백준
        Scanner sc=new Scanner(System.in);
        int a,b;
        while(sc.hasNextInt()){
            a=sc.nextInt();
            b=sc.nextInt();
            if(a==0&&b==0) break;
            else if(a<=0||b>=10) break;
            System.out.println(a+b);
        }
    }
}
