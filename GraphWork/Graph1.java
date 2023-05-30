package com.GraphWork;

import java.util.ArrayList;

public class Graph1 {

    class Edge{

        int src;
        int des;
        Edge(int s,int d){
            this.src = s;
            this.des = d;

        }
    }
    private int v;
    private ArrayList<Edge> graph[] ;

    Graph1(int v){
        this.v = v;
        this.graph = new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i] = new ArrayList<>();
        }
    }

    public void AddEdges(int s,int d){
        Edge e = new Edge(s,d);
        graph[s].add(e);
    }

}
