package com.Trie1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Trie7 {
    private Node root;
    class  Node {

        HashMap<Character,Node> Children;
        boolean iswordEnd;
        Node(){
            Children = new HashMap<>();
            iswordEnd =false;
        }
    }
    Trie7(){
        root = new Node();
    }
    public void addElement(String str){

        Node curr = root;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!curr.Children.containsKey(ch)){
                curr.Children.put(ch,new Node());
            }
            curr = curr.Children.get(ch);
        }
        curr.iswordEnd = true;
    }
    public boolean Contains(String str){

        Node curr = root;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!curr.Children.containsKey(ch)){
                return false;
            }
            curr = curr.Children.get(ch);
        }
       return curr.iswordEnd;
    }
    public ArrayList<String> Traversal(){
        ArrayList<String> words = new ArrayList<>();
        TraversalHelper(words," ",root);
        return words;
    }

    public void TraversalHelper(ArrayList<String> words,String word , Node curr){

        if(curr.iswordEnd) {
            words.add(word);
        }
            for (char ch : curr.Children.keySet()) {
                TraversalHelper(words, word + ch, curr.Children.get(ch));
            }

    }
    public void SuffixTrie(String str){

        for(int i = 0;i<str.length();i++){
            insertintToSuffixTrie(str,i);

        }
    }
    public  void insertintToSuffixTrie(String str,int idx){
        Node curr = root;
        for(int i=idx;i<str.length();i++){
            char ch = str.charAt(i);
            if(!curr.Children.containsKey(ch)){
                curr.Children.put(ch,new Node());
            }
            curr = curr.Children.get(ch);
        }
        curr.iswordEnd = true;

    }
//    public void Deletion(String str){
//        Node curr = root;
//        Stack<Node>stack = new Stack<>();
//        for(int i=0;i<str.length();i++){
//            char ch = str.charAt(i);
//            if(!curr.Children.containsKey(ch)){
//                return;
//            }
//            stack.push(curr);
//            curr = curr.Children.get(ch);
//        }
//        curr.iswordEnd = false;
//        while (!stack.isEmpty() && !curr.iswordEnd && curr.Children.isEmpty()){
//            Node prev = curr;
//            curr.Children.remove(str.charAt(stack.size()));
//            curr = prev;
//        }
//    }
public void Deletion(String str) {
    deleteRecursive(root, str, 0);
}

    private void deleteRecursive(Node current, String str, int index) {
        if (index == str.length()) {
            current.iswordEnd = false;
            return;
        }

        char ch = str.charAt(index);
        Node next = current.Children.get(ch);
        if (next == null) {
            return;
        }

        deleteRecursive(next, str, index + 1);

        if (next.iswordEnd==true || !next.Children.isEmpty()) {
            return;
        }

        current.Children.remove(ch);
    }

//    private void deleteRecursive(Node current,String str,int index){
//        if(index == str.length()){
//            current.iswordEnd = false;
//            return;
//        }
//        char ch  = str.charAt(index);
//        Node next = current.Children.get(ch);
//        if(next == null){
//            return;
//        }
//        deleteRecursive(next,str,index+1);
//        if(next.iswordEnd == true || !next.Children.isEmpty()){
//            return;
//        }
//    }


}

class main7{
    public static void main(String[] args) {

        Trie7 obj = new Trie7();
//        obj.addElement("Banana");
//        obj.addElement("Ban");
//        obj.addElement("Sreekanth");
//        obj.addElement("Aravind");
//        System.out.println(obj.Contains("Aravind"));
//        System.out.println(obj.Traversal());
        obj.SuffixTrie("Banana");
//        obj.SuffixTrie("Banyan");
//        obj.Deletion("Sreekanth");
        System.out.println(obj.Traversal());
    }
}
