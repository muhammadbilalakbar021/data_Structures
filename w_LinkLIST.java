public class w_LinkLIST
{

    w_NOde head;
    w_NOde tail;
    w_NOde previous;

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

        }
        else
        {
            list.next=head;
            head=list;
            previous=list;
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

        while (counter<loc-1)
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

    void insertAfterlocation(int loc, int val)
    {
        int counter=0;
        w_NOde list=new w_NOde(val);
        w_NOde current=head;
        w_NOde previous=null;

        while (counter!=loc)
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
        w_NOde list1=head;
        while (list1.next!=null)
        {
            list1=list1.next;
        }


        w_NOde list=list1;
        while (list.previous!=null)
        {
            System.out.printf("%3d",list.value);
            list=list.previous;
        }
    }

    public void bubble_Sort()
    {

        w_NOde current=head;
        w_NOde current_second=head;
        w_NOde previous=null;

        int temp_Variable=0;

        while(current_second.next!=null)
        {
//           for(;current!=null;current=current.next)
            while (current.next!=null)
            {
                previous=current;
                current=current.next;

                if(previous.value>current.value)
                {
                    temp_Variable=previous.value;
                    previous.value=current.value;
                    current.value=temp_Variable;

                }

            }
            current=head;
            current_second=current_second.next;

//            head=head.next;

        }

    }


    public void selection_Sort()
    {

        int min_Index=0,temp;
        w_NOde current=head;
        w_NOde exchange=current,temp_NOde=null;

        while (current.next!=null)
        {

            min_Index=current.value;
            exchange=current;

            for(;exchange.next!=null;exchange=exchange.next)
            {
                if(exchange.value>current.value)
                {
                    min_Index=exchange.value;
                    temp_NOde.value=exchange.value;

                }



            }
            temp=min_Index;
            current.value=temp_NOde.value;
            temp_NOde.value=temp;
            current=current.next;
        }

    }

    public void insertion_Sort()
    {

    }


    public void modified_Sort()
    {
        w_NOde current=head;
        w_NOde current_second=head;
        w_NOde previous=null;
        int flag=0;

        int temp_Variable=0;

        while(current_second.next!=null)
        {
//           for(;current!=null;current=current.next)
            while (current.next!=null)
            {
                previous=current;
                current=current.next;

                if(previous.value>current.value)
                {
                    temp_Variable=previous.value;
                    previous.value=current.value;
                    current.value=temp_Variable;
                    flag=1;

                }

            }
            current=head;
            current_second=current_second.next;
            if(flag==0)
            {
                break;
            }

//            head=head.next;

        }

    }


}

