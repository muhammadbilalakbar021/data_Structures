package Graphs_Tree;

public class test_Class
{
    public static void main(String[] args)
    {
        binray_List binray_list=new binray_List();
        binray_list.insert_node(50);
        binray_list.insert_node(45);
        binray_list.insert_node(47);
        binray_list.insert_node(40);
        binray_list.insert_node(38);
        binray_list.insert_node(42);
        binray_list.insert_node(46);

        System.out.println("Tree in Post Order");
        binray_list.postorder(binray_list.head);
        System.out.println();
        System.out.println();

        System.out.println("Tree in Pre Order");
        binray_list.preorder(binray_list.head);
        System.out.println();
        System.out.println();

        System.out.println("Tree in In Order");
        binray_list.inorder(binray_list.head);
        System.out.println();
        System.out.println();

        System.out.println("Breath First Search");
        binray_list.bfs_Search(binray_list.head);
        System.out.println();
        System.out.println();
    }
}
