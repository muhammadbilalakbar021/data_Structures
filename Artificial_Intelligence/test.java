package Artificial_Intelligence;

import java.util.ArrayList;
import java.util.List;

public class test
{
    public static void main(String arg[])
    {
        int V = 10;
        int source = 0;
//        int [] arr=new int[V];
        int[] arr= {2,1,2,3,1,0,1,2,3,4};
        List<List<DPQ.Node>> adj = new ArrayList<List<DPQ.Node>>();
        for (int i = 0; i < V; i++) {
            List<DPQ.Node> item = new ArrayList<DPQ.Node>();
            adj.add(item);
        }
        adj.get(0).add(new DPQ.Node(1, 6));
        adj.get(1).add(new DPQ.Node(2, 1));
        adj.get(1).add(new DPQ.Node(5, 3));
        adj.get(2).add(new DPQ.Node(0, 2));
        adj.get(2).add(new DPQ.Node(3, 3));
        adj.get(3).add(new DPQ.Node(4, 1));
        adj.get(3).add(new DPQ.Node(5, 4));
        adj.get(4).add(new DPQ.Node(5, 5));
        adj.get(4).add(new DPQ.Node(1, 2));
        adj.get(5).add(new DPQ.Node(6, 2));
        adj.get(6).add(new DPQ.Node(7, 3));
        adj.get(7).add(new DPQ.Node(8, 1));
        adj.get(8).add(new DPQ.Node(9, 4));
        adj.get(9).add(new DPQ.Node(0, 5));

        DPQ dpq = new DPQ(V);
//        System.out.println("Dijkstra's Algorithm");
//        dpq.dijkstra(adj, source);

//        System.out.println("Uniform Cost Search Algorithm");
//        dpq.uniform_Cost_Search(adj, source);

        System.out.println("A* algorithm");
        dpq.A_Star(adj, 0, arr);
//
//        System.out.println("The shorted path from node :");
//        for (int i = 0; i < dpq.dist.length; i++)
//            System.out.println(source + " to " + i + " is "
//                    + dpq.dist[i]);
    }

}
