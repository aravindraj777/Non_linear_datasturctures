package com.Graph.DSA;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph4 {

    public HashMap<String, ArrayList<String>>AdjList = new HashMap<>();

    public boolean AddVertex(String Vertex){
        if(AdjList.get(Vertex)==null){
            AdjList.put(Vertex,new ArrayList<>());
            return true;
        }
        return false;
    }
    public void print(){

            System.out.println(AdjList);
    }
    public boolean AddEdges(String Vertex1,String Vertex2){
        if(AdjList.get(Vertex1)!=null && AdjList.get(Vertex2)!=null){
            AdjList.get(Vertex1).add(Vertex2);
            AdjList.get(Vertex2).add(Vertex1);
            return true;
        }
        return false;
    }
    public boolean RemoveEdges(String Vertex1,String Vertex2){
        if(AdjList.get(Vertex1)!=null && AdjList.get(Vertex2)!=null){
            AdjList.get(Vertex1).remove(Vertex2);
            AdjList.get(Vertex2).remove(Vertex1);
            return true;
        }
        return false;
    }
}
class main4{

    public static void main(String[] args) {

        Graph4 graph = new Graph4();
        graph.AddVertex("A");
        graph.AddVertex("B");
        graph.AddVertex("C");
        graph.AddVertex("D");
        graph.AddVertex("E");

        graph.AddEdges("A","B");
        graph.AddEdges("B","E");
        graph.AddEdges("C","D");
        graph.AddEdges("D","E");
        graph.AddEdges("A","C");


        graph.print();
    }
}
