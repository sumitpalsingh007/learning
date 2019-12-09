package com.richemont.cms.vca.ui.forms.loader;

public class Solution {
    public boolean solution(int[] A) {
        // write your code in Java SE 8

        int first = 0;
        int second = 0;
        int sum1 = A[0];
        int sum2 = 0;
        int sum3 = 0;
        for (int j = 1; j < A.length - 1 ; j++) {
            sum1 = sum1 + A[j];
            for (int k = j + 2; k < A.length - 2; k++) {
                sum2 = sum2 + A[k];
                for (int i = k+2; i <A.length - 2; i++)
                {
                    sum3 = sum3 + A[i];
                }
                System.out.println("sum1 = "+sum1);
                System.out.println("sum2 = "+sum2);
                System.out.println("sum3 = "+sum3);
                if (sum1 == sum2 && sum2 == sum3) {
                    return true;
                }
            }
        }
        return false;
        /*int sum1 = 0;


        int first = 0;
        int second =0;

        for (int i = 0; i < A.length - 1 ; i++) {
            sum1 = sum1 + A[i];
            first = i;
            int sum3 = 0;
            for (int j = A.length-1; j > i + 1 ; j--) {
            sum3 = sum3 + A[j];
                int sum2 = 0;
                for (int k = i + 2; k < j + 1; k++ ) {
                sum2 = sum2 + A[k];
                }
                 System.out.println("sum1 = "+sum1);
                System.out.println("sum2 = "+sum2);
                System.out.println("sum3 = "+sum3);
                if (sum1 == sum2 && sum2 == sum3) {
                return true;
                }
               }



        }
        return false;*/
    }
}
