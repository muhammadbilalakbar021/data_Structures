package Artificial_Intelligence;// Java implementation of Dijkstra's Algorithm
import java.util.*;
public class DPQ {
    private int dist[];
    private Set<Integer> settled;
    private PriorityQueue<Node> pq;
    private int V;
    List<List<Node>> adj;

    public DPQ(int V) {
        this.V = V;
        dist = new int[V];
        settled = new HashSet<Integer>();
        pq = new PriorityQueue<Node>(V, new Node());
    }

    public void priority(tuple tp)
    {

    }

    public void dijkstra(List<List<Node>> adj, int source)
    {
        this.adj = adj;
        LinkedList<tuple> list=new LinkedList<>();

        for (int i = 0; i < V; i++)
            dist[i] = Integer.MAX_VALUE;
        pq.add(new Node(source, 0));
        dist[source] = 0;
        while (settled.size() != V)
        {
            int u = pq.remove().node;
            settled.add(u);

            int edgeDistance = -1;
            int newDistance = -1;
            for (int i = 0; i < adj.get(u).size(); i++)
            {
                Node v = adj.get(u).get(i);
                if (!settled.contains(v.node))
                {
                    list.add(new tuple(u,v.node,v.cost));
                    edgeDistance = v.cost;
                    newDistance = dist[u] + edgeDistance;
                    if (newDistance < dist[v.node])
                        dist[v.node] = newDistance;
                    pq.add(new Node(v.node, dist[v.node]));

                }
                System.out.println(u +"  The node is  " + v.node +"  and distance is  " + v.cost  + "   " + newDistance);

            }
        }
        System.out.println("List is ->");
        for(int i=0;i<list.size();i++){
            System.out.println("Parent " +list.get(i).Parent + " Child " +list.get(i).Child + " Cost "+ list.get(i).cost);
        }


        int ch=list.size()-1;
        int []  arr=new int[ch+1];
        int ind=0;
        int par=-1;
        int dest=5;
        while (par!=source)
        {
            if(list.get(ch).Child==dest)
            {
                ind=ind+list.get(ch).cost;
//                System.out.print(dest);
                arr[ch]=list.get(ch).Child;
                dest=list.get(ch).Parent;
                if (dest==source)
                {
                    par=source;
                    System.out.print(source);
                    break;
                }

            }
            ch--;
        }

        for (int a: arr)
        {
            if (a!=0)
            System.out.print(a);
        }
        System.out.println();
        System.out.println("Cost is "+ ind);
    }

    public void uniform_Cost_Search(List<List<Node>> adj, int source) {
        this.adj = adj;
        LinkedList<tuple> list = new LinkedList<>();

        for (int i = 0; i < V; i++)
            dist[i] = Integer.MAX_VALUE;

        pq.add(new Node(source, 0));
//        priority_Q pq=new priority_Q();
//        pq.sorted_enqeue(-1,0,0);
        dist[source] = 0;
        int newDistance = -1;
        int desti=5;
        int child=-1;
        int disance=-1;

        while (settled.size()!=V) {
            Node n = pq.remove();
//            System.out.println("Dequeue " + n.node + " " + n.cost);
            int u=n.node;
            settled.add(u);
            int edgeDistance = -1;
            for (int i = 0; i < adj.get(u).size(); i++)
            {
                Node v = adj.get(u).get(i);
//                child=v.node;
//                disance=v.cost;
                if (!settled.contains(v.node))
                {
                    child=v.node;
                    disance=v.cost;
                    pq.add(new Node(child,disance));
//                    System.out.println("Priority " + child + " " + disance);

                }
                System.out.println(u + "  The node is  " + v.node + "  and distance is  " + v.cost + "   " );

            }
            if (u!=child)
            {
                list.add(new tuple(u, child, disance));

            }

        }
        System.out.println("List is ->");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Parent " + list.get(i).Parent + " Child " + list.get(i).Child + " Cost " + list.get(i).cost);
        }


        int ch = list.size() - 1;
        int[] arr = new int[ch + 1];
        int ind = 0;
        int par = -1;
        int dest = 5;
        while (par != source)
        {

            if (list.get(ch).Child == dest)
            {

                ind = ind + list.get(ch).cost;
//                System.out.print(dest);
                arr[ch] = list.get(ch).Child;
                dest = list.get(ch).Parent;
                if (dest == source) {
                    par = source;
                    System.out.print(source);
                    break;
                }

            }
            ch--;
        }

