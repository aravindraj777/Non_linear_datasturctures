package com.BinaryTreeDSA.workouts;

import java.util.Vector;

public class BinaryTrees {
//        Node root;
    class Node {

        int data;
        Node left;
        Node right;
        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    BinaryTrees(){
       Node  root;
    }

//    public Node BuildTree(int[] nodes){
//
//    }
}
class  main{
    public static void main(String[] args) {

        BinaryTrees trees = new BinaryTrees();

        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//       Node root = trees.BuildTree(nodes);
        Vector<String> ans = new Vector<>();
        ans.add("Aravind");

    }
}
