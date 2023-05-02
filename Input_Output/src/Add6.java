import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Add6 { //10953백준
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str1,str2;
        StringBuilder sb=new StringBuilder();
        str1=br.readLine();
        StringTokenizer st=new StringTokenizer(str1);


        int t=Integer.parseInt(st.nextToken());
        for(int i=0;i<t;i++){
            str2= br.readLine();
            st=new StringTokenizer(str2,",");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            if(a<=0||b>=10) break;
            sb.append(a+b).append("\n");

        }
        System.out.print(sb);


    }
}