        for (int a : arr) {
            if (a != 0)
                System.out.print(a);
        }
        System.out.println();
        System.out.println("Cost is " + ind);
    }

    public void A_Star(List<List<Node>> adj, int source , int[] heriustics) {
        this.adj = adj;
        LinkedList<tuple> list = new LinkedList<>();

        for (int i = 0; i < V; i++)
            dist[i] = Integer.MAX_VALUE;

        System.out.println("lentgth" + heriustics.length);
        pq.add(new Node(source, 0));
        dist[source] = 0;
        int newDistance = -1;
        int child=-1;
        int disance=-1;

        while (settled.size()!=V) {
            Node n = pq.remove();
            int u=n.node;
            settled.add(u);
            int edgeDistance = -1;
            for (int i = 0; i < adj.get(u).size(); i++)
            {
                Node v = adj.get(u).get(i);
                if (!settled.contains(v.node))
                {
                    child=v.node;
//                    System.out.println(heriustics[v.node]);
                    disance=v.cost+heriustics[v.node];
                    pq.add(new Node(child,disance));
                }
                System.out.println(u + "  The node is  " + v.node + "  and distance is  " + disance + "   " );

            }
            if (u!=child)
            {
                list.add(new tuple(u, child, disance));

            }

        }
        System.out.println("List is ->");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Parent " + list.get(i).Parent + " Child " + list.get(i).Child + " Cost " + list.get(i).cost);
        }


        int ch = list.size() - 1;
        int[] arr = new int[ch + 1];
        int ind = 0;
        int par = -1;
        int dest = 5;
        while (par != source)
        {

            if (list.get(ch).Child == dest)
            {

                ind = ind + list.get(ch).cost;
//                System.out.print(dest);
                arr[ch] = list.get(ch).Child;
                dest = list.get(ch).Parent;
                if (dest == source) {
                    par = source;
                    System.out.print(source);
                    break;
                }

            }
            ch--;
        }

        for (int a : arr) {
            if (a != 0)
                System.out.print(a);
        }
        System.out.println();
        System.out.println("Cost is " + ind);
    }

    static class Node implements Comparator<Node> {
        public int node;
        public int cost;

        public Node() {
        }

        public Node(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compare(Node node1, Node node2)
        {
            if (node1.cost < node2.cost)
                return -1;
            if (node1.cost > node2.cost)
                return 1;
            return 0;
        }
    }

    public static class priority_Q
    {
        int index=-1;
        int ind=-1;
        tuple[] array=new tuple[10];

        public void enqeue(int parent,int child, int cost)
        {
            index++;
            array[index]=new tuple(parent,child,cost);
        }
        public tuple de_queue()
        {
            tuple E=null;
            if(index==-1)
            {
                return null;
            }
            else
            {
                ind=FIND_INDEX_OF_MIN(array);
                E=array[ind];
                for (int i=ind;i<array.length-1;i++)
                {
                    array[i]=array[i+1];
                }
                array[array.length-1]=null;
                index--;
            }
            return E;
        }

        int FIND_INDEX_OF_MIN(tuple[] tp)
        {
            int m=0;
            for (int i=0;i<=index;i++)
            {
                if (tp[i].cost<=tp[m].cost)
                {

                    m=i;
                }
            }
            return m;

        }

        public void sorted_enqeue(int parent,int child, int cost)
        {
            if (array.length-1==index)
            {
                System.out.println("Overflow");
            }
            else if (index==-1)
            {
                index++;
                array[index]=new tuple(parent,child,cost);
            }
            else
            {
                index=index+1;
                int i=0;
                while (array[i].cost>cost &&i<index-1)
                {
                    System.out.println(i);
                    i=i+1;
                }
                for (int j=index;j>i;j--)
                {
                    array[j]=array[j-1];
                }
                array[i]=new tuple(parent,child,cost);

            }
        }

        public tuple Sorted_deq()
        {
            tuple E =null;
            if (index==-1)
            {

            }
            else
            {
                E=array[index];
                index--;
            }
            return E;
        }
    }
}
