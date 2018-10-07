public class wLink_SortingClass implements wLink_Sorting
{
    w_NOde head;
    w_NOde tail;

    public wLink_SortingClass()
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
//            list.previous=null;
//            list.next=tail;
        }
        else
        {
            list.next=head;
            head=list;
        }
    }


    @Override
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

    @Override
    public void selection_Sort()
    {
        int min_Index=0,temp;
        w_NOde current=head;
        w_NOde exchange,temp_NOde=null;

        OUTTER:
        for (;current.next!=null;current=current.next)
        {
            min_Index=current.value;
            exchange=current;
            INNER:
            for(;exchange.next!=null;exchange=exchange.next)
            {

                if(exchange.value<current.value)
                {
                    min_Index=exchange.value;
                    temp_NOde.value=exchange.value;
                    continue OUTTER;

                }

                System.out.println(exchange.value);

            }
            temp=min_Index;
            current.value=temp_NOde.value;
            temp_NOde.value=temp;
        }

    }

    @Override
    public void insertion_Sort() {

    }

    @Override
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

    void display()
    {
        w_NOde list=head;
        for(;list!=null;list=list.next)
        {
            System.out.printf("%3d",list.value);
        }
    }
}
