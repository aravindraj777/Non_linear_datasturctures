package com.Nonlinear.BST.creatingtree;

import com.sun.source.tree.Tree;

public class TreeBinaryc {

    private TreeNode root;

    private class TreeNode{

        int data;
        TreeNode right;
        TreeNode Left;

        public TreeNode(int data){
            this.data = data;
        }
    }

     public void CreateBinaryTree(){
        TreeNode first = new TreeNode(9);
        TreeNode Second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode forth = new TreeNode(4);
//        TreeNode fifth = new TreeNode(78);

        root = first;   // root ---> first
        first.Left  = Second;
        first.right = third;  // second <----- first ------> third

        Second.Left = forth;
//        Second.right = fifth;
    }
    public void PreOrder(TreeNode root){
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+" ");
        PreOrder(root.Left);
        PreOrder(root.right);


    }

    public static void main(String[] args) {

        TreeBinaryc bt = new TreeBinaryc();
        bt.CreateBinaryTree();
        bt.PreOrder(bt.root);

    }
}
