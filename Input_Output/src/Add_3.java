import java.util.Scanner;
public class Add_3 {
    ///백준 10950
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a, b;
        int R[] = new int[size];
        for (int i = 0; i < size; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            R[i] = sum(a, b);
        }

       /* int T[][]=new int[size][2];
        int R[]=new int[size];
        for(int i=0;i<size;i++){
            for(int j=0;j<T[i].length;j++){
                T[i][j]=sc.nextInt();

            }
            if(T[i][0]<=0) break;
            if(T[i][1]>=10)break;
            R[i]=sum(T[i][0],T[i][1]);
        }*/
        for (int i = 0; i < size; i++) {
            System.out.println(R[i]);

        }
    }
        static int sum(int a,int b){
            return a + b;
        }
    }
