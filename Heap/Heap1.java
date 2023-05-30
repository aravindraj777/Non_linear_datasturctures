package com.Heap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Heap1 {

    public void buildHeap(ArrayList<Integer> arr){
        int n = arr.size();
        for(int i =(n/2)-1;i>=0;i--){
            heapify(arr,i,n);
        }
    }
    public void heapify(ArrayList<Integer>arr,int idx,int n){

        int left = 2*idx+1;
        int right = 2*idx+2;

        int midIdx = idx;

        if(left < n && arr.get(left) > arr.get(midIdx)){
            midIdx = left;
        }
        if(right < n && arr.get(right) > arr.get(midIdx)){
            midIdx = right;
        }
        if(midIdx!=idx){
            Collections.swap(arr,midIdx,idx);
            heapify(arr,midIdx,n);
        }
    }
    public  void heapSort(ArrayList<Integer>arr){
        int n = arr.size();

        for(int i=(n/2)-1;i>=0;i--){
            heapify(arr,0,i);
        }
        for(int i=n-1;i>0;i--){
            int temp= arr.get(0);
            arr.set(0,arr.get(i));
            arr.set(i,temp);

            heapify(arr,0,i);
        }


    }
    public  int remove(ArrayList<Integer>arr){
        int n= arr.size();

        int data = arr.get(0);
        int temp = arr.get(0);
        arr.set(0,arr.get(n-1));
        arr.remove(n-1);
        heapify(arr,0,n);


        return data;

    }
    public static void main(String[] args) {
        Heap1 h = new Heap1();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(7);
        arr.add(2);
        arr.add(1);
        arr.add(6);
        arr.add(8);
        arr.add(5);
        arr.add(3);
        arr.add(4);
        h.buildHeap(arr);
//        System.out.println(arr);
//        int rem= h.remove(arr);
//        System.out.println(rem);
//        System.out.println(arr);
        h.heapSort(arr);
        System.out.println(arr);

    }


}
