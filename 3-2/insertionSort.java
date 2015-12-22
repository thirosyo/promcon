class insertionSort{
    public void insertionSort(int an[], int num){
        writeSort wt = new writeSort();
        for ( int loop = 1; loop <= num - 1; loop++){
            int v = an[loop];
            int j = loop - 1;

            while ( j >= 0 && an[j] > v ) {
                an[j+1] = an[j];
                j--;
            }
            an[j+1] = v;
            wt.writeSort(an);
        }
    }
}


