
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
/*
* 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	47396	19009	15098	39.570%
문제
어느 날, 미르코는 우연히 길거리에서 양수 N을 보았다. 미르코는 30이란 수를 존경하기 때문에, 그는 길거리에서 찾은 수에 포함된 숫자들을 섞어 30의 배수가 되는 가장 큰 수를 만들고 싶어한다.

미르코를 도와 그가 만들고 싶어하는 수를 계산하는 프로그램을 작성하라.

입력
N을 입력받는다. N는 최대 105개의 숫자로 구성되어 있으며, 0으로 시작하지 않는다.

출력
미르코가 만들고 싶어하는 수가 존재한다면 그 수를 출력하라. 그 수가 존재하지 않는다면, -1을 출력하라.*/