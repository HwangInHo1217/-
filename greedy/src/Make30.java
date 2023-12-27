
import java.util.Arrays;
import java.util.Scanner;

public class Make30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n= sc.nextLine();
        int Array[] = new int[n.length()];
        for(int i=0;i<n.length(); i++)
            Array[i]=n.charAt(i)-'0';
        Arrays.sort(Array);
        valid(Array, n.length());
/*       for(int j=0;j<Array.length;j++)
            System.out.println("Array = " + "["+j+"]"+ " = " + Array[j]);*/

    }
    public static int[] sort(int []Array, int size){
        int tmp = 0;
        for(int i=0; i<size; i++){
            for( int j=i; j<size; j++){
                if (Array[i]<Array[j]){
                    tmp=Array[i];
                    Array[i]=Array[j];
                    Array[j]=tmp;
                }
            }
        }
        return Array;
    }
    public static void valid(int[] array, int size){
        int sum = 0;
     //   System.out.println("size = " + size);
        for(int i=0; i< size; i++){
            sum+=array[i];
        }
        if (sum%3 == 0 && array[0] == 0){
            for(int j = size-1; j >= 0; j--){
                System.out.print(array[j]);
            }
            System.out.print("\n");
        }
        else{
            System.out.println(-1);
        }
    }

}
