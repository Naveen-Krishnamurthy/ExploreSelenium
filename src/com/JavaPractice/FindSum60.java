package com.JavaPractice;

/**
 * Created by User on 12/13/2017.
 */
public class FindSum60 {
    public static void main(String args[]) {
        int testArray[] = {2,6,10,14,18,22,26,30,34,38,42,46,50,54,58};
        for(int i =0 ;i<testArray.length-1;i++) {
            for (int j = 0; j < testArray.length - 1; j++) {
                for (int k = 0; j < testArray.length - 1; j++) {
                    if (testArray[i] != testArray[j] && testArray[j] != testArray[k] && testArray[i] != testArray[k]) {
                        System.out.print(testArray[i] + "," + testArray[j] + "," + testArray[k]+":");
                        System.out.println(testArray[i]+testArray[j]+testArray[k]);
                    }
                }
            }
        }

    }
}
