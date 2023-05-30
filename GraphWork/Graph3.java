package com.GraphWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph3 {

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

    Graph3(int v){
        this.v = v;
        this.graph = new ArrayList[v];
        for(int i = 0;i<v;i++){
            graph[i] = new ArrayList<>();
        }
    }


    public void AddEdges(int s,int d){
        Edge  e = new Edge(s,d);
        graph[s].add(e);
    }
    public void BFS(){

        boolean[] visited  = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<v;i++){
            if(!visited[i]){
                q.add(i);
                visited[i] = true;
                while(!q.isEmpty()){
                    int curr = q.remove();
                    System.out.print(curr+" ");
                    for(int j=0;j<graph[curr].size();j++){
                        Edge e = graph[curr].get(j);
                        if(!visited[e.des]){
                            q.add(e.des);
                            visited[e.des] = true;
                        }
                    }
                }
            }
        }
    }
    public void DFS(){
        boolean[] vis = new boolean[v];
        for(int i = 0;i<v;i++){
            if(!vis[i]){
                DFShelper(i,vis);

            }
        }
    }
    public void DFShelper(int curr,boolean [] vis){
        System.out.print(curr+" ");
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.des]){
              DFShelper(e.des,vis);
            }
        }
    }

    public void FindAllPath(int start,int end){

        boolean[] visited = new boolean[v];
        ArrayList<Integer> path = new ArrayList<>();
        FindAllpathHelper(start,end,path,visited);
    }
    private void FindAllpathHelper(int curr,int end,ArrayList<Integer>path,boolean[] visited) {

        if(curr == end){
            System.out.println(curr+" ");
            return;
        }
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.des]){
                visited[curr] = true;
                path.add(e.des);
                FindAllpathHelper(e.des,end,path,visited);
                visited[curr] = false;
            }
        }
    }
    public  void printGraph(){
        for(int i=0;i<v;i++){
            System.out.print(" vertex "+ i +" :");
            for (Edge a :graph[i]){
                System.out.print("("+a.src+ ","+a.des+")");
            }
            System.out.println();
        }
    }
    public  void removeEdge(int src,int dest){
        for(int i=0;i<graph[src].size();i++){
            if(graph[src].get(i).des==dest){
                graph[src].remove(i);
                break;
            }
        }
    }
}
class main3{

    public static void main(String[] args) {
        Graph3 graph = new Graph3(7);
        graph.AddEdges(0,1);
        graph.AddEdges(0,2);
        graph.AddEdges(1,0);
        graph.AddEdges(2,0);
        graph.AddEdges(2,4);
        graph.AddEdges(3,1);
        graph.AddEdges(3,4);
        graph.AddEdges(3,5);
        graph.AddEdges(4,2);
        graph.AddEdges(4,3);
        graph.AddEdges(4,5);
        graph.AddEdges(5,3);
        graph.AddEdges(5,4);
        graph.AddEdges(5,6);
        graph.AddEdges(6,4);

        graph.printGraph();

        System.out.println();

        graph.BFS();
        System.out.println();
          graph.DFS();
//        graph.removeEdge(6,4);
//          graph.FindAllPath(0,6frdtrx1`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     );




    }
}
