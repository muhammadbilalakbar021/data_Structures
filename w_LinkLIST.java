public class w_LinkLIST
{

    w_NOde head;
    w_NOde tail;

    public w_LinkLIST()
    {
        head=null;
        tail=null;
    }


    void insertAtStart(int val)
    {
        w_NOde list=new w_NOde(val);

        if(head==null)
        {
            head=list;
            tail=list;
            list.previous=null;
            list.next=tail;
        }
        else
        {
            list.next=head;
            head=list;
        }
    }

    void insertAtEND(int val)
    {
        w_NOde list=new w_NOde(val);

       tail.next=list;
       tail=list;
    }

    void insertAtLocation(int loc, int val)
    {
        int counter=0;
        w_NOde list=new w_NOde(val);
        w_NOde current=head;
        w_NOde previous=null;

        while (counter<loc)
        {
            previous=current;
            current=current.next;

            counter++;
        }
        list.previous=previous;
        list.next=current;
        previous.next=list;
        current.previous=list;
    }


    void deleteAtStart()
    {
        head=head.next;
    }

    void deleteAtEnd()
    {

        tail.previous.next=null;

    }

    void deleteAtLocation(int loc)
    {
        int counter=0;
        w_NOde current=head;
        w_NOde previous=null;

        while (counter<loc)
        {
            previous=current;
            current=current.next;
            counter++;
        }
        previous.next=previous.next.next;
        current.next.previous=current.previous;

    }

    void display()
    {
        w_NOde list=head;
        for(;list!=null;list=list.next)
        {
            System.out.printf("%3d",list.value);
        }
    }

}

