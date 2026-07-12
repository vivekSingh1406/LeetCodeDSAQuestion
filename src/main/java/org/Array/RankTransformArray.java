package org.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class RankTransformArray {

    public static int[] arrayRankTransform(int[] arr) {

        TreeSet<Integer> treeSet=new TreeSet<>();
        for(int val:arr){
            treeSet.add(val);
        }
        int[]ans=new int[arr.length];
        Map<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int val:treeSet){
            map.put(val,rank++);
        }
        int index=0;
        for(int val:arr){
            ans[index++]=map.get(val);
        }
        return ans;
    }

    public static void main(String[] args) {

        int [] input1 = {40,10,20,30};
        int [] input2 = {100,100,100};
        int [] input3 = {37,12,28,9,100,56,80,5,12};


        System.out.println(Arrays.toString(arrayRankTransform(input1)));
        System.out.println(Arrays.toString(arrayRankTransform(input2)));
        System.out.println(Arrays.toString(arrayRankTransform(input3)));

    }
}
