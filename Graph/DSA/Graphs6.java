package com.Graph.DSA;

import java.util.ArrayList;
import java.util.HashMap;

public class Graphs6 {

    private HashMap<String, ArrayList<String>> AdjList = new HashMap<>();

    public boolean AddEdges(String Vertices){
        if(AdjList.get(Vertices) == null){
            AdjList.put(Vertices, new ArrayList<String>());
            return true;
        }
        return false;

    }
    public boolean AddVertex(String Vertex1,String Vertex2){
        if(AdjList.get(Vertex1)!=null && AdjList.get(Vertex2)!=null){
            AdjList.get(Vertex1).add(Vertex2);
            AdjList.get(Vertex2).add(Vertex1);
            return true;
        }
        return false;

    }
}
class  main6 {
    public static void main(String[] args) {

        Graph5 graph = new Graph5();
        graph.AddVertices("A");
        graph.AddVertices("B");
        graph.AddVertices("C");
        graph.AddVertices("D");
        graph.AddVertices("E");


////////////////////////////////////////////////////

        graph.AddEdges("A","B");
        graph.AddEdges("A","C");
        graph.AddEdges("B","D");
        graph.AddEdges("B","E");
        graph.AddEdges("C","E");
        graph.print();


    }
}