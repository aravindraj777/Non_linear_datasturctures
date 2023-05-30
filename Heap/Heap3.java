package com.Heap;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Heap3 {

    public void addElement(ArrayList<Integer> array,int data){
        array.add(data);

        int n = array.size()-1;
        int parent = (n-1)/2;

        while(array.get(n) > array.get(parent)){
            Collections.swap(array,parent,n);
            n = parent;
            parent = (n-1)/2;

        }
    }
    public int  peek(ArrayList<Integer> array){
        return array.get(0);
    }
    public void bildheap(ArrayList<Integer> array){
        int n = array.size();
        for(int i =(n-1)/2;i>=0;i--){
            heapify(array,i,n);
        }
    }
    public void heapify(ArrayList<Integer> array,int i,int n){
        int left = 2*i+1;
        int right = 2*i+2;
        int mid = i;

        if(left<array.size() && array.get(left) >array.get(mid)){
            mid = left;
        }
        if(right<array.size() && array.get(right) > array.get(mid)){
            mid = right;
        }
        if(mid!= i){
            int temp = array.get(i);
            array.set(i,array.get(mid));
            array.set(mid,temp);
            heapify(array,mid,n);
        }
    }
    public int remove(ArrayList<Integer>array ){
        int n = array.size();

        int data = array.get(0);
        array.set(0,array.get(n-1));
        array.remove(n-1);

        heapify(array,0,n);
        return data;
    }
}
