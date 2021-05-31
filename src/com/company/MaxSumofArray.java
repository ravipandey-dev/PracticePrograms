package com.company;

public class MaxSumofArray {

    public static void main(String[] args) {
        int a[]={-1, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("max is " + findMaxSum(a));
    }

    private static int findMaxSum(int[] a) {
        int maxSoFar=0;
        int currentMax=0;

        for(int i=0;i<a.length;i++){
            currentMax=currentMax+a[i];
            if(maxSoFar<currentMax){
                maxSoFar=currentMax;
            }
            if(currentMax<0){
                currentMax=0;
            }
        }
        return maxSoFar;
    }
}
