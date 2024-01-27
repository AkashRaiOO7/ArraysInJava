package com.ds.arrayprg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayListBasic {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        List<ArrayList<String>> mutilArray= new ArrayList<>();
        IntStream.range(0, 4).forEach(index->mutilArray.add(new ArrayList<>()));
        for(int i=0; i<mutilArray.size();i++){
            for(int j=0; j<3; j++){
                mutilArray.get(i).add(in.next());
            }
        }
        mutilArray.stream().forEach(System.out::println);
    }
}
