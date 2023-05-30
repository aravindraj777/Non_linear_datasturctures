package com.Nonlinear.BST.creatingtree;

public class BinarySearchTree {

    Node root;
    class Node {
        int data;
        Node right;
        Node Left;
        Node (int data){
            this.data = data;
        }
    }

    private  Node rInsert(Node currentNode , int data){
        if(currentNode == null){
            return new Node(data);
        }
        if(data < currentNode.data){
            currentNode.Left = rInsert(currentNode.Left,data);
        } else if (data > currentNode.data) {
            currentNode.right = rInsert(currentNode.right, data);

        }
        return currentNode;
    }
    public void rInsert(int data){
        if(root == null){
            root = new Node(data);
        }
        rInsert(root,data);
    }


}

class Main{
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
//        System.out.println("Root="+tree.root);

        tree.rInsert(45);
        tree.rInsert(14);
        tree.rInsert(78);
        tree.rInsert(15);

//        System.out.println("Root "+tree.root.data);
//        System.out.println("Right"+tree.root.right.data);
//        System.out.println("Left"+tree.root.Left.data);





    }
}
