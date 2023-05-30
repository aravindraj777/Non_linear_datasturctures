package com.GraphWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph2 {

    class Edge{

        int src;
        int des;
        Edge(int s,int d){
            this.src = s;
            this.des = d;
        }
    }
    private int v;
    private ArrayList<Edge> graph[];

    Graph2(int v){
        this.v = v;
        this.graph = new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i] = new ArrayList<>();
        }

    }
    public void AddEdges(int s,int d){
        Edge e = new Edge(s, d);
        graph[s].add(e);
    }
    public void BFS(){

        boolean[] visited = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        for(int j=0;j<v;j++){
            if(!visited[j]){
                q.add(j);
                visited[j] = true;
                while (!q.isEmpty()){
                    int curr = q.remove();
                    System.out.println(curr+" ");
                    for(int i = 0;i<graph[curr].size();i++){
                        Edge e  = graph[curr].get(i);
                        if(!visited[e.des]){
                            q.add(e.des);
                            visited[e.des]  = true;
                        }
                    }
                }
            }
        }

    }
//    public void printGraph(){
//        for(int i=0;i<v;i++){
//            System.out.println("Vertex"+i+" :");
//            for(graph[] a : graph[i]){
//                System.out.println("("+a.src+","++")");
//            }
//            System.out.println();
//        }
//    }
}
class main{

    public static void main(String[] args) {
        Graph2 graph = new Graph2(5);
        graph.AddEdges(0,2);
        graph.AddEdges(0,1);
        graph.AddEdges(1,3);
        graph.AddEdges(1,4);
        graph.BFS();
    }
}
