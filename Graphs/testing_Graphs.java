package Graphs;

public class testing_Graphs
{
    public static void main(String[] args)
    {
        graphs_List.Graph list=new graphs_List.Graph(10 ,5);
        graphs_List.add_Edge(list, 0, 1);
        graphs_List.add_Edge(list, 0, 4);
        graphs_List.add_Edge(list, 1, 2);
        graphs_List.add_Edge(list, 1, 3);
        graphs_List.add_Edge(list, 1, 4);
        graphs_List.add_Edge(list, 2, 3);
        graphs_List.add_Edge(list, 3, 4);

        graphs_List.print(list);
//        graphs_List.remove_Edge(list,0,4);
//        System.out.println(list.list[0]);
//        System.out.println("");
//        graphs_List.print(list);

//        System.out.println("Adding Vertex");
//        graphs_List.add_Vertex(list, 6);
//        System.out.println("Adding Edges");
//        graphs_List.add_Edge(list, 1, 5);
//        graphs_List.add_Edge(list, 3, 5);
//        graphs_List.print(list);

//        graphs_List.remove_Vertex(list,1);
//        graphs_List.print(list);

        graphs_List.path_Exists(list,1,3);
    }
}
