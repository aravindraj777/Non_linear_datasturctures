package com.Graph.DSA;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph2 {

    private HashMap<String, ArrayList<String>> AdjList = new HashMap<>();

    public void print(){
        System.out.println(AdjList);
    }
    public boolean AddVertex(String Vertex){
            if(AdjList.get(Vertex) == null){
                AdjList.put(Vertex,new ArrayList<String>());
                return true;
            }
            return false;
    }
    public boolean AddEdges(String Vertex1,String Vertex2){
        if(AdjList.get(Vertex1)!=null && AdjList.get(Vertex2)!=null){
            AdjList.get(Vertex1).add(Vertex2);
            AdjList.get(Vertex2).add(Vertex1);
            return true;
        }
        return false;
    }
}
class  main2{
    public static void main(String[] args) {

        Graph2 graph = new Graph2();

        graph.AddVertex("A");
        graph.AddVertex("B");
        graph.AddVertex("C");
        graph.AddVertex("D");
        graph.AddVertex("E");
/////////////////////////////////////
        graph.AddEdges("A","C");
        graph.AddEdges("A","B");
        graph.AddEdges("B","E");
//        graph.AddEdges("B","A");
//        graph.AddEdges("D","E");
        graph.AddEdges("C","D");
        graph.print();
    }
}
