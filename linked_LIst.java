public class linked_LIst
{
    Node head;
    Node tail;

    public linked_LIst()
    {
        head=null;
        tail=null;
    }


    void insertAtStart(int val)
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
    }
    void insertAtEND(int val)
    {
        Node list=new Node(val);

        if(head==null)
        {
            head=list;
            tail=list;
        }
        else
        {
            tail.next=list;
            tail=list;

        }
    }

    void insertAtLocation(int loc, int val)
    {
        int current_Node=0;
        Node list=new Node(val);


        if(head!=null)
        {
            Node curreent=head;
            Node previous=null;

int i=0;
            while (i<=loc)
            {
                if(loc==current_Node)
                {
                        if(previous==null)
                        {
                            insertAtStart(val);
                        }
                        else
                        {
                            previous=curreent;
                            curreent=curreent.next;
                        }

                        previous.next=list;
                        list.next=curreent;

                }
                i++;
            }

//            for(int i=0;i<loc;i++)
//            {
//                previous=curreent;
//                curreent=curreent.next;
//            }
//
//            previous.next=list;
//            list.next=curreent;

        }
    }

    void deleteAtStart()
    {
        head=head.next;
    }

    void deleteAtEnd()
    {
        Node temp=head;
        Node previous=null;
        while(temp.next!=null)
        {
            previous=temp;
            temp=temp.next;
        }
        previous.next=null;
        tail=previous;


    }

    void deleteAtLocation(int loc)
    {
        int nodeCount=0;
        if(head!=null)
        {
            Node current=head;
            Node previous=null;

            while (current.next!=null)
            {

                if(loc==nodeCount)
                {
                    if (previous==null)
                    {
                        head=head.next;
                    }
                    else
                    {
                        previous.next=current.next;
                    }
                }
                nodeCount=nodeCount+1;
                previous=current;
                current=current.next;
            }
        }
    }

    void display()
    {
        Node list=head;
        for(;list!=null;list=list.next)
        {
            System.out.printf("%3d",list.data);
        }
    }

}