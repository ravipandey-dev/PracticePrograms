package com.company;

import java.util.Arrays;

public class SortBinaryArray {

    public static void main(String[] args) {
        int[] binary={1,0,1,0};
        int j=-1;
        int temp;
        for(int i=0;i<binary.length;i++){
            if(binary[i]<1){
                j++;
                temp=binary[j];
                binary[j]=binary[i];
                binary[i]=temp;
            }
        }
   for(Integer i:binary){
       System.out.println(i);
   }
    }
}
