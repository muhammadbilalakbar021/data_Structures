package Graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class graphs_List
{
    public static class Graph
    {
        int nodes;
        int prev_Nodes;
        int total_Nodes;
        public LinkedList[] list;

        public Graph(int total_Nodes ,int nodes)
        {
            this.total_Nodes=total_Nodes;
            this.nodes = nodes;
            list=new LinkedList[total_Nodes];

            for (int i=0;i<nodes;i++)
            {
                list[i] =new LinkedList<>();
            }
        }

        public LinkedList[] getList()
        {
            return list;
        }

        public void setList()
        {
            for (int i=nodes-prev_Nodes;i<nodes-prev_Nodes;i++)
            {
                list[i] =new LinkedList<>();
            }
        }


        public int getNodes() {
            return nodes;
        }

        public void setNodes(int nodes)
        {
            this.nodes = nodes;
        }

        public int getPrev_Nodes()
        {
            return prev_Nodes;
        }

        public void setPrev_Nodes(int prev_Nodes) {
            this.prev_Nodes = prev_Nodes;
        }


        void BFS(int s)
        {

            boolean visited[] = new boolean[nodes];

            LinkedList<Integer> queue = new LinkedList<Integer>();
            visited[s]=true;
            queue.add(s);

            while (queue.size() != 0)
            {
                s = queue.poll();
                System.out.print(s+" ");


                Iterator<Integer> i = list[s].listIterator();
                while (i.hasNext())
                {
                    int n = i.next();
                    if (!visited[n])
                    {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }
    }

    public static void add_Vertex(Graph graph, int i)
    {
        graph.setPrev_Nodes(graph.getNodes());
        graph.setNodes(i);
        graph.setList();
    }

    public static void remove_Vertex(Graph graph, int i)
    {

        int k=0;
//        while (i<graph.nodes)
//        {
//            graph.list[i]=graph.list[i+1];
//            i++;
//        }
        graph.list[i]=null;
//        for (int j=0;j<graph.nodes;j++);
//        {
//            for (;k<graph.nodes;k++);
//            {
//                if(graph.list[k].contains(i))
//                {
//                    graph.list[k]=graph.list[k+1];
////                    while (graph.list[k]!=null)
////                    {
////                        graph.list[k]=graph.list[k+1];
////                    }
//                }
//            }
//        }



    }

    public static void add_Edge(Graph graph,int source , int destination)
    {
        graph.list[source].add(destination);
//        graph.list[destination].add(source);


    }

    public static void remove_Edge(Graph graph,int source , int destination)
    {
//        System.out.println("Source to Destination");
//        System.out.println(graph.list[source]);
//        System.out.println(graph.list[destination]);
        if(graph.list[source].contains(destination))
        {
            graph.list[source].remove();
        }
//        graph.list[source].removeFirst();
//        System.out.println("Destination to Source");
//        graph.list[destination].remove(source);
    }

    static void print(Graph graph)
    {
        for(int v = 0; v < graph.nodes; v++)
        {
            System.out.println("Adjacency list of vertex "+ v);
            System.out.print(v);
            if(graph.list[v]!=null)
            {
                for( Object node_Data: graph.list[v]){
                    System.out.print(" -> "+node_Data);
                }
            }
            System.out.println("\n");
        }
    }

    static void path_Exists(Graph graph,int source , int destination)
    {
        System.out.println();
//        graph.list[source].toArray();
        String array=graph.list[source].toString();
        System.out.println(array);

        for (int i=0;i<array.length();i++)
        {
//            System.out.println(array.charAt(i));
            if(Character.getNumericValue(array.charAt(i))==destination)
            {
                System.out.println("Yes Path Exists");
//                System.out.println(graph.list[source]);
            }
        }
    }

    static void bfs(Graph graph,int source)
    {
        while (graph.list!=null)
        {
            System.out.println(graph.list);
        }
    }
}