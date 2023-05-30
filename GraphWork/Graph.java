package com.GraphWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    class  Edge{

        int src;
        int dest;
//      int weight;

//


        Edge(int s,int d){
            this.src = s;
            this.dest = d;
//            this.weight=w;
        }
    }
    private int v;
    private ArrayList<Edge>graph[];
    Graph(int v){
        this.v = v;
        this.graph = new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i] = new ArrayList<>();
        }
    }




    public void AddEdges(int s,int d ){
        Edge e = new Edge(s,d);
        graph[s].add(e);
//        Edge e2=new Edge(d,s);
//        graph[d].add(e2);
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
                    System.out.print(curr+" ");
                    for(int i=0;i<graph[curr].size();i++){

                        Edge e =graph[curr].get(i);
                        if(!visited[e.dest]){
                            q.add(e.dest);
                            visited[e.dest] = true;
                        }
                    }
                }
            }
        }
    }




    public void printGraph(){
        for(int i=0;i<v;i++){
            System.out.println("Vertex"+i+" :");
            for(Edge a : graph[i]){
                System.out.println("("+a.src+","+a.dest+")");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Graph g = new Graph(7);
        g.AddEdges(6, 5);
        g.AddEdges(3, 2);
        g.AddEdges(6, 5);
        g.AddEdges(1, 3);
        g.AddEdges(2, 5);
        g.AddEdges(2, 6);
        g.AddEdges(3, 1);
        g.AddEdges(3, 4);
        g.AddEdges(3, 5);
        System.out.println();
//        g.AddEdges(4, 2);
//        g.AddEdges(4, 3);
//        g.AddEdges(4, 5);
//        g.AddEdges(5, 3);
//        g.AddEdges(5, 4);
//        g.AddEdges(5, 6);
        g.BFS();
        System.out.println();

//        g.printGraph();

    }
}
