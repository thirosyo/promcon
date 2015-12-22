class SelectionSort{
    public void selectionSort(int hai[], int num){

        /* num個の要素分ソートを実施 */
        for (int loop = 0; loop < num ; loop++){

            /* 最小の要素 */
            int minj = loop;
            for ( int j = loop; j < num; j++){

                /* ソートしていない箇所で最小の値を探す */
                if ( hai[j] < hai[minj] ){
                    minj = j;
                }
            }

            /* 最小の値をソートされていない先頭の位置に格納 */
            int tmp = hai[loop];
            hai[loop] = hai[minj];
            hai[minj] = tmp;
        }
    }
}
