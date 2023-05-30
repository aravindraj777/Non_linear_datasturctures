package com.Graph.DSA;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph5 {

    private  HashMap<String , ArrayList<String>>adjList = new HashMap<>();

    public boolean AddVertices(String Vertex){

        if(adjList.get(Vertex) == null){
            adjList.put(Vertex,new ArrayList<>());
            return true;
        }
        return false;
    }
    public boolean AddEdges(String Source,String Destination){
        if(adjList.get(Source)!=null && adjList.get(Destination)!=null){
            adjList.get(Source).add(Destination);
            adjList.get(Destination).add(Source);
            return true;
        }
        return false;
    }
    public boolean RemoveEdges(String Vertex1,String Vertex2 ){
        if(adjList.get(Vertex1)!=null && adjList.get(Vertex2)!=null){
            adjList.get(Vertex1).remove(Vertex2);
            adjList.get(Vertex2).remove(Vertex1);
            return true;

        }
        return false;
    }
    public void print(){
        System.out.println(adjList);
    }




}
class main{
    public static void main(String[] args) {

        Graph5 graph = new Graph5();
        graph.AddVertices("A");
        graph.AddVertices("B");
        graph.AddVertices("C");
        graph.AddVertices("D");
        graph.AddVertices("A");

        graph.AddEdges("A","B");
        graph.AddEdges("A","C");
        graph.AddEdges("C","D");
        graph.AddEdges("D","E");
        graph.AddEdges("B","E");

        graph.print();

    }
}
