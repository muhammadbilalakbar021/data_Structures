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

    void reverse()
    {
        Node location_Node=null;
        Node previous_Node=null;
        Node current=head;

        while (current.next!=null)
        {
            location_Node=current.next;
            current.next=previous_Node;
            previous_Node=current;
            current=location_Node;

        }
        head=previous_Node;
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

    void insertAtLocation(int loc, int val) {
        int current_Node=0 ;
        Node list = new Node(val);


        if (head != null)
        {
            Node curreent = head;
            Node previous = null;


            while(current_Node<loc)
            {
                previous=curreent;
                curreent=curreent.next;
                current_Node++;
            }

            previous.next=list;
            list.next=curreent;

        }
    }

    void insertAfterValue(int loc, int val) {
        Node list = new Node(val);


        if (head != null) {
            Node curreent = head;
            Node previous = null;


            while (curreent.data != loc) {
                previous = curreent;
                curreent = curreent.next;
            }

            previous.next = list;
            list.next = curreent;

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
                nodeCount=nodeCount+1;
                if(loc==nodeCount-1)
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
                previous=current;
                current=current.next;
            }
        }
    }

    void search(int number)
    {
        Node list=head;
        for(;list!=null;list=list.next)
        {
            if(list.data==number)
            {
                System.out.printf("The number you eneter id is founde");
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

    void insertionSort()
    {
        Node current=head;
        Node compare=head;
        Node previous;



        for (current=current.next;current!=null;current=current.next)
        {
            int change_Var=current.data;
            previous=current;

            while (previous.data>change_Var && previous.next!=null)
            {
                compare.data=previous.data;
                previous.data=current.data;


                previous=previous.next;

            }
            current.data=change_Var;
        }

    }

}
