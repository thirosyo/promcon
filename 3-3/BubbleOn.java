class BubbleOn{
    public int bubbleon(int an[]){
        boolean flag = true;
        int count = 0;

        while (flag){
            flag = false;

            for ( int loop = an.length - 1; loop > 0; loop--){
                if ( an[loop] < an[loop - 1]){
                    int temp = an[loop];
                    an[loop] = an[loop - 1];
                    an[loop - 1] = temp;
                    flag = true;
                    count++;
                }
            }
        }
        return count;
    }
}
