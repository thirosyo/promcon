import java.io.*;
import java.util.*;

public class BubbleSort{
    public static final int NUM = 100;
    public static final int AN = 100;

    public static void main(String[] args ){
        try {
            /* ファイル読み込み */
            File file = new File("/Users/takaaki/Documents/procon/3-3/bubble.txt");
            BufferedReader br = new BufferedReader(new FileReader("bubble.txt"));

            /* 要素数を読み込み */
            String str_num = br.readLine();
            int num = Integer.parseInt(str_num);
            /* 要素数が100がより大きい場合はエラー */
            if ( num > NUM ){
                System.out.println("要素数が大きすぎます");
                return ;
            }

            /*  ソートする要素を読み込み */
            int an[] = new int[num];
            int loop = 0;
            str_num = br.readLine();
            StringTokenizer st = new StringTokenizer(str_num, " ");

            while (st.hasMoreTokens()){
                an[loop] = Integer.parseInt(st.nextToken());
                /* 要素が100より大きい場合はエラー */
                if (an[loop] > AN ){
                    System.out.printf("要素が大きすぎます");
                    return ;
                }
                loop++;
            }

            br.close();

            /* ソート実施 */
            BubbleOn bo = new BubbleOn();
            int count = bo.bubbleon(an);

            /* ソート結果を出力 */
            for (loop = 0; loop < num ; loop ++){
                System.out.print(an[loop] + " ");
            }
            System.out.println();
            System.out.println(count);

        } catch (FileNotFoundException e ){
           System.out.println(e);
        } catch (IOException e ){
           System.out.println(e);
        } 
    }
}


