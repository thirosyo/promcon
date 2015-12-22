public class InsSort {

    /* 要素数上限 */
    public static final int NUM = 100;
    /* 要素の上限 */
    public static final int AN = 1000;
    
    public static void main(String []args){

        /* 要素数を取得 */
        int num = Integer.parseInt(args[0]);
        /* 要素数チェック */
        if ( num > NUM ){
            System.out.println("要素数を超えています。num = " + num );
            return ;
        }

        int an[] = new int[num];

        for ( int loop = 0; loop < num; loop++ ) {
            an[loop] = Integer.parseInt(args[loop + 1]);

            /* 要素の上限をチェック */
            if ( an[loop] > AN ){
                System.out.println();
                return ;
            }
        }

        /* ソートクラス */
        insertionSort ins = new insertionSort();

        ins.insertionSort(an, num);

        return ;
    }

}

