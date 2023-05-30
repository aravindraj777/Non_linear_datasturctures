package com.Heap;

import java.util.ArrayList;
import java.util.Collections;

public class Heap5 {

    public void addElement(ArrayList<Integer> arr,int data){
        arr.add(data);

        int n = arr.size()-1;
        int parent = (n/2)-1;

        if(arr.get(n) > arr.get(parent)){
            Collections.swap(arr,n,parent);
            n = parent;
            parent = (n/2)-1;
        }
    }
    public int  peek(ArrayList<Integer> arr){
        return arr.get(0);
    }
    public void buildHeap(ArrayList<Integer> arr){
        int n = arr.size();
        for(int i = (n/2)-1;i>=0;i--){
            heapify(arr,i,n);
        }

    }
    public void heapify(ArrayList<Integer> arr,int i,int n){

        int right = 2*i+2;
        int left = 2*i+1;
        int mid = i;


        if(left < n && arr.get(left) > arr.get(mid) ){
            mid = left;


        }
        if(right < n && arr.get(right) >arr.get(mid)){
            mid = right;
        }
        if(mid!=i){
            int temp = arr.get(i);
            arr.set(i,arr.get(mid));
            arr.set(mid,temp);
            heapify(arr,mid,n);
        }
    }
    public void remove(ArrayList<Integer> arr){

        int n = arr.size();
        int data = arr.get(0);
        arr.set(0,arr.get(n-1));
        arr.remove(n-1);
        heapify(arr,0,n);
    }
    public void heapSort(ArrayList<Integer> arr){
        int n = arr.size();
        buildHeap(arr);
        for(int i=n-1;i>=0;i--){
            int temp = arr.get(0);
            arr.set(0,arr.get(i));
            arr.set(i,temp);
            heapify(arr,0,i);
        }
    }

}
class main5{
    public static void main(String[] args) {

        Heap5 heap = new Heap5();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(89);
        arr.add(10);
        arr.add(45);
        arr.add(15);
        arr.add(14);
        arr.add(9);
        arr.add(30);
        arr.add(100);
        arr.add(48);
        arr.add(17);
        arr.add(64);
        arr.add(21);
        arr.add(77);
        arr.add(39);

        System.out.println(arr);
        heap.buildHeap(arr);
        System.out.println(arr);
        heap.heapSort(arr);
        System.out.println(arr);


    }
}
