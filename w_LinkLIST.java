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
            list.next.previous=list;
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
    void search(int number)
    {
        w_NOde list=head;
        for(;list!=null;list=list.next)
        {
            if(list.value==number)
            {
                System.out.printf("The number you eneter id is founde");
            }
        }

    }

    void insertAfterValue(int loc, int val)
    {
        w_NOde list=new w_NOde(val);
        w_NOde current=head;
        w_NOde previous=null;

        while (current.value!=loc)
        {
            previous=current;
            current=current.next;
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
            System.out.printf("%d  %n",list1.value);
            list1=list1.next;
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
        w_NOde current=head;
        w_NOde minimum;
        int min_Value;

        for(;current!=null;current=current.next)
        {
            minimum=current;
            min_Value=current.value;

            for(;minimum!=null;minimum=minimum.next)
            {
                if(minimum.value<min_Value)
                {
                    min_Value=minimum.value;
                }
            }
            minimum.value=current.value;
            current.value=min_Value;
        }

    }

    public void insertion_Sort()
    {
        w_NOde current=head;
        w_NOde previous;

        for (current=current.next;current.next!=null;current=current.next)
        {
            int comapre_number=current.value;
            previous=current;

            while (previous.previous.value>comapre_number && previous.next!=null)
            {
                    previous.value=previous.previous.value;
                    previous=previous.next;
            }


        }
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
    public void reverse()
    {
        w_NOde list=tail;
        for(;list!=null;list=list.previous)
        {
            System.out.printf("%3d",list.value);
        }
        System.out.println("");

    }


}

