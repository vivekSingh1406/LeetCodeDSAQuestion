package Array;

import java.util.Arrays;

public class MergeSort {


    public static void mergeSort(int[] arr) {
        if(arr.length==1) return;

        int[] left = new int[arr.length/2];
        int[] right = new int[arr.length-left.length];

        for(int i=0;i<left.length;i++){  // store the left array
            left[i]=arr[i];
        }

        for(int j = 0; j< right.length; j++){  // store the right arrays
            right[j]=arr[left.length+j];
        }

        sort(left);
        sort(right);
        merge(arr,left, right);
    }

    public static void sort(int[] arr){

        if(arr.length==1){
            return;
        }

        int[] left = new int[arr.length/2];
        int[] rigth = new int[arr.length-left.length];

        for(int i=0;i<left.length;i++){  // store the left array
            left[i]=arr[i];
        }

        for(int j=0;j<rigth.length;j++){  // store the right arrays
            rigth[j]=arr[left.length+j];
        }

        sort(left);
        sort(rigth);
        merge(arr,left,rigth);
    }

    public static void merge(int[] arr, int[] left, int[] right){

        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }
            else{
                arr[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<left.length){
            arr[k]=left[i];
            i++;
            k++;
        }

        while(j<right.length){
            arr[k]=right[j];
            j++;
            k++;
        }
    }


    public static void main(String[] args) {


        int[] arr = {8, 3, 5, 4, 7, 6, 1, 2};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(arr));
    }
}
