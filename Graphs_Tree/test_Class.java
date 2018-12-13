package Graphs_Tree;

public class test_Class
{
    public static void main(String[] args)
    {
        binray_List binray_list=new binray_List();
        binray_list.insert_node(50);
        binray_list.insert_node(45);
        binray_list.insert_node(65);
        binray_list.insert_node(40);
        binray_list.insert_node(47);
        binray_list.insert_node(60);
        binray_list.insert_node(70);
        binray_list.insert_node(20);
        binray_list.insert_node(30);
        binray_list.insert_node(46);
        binray_list.insert_node(48);
        binray_list.insert_node(55);
        binray_list.insert_node(63);
        binray_list.insert_node(67);
        binray_list.insert_node(71);



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

//        System.out.println("Breath First Search");
//        binray_list.bfs_Search(binray_list.head);
//        System.out.println();
//        System.out.println();

        System.out.println("Deleting a Node");
//        binray_Tree a=binray_list.delete_Node(binray_list.head,65);
//        binray_list.inorder(binray_list.head);

        binray_list.delete_from_Loop(binray_list.head,20);
        binray_list.inorder(binray_list.head);


    }
}
