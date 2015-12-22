import java.io.*;
import java.util.*;

class SelectionSortMain{
    public static void main(String[] args) throws IOException{

        /* ターミナル入力 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* 要素数を取得 */
        int num = Integer.parseInt(br.readLine());

        /* ソートする要素を読み込み */
        int hai[] = new int[num];
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        for ( int loop = 0; st.hasMoreTokens(); loop++){
            hai[loop] = Integer.parseInt(st.nextToken());
        }

        SelectionSort ss = new SelectionSort();
        ss.selectionSort(hai, num);

        System.out.println(num);
        for ( int loop = 0; loop < num; loop++){
            System.out.print(hai[loop] + " ");
        }
        System.out.println();
    }
}



