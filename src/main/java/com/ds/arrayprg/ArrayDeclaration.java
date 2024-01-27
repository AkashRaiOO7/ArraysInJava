package com.ds.arrayprg;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ArrayDeclaration {
    public static void main(String[] args) {
        //primitive array example
        int[] integerArray= {10,20,30,40};
        char[] characterArray= new char[]{'a','b','c'};
        float[] floatArray=new float[3];
        floatArray[0]=10.4f;
        floatArray[1]=89;

        //non-primitive array example
        String[] stringArray= new String[]{"str1", "str2", "str3"};

        //2-D primitive array example
        int[][] int2DArray= new int[2][3];
        int2DArray[0][0]=20;
        int2DArray[0][1]=10;
        int2DArray[0][2]=5;
        int2DArray[1][0]=12;
        int2DArray[1][1]=10;

        int[][] array2D= new int[][]{
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        /**
         * Accessing array 1-D
         */
        for(int i=0; i<integerArray.length; i++){
            System.out.println(integerArray[i]);
        }
        Arrays.stream(integerArray).forEach(System.out::println);
        IntStream.of(integerArray);
        System.out.println("Array of float handled with Double");
        Arrays.stream(IntStream.range(0, floatArray.length).mapToDouble(i -> floatArray[i]).toArray()).forEach(System.out::println);
        System.out.println("__________");
        IntStream.range(0, stringArray.length).forEach(System.out::println);
        System.out.println("__________");
        String s = Arrays.toString(floatArray);
        System.out.println(s);
        System.out.println("----printing by using Arrays.toString----");
        System.out.println(Arrays.toString(characterArray));
        /**
         * Accessing 2-D Array
         */
        System.out.println("Printing 2D integer Array");
        for(int i=0; i<int2DArray.length; i++){
            for(int j=0; j<int2DArray[i].length; j++){
                System.out.print(int2DArray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Printing 2-D array using for each loop");
        for(int[]arr: int2DArray){
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("Printing 2-D array using for loop");
        for(int i=0; i<array2D.length; i++){
            System.out.println(Arrays.toString(array2D[i]));
        }
    }
}