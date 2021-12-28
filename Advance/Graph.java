package Advance;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Graph {
    private int v;
    private static Scanner sc;
    private ArrayList<Integer>[] adjList;
    public Graph(int vertices)
    {
        this.v = vertices;
        initAdjList();
    }
    @SuppressWarnings("unchecked")
    private void initAdjList()
    {
        adjList = new ArrayList[v];
 
        for (int i = 0; i < v; i++) {
            adjList[i] = new ArrayList<>();
        }
    }
    public void addEdge(int u, int v)
    {
        adjList[u].add(v);
    }
    public void printAllPaths(int s, int d)
    {
        boolean[] isVisited = new boolean[v];
        ArrayList<Integer> pathList = new ArrayList<>();
        pathList.add(s);
        printAllPathsUtil(s, d, isVisited, pathList);
    }
    private void printAllPathsUtil(Integer u, Integer d,
                                   boolean[] isVisited,
                                   List<Integer> localPathList)
    {
 
        if (u.equals(d)) {
            System.out.println(localPathList);
            return;
        }
        isVisited[u] = true;
        for (Integer i : adjList[u]) {
            if (!isVisited[i]) {
                localPathList.add(i);
                printAllPathsUtil(i, d, isVisited, localPathList);
                localPathList.remove(i);
            }
        }
        isVisited[u] = false;
    }
    public static void main(String[] args)
    {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        Graph g = new Graph(n+1);
        for(int i=0;i<=n;i++){
            if(i+1<=n)
                g.addEdge(i, i+1);
            if(i+2<=n)
                g.addEdge(i, i+2);
        }
        int s = 0;
        int d = n;
        System.out.println(
            "Following are all different paths from "
            + s + " to " + d);
        g.printAllPaths(s, d);
    }
}

