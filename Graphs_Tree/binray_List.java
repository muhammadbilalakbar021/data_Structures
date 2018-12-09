package Graphs_Tree;

import java.util.Queue;

public class binray_List
{
    public binray_Tree head;
    private binray_Tree tail_left;
    private binray_Tree tail_right;
    private binray_Tree next;
    private binray_Tree previous;
    private int key;



    public void insert_node(int data)
    {
        head=bst_Insert(head,data);
    }

    public binray_Tree bst_Insert(binray_Tree head, int data)
    {
        if (head==null)
        {
            head=new binray_Tree(data);
        }
        else if(data<head.data)
        {
            head.left=bst_Insert(head.left,data);
        }
        else if(data>head.data)
        {
            head.right=bst_Insert(head.right,data);
        }
        return head;
    }

    public void postorder(binray_Tree node)
    {
        if(node!=null)
        {
            postorder(node.left);
            postorder(node.right);
            System.out.printf(node.data+" ");
        }
    }

    public void preorder(binray_Tree node)
    {
        if (node!=null)
        {
            System.out.printf(node.data+" ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void inorder(binray_Tree node)
    {
        if(node!=null)
        {
            inorder(node.left);
            System.out.printf(node.data+" ");
            inorder(node.right);
        }
    }

    public void bfs_Search(binray_Tree node)
    {
        binray_Tree node1=null;
        if(node!=null)
        {
            queue Q=new queue();
            node1=node;
            Q.insert_Queue(node1);
            while (Q!=null)
            {
//                node1=Q.delete_Queue();
            }
        }
    }

public static class queue
{
    public node q_Head;
    public node q_tail;

    public void insert_Queue(binray_Tree data)
    {
        node temp =new node(data);
        if(q_Head==null)
        {
            q_Head=temp;
            q_tail=temp;
        }
        else
        {
            q_tail.next=temp;
            q_tail=temp;
        }
    }

    public node  delete_Queue()
    {
        node temp=q_Head;
        q_Head=q_Head.next;
        return temp;
    }
}
public static class node
{
    binray_Tree data;
    node next;

    public  node(binray_Tree data)
    {
        this.data=data;
        this.next=null;
    }
}
}
