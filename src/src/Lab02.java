import java.util.Arrays;

public class Lab02 {
    public int[] twosum(int[]num,int sum){
        //this is an array to hold the indices of the numbers that equal sum.
        int []sumIndex = new int[2];
        // this is an array to hold -1.
        int []noSumArray = new int[1];
        // this is to make sure only one of the above arrays are returned.
        Boolean returnStatement = null;
        //this is to make sure I catch the sum and be able to compare it in the if statement(line 32)
        // bc tempTotal is going to continue to grow after I find the numbers that get the sum.

        int targetSumTotal = 0;

        for (int i=0; i<num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                int tempTotal = num[i] + num[j];
                //System.out.println(tempTotal);

                if (tempTotal == sum) {
                    sumIndex[0] = i;
                    sumIndex[1] = j;
                    //if tempTotal == sum then I've found the indices.
                    //So I want to save tempTotal in my new variable targetSumTotal.
                    //
                    targetSumTotal = tempTotal;
                    returnStatement = true;
                }
            }
        }
        //this is where I check, after I've gone through the whole array, if I should return -1
        if (targetSumTotal != sum) {
            noSumArray[0] = -1;
            returnStatement = false;
        }
        //this is where my boolean comes into play, so I can only return the correct array.
        if (returnStatement == true){
            return sumIndex;
        }else {
            return noSumArray;
        }
    }
    public static void main(String[] args) {
        //int[] numarray = {2,12,8,7} ;
        int[] numarray = {1,13,18,20,30} ;
        //int targetsum = 9;
        int targetsum = 40;
        Lab02 function = new Lab02();
        System.out.println(Arrays.toString(function.twosum(numarray, targetsum)));

    }

    /**
     * I don't know if this was asked for
     * Analysis:
     * runtime: n^2
     * space : n (linear)
     */

}
