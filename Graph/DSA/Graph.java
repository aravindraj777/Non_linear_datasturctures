package com.Graph.DSA;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public void printGraph(){
        System.out.println(adjList);
    }
    public boolean AddVertex(String Vertex){
        if(adjList.get(Vertex) == null){
            adjList.put(Vertex,new  ArrayList<String>());
            return true;
        }
        return false;
    }
    public boolean AddEdge(String Vertex1,String Vertex2){
        if(adjList.get(Vertex1)!=null && adjList.get(Vertex2)!= null){
            adjList.get(Vertex1).add(Vertex2);
            adjList.get(Vertex2).add(Vertex1);
            return true;
        }
        return false;
    }
}
class  main1{

    public static void main(String[] args) {
        Graph newGraph = new Graph();
        newGraph.AddVertex("A");
        newGraph.AddVertex("B");
        newGraph.AddVertex("C");
        newGraph.AddVertex("D");
        newGraph.AddVertex("E");

        newGraph.AddEdge("A","B");
        newGraph.AddEdge("A","C");
        newGraph.AddEdge("C","D");
        newGraph.AddEdge("B","E");
        newGraph.printGraph();


    }
}
