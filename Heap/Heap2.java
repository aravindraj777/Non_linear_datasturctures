package com.Heap;

import java.util.ArrayList;
import java.util.Collections;

public class Heap2 {

    public void AddElement(ArrayList<Integer> array,int data){
        array.add(data);

        int n = array.size()-1;
        int parent = (n-1)/2;

        while(array.get(n) > array.get(parent)){
            Collections.swap(array,n,parent);
            n = parent;
            parent = (n-1)/2;
        }

    }

    public int peek(ArrayList<Integer> array){
        return array.get(0);
    }
    public void buildHeap(ArrayList<Integer> array){
        int n = array.size()-1;
        for(int i=(n-1)/2;i>=0;i--){
            heapify(array,i,n);
        }
    }
    public void heapify(ArrayList <Integer> array,int i,int n){
        int left = 2*i+1;
        int right = 2*i+2;
        int midIndx = i;

        if(left <array.size() && array.get(left) > array.get(midIndx) ){
            midIndx = left;

        }
        if(right < array.size() && array.get(right) > array.get(midIndx)){
            midIndx = right;
        }
        if(midIndx!=i){
            int temp = array.get(i);
            array.set(i,array.get(midIndx));
            array.set(midIndx,temp);
            heapify(array,midIndx,n);
        }
    }
}

class  main2{


    public static void main(String[] args) {
        Heap2 heap = new Heap2();
        ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(45);
        array.add(78);
        array.add(23);
        array.add(12);
        array.add(32);
        array.add(19);
        array.add(20);
        array.add(36);

        System.out.println(array);
        heap.buildHeap(array);
        System.out.println(array);

    }

}
