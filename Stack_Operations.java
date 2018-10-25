public class Stack_Operations
{
    Node head;
    Node tail;
    Node node;

    w_NOde head1;
    w_NOde tail1;
    w_NOde previous;

//    public void stack_w_LinkLIST()
//    {
//        head1=null;
//        tail1=null;
//    }
//
//    public void stack_linked_LIst()
//    {
//        head=null;
//        tail=null;
//    }

    void push(int val)
    {
        Node list=new Node(val);

        if(head==null)
        {
            head=list;
            tail=list;
        }
        else
        {
            list.next=head;
            head=list;
        }

        stack_display_Linked_List();

    }

    void pop()
    {
        head=head.next;

        stack_display_Linked_List();
    }

    void stack_display_Linked_List()
    {
        Node list=head;
        for(;list!=null;list=list.next)
        {
            System.out.printf("%3d",list.data);
        }
    }


    void wlink_Push(int val)
    {
        w_NOde list=new w_NOde(val);

        if(head==null)
        {
            head1=list;
            tail1=list;

        }
        else
        {
            list.next=head1;
            list.next.previous=list;
            head1=list;
            previous=list;

        }
        stack_display_WLinked_List();
    }
    void wlink_Pop()
    {
        head1.next.previous=null;
        head1=head1.next;

        stack_display_WLinked_List();
    }

    void stack_display_WLinked_List()
    {
        w_NOde list=head1;
        for(;list!=null;list=list.next)
        {
            System.out.printf("%3d",list.value);
        }
    }

}
