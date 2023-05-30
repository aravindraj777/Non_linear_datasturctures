package com.Heap;

import java.util.ArrayList;
import java.util.Collections;

public class Heap4 {

    public void addElement(ArrayList<Integer> arr,int data){
        arr.add(data);

        int n = arr.size()-1;
        int parent = (n-1)/2;
        if(arr.get(n) > arr.get(parent)){
            Collections.swap(arr,n,parent);
            n = parent;
            parent = (n-1)/2;

        }

    }
    public int  peek(ArrayList<Integer> arr){
        return arr.get(0);
    }

    public void buildHeap(ArrayList<Integer> arr){

        int n = arr.size();
        for(int i = (n-1)/2;i>=0;i--){
            heapify(arr,i,n);
        }
    }
    public void heapify(ArrayList<Integer> arr ,int i,int n){

        int left = 2*i+1;
        int right = 2*i+2;
        int mid = i;

        if(right < n && arr.get(right) > arr.get(mid) ){
            mid = right;
        }
        if(left < n && arr.get(left) > arr.get(mid)){
            mid = left;

        }
        if(mid!=i){
            int temp = arr.get(i);
            arr.set(i,arr.get(mid));
            arr.set(mid,temp);
            heapify(arr,mid,n);


        }

    }
    public int  delete(ArrayList<Integer> arr){
        int n = arr.size();

        int data = arr.get(0);
        arr.set(0,arr.get(n-1));
        arr.remove(n-1);
        heapify(arr,0,n);
        return data;
    }
    public void heapSort(ArrayList<Integer> arr){
         int n =arr.size();
        for(int i = (n/2)-1;i>=0;i--){
            heapify(arr,i,n);
        }
//        buildHeap(arr);
        for(int i = n-1;i>=0;i--){
            int temp = arr.get(0);
            arr.set(0,arr.get(i));
            arr.set(i,temp);

            heapify(arr,0,i-1);

        }
    }
}

class main4{
    public static void main(String[] args) {
        Heap4 heap = new Heap4();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(54);
        arr.add(80);
        arr.add(70);
        arr.add(60);
        arr.add(50);
        arr.add(40);
        arr.add(30);
        arr.add(20);
        arr.add(10);
        System.out.println(arr);

//        heap.buildHeap(arr);
//        System.out.println(arr);
//        heap.delete(arr);
        System.out.println(arr);
        System.out.println();
        heap.heapSort(arr);
        System.out.println(arr);



    }
}

