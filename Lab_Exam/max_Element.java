public class max_Element
{
    public static void main(String[] args)
    {
        int find_number=5;
        queue array_of_Queue=new queue();


        for (int i=0;i<10;i++)
        {
            array_of_Queue.enqueue(i);
        }

        array_of_Queue.find_Max();
        System.out.println();
        array_of_Queue.find_Number(find_number);

    }

    public static class queue
    {
        node head;
        node tail;

        public void enqueue(int val)
        {
            node list=new node(val);

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

        public void dequeue()
        {
            head=head.next;
        }

        public void find_Max()
        {
            node list=head;
            int number=0;

            while (list!=null)
            {
                if(number<list.data)
                {
                    number=list.data;
                }
                list=list.next;
            }

            System.out.println("Maximum Number is " + number);
        }

        public  void find_Number(int numbers)
        {
            node list=head;
            int number=numbers;

            while (list!=null)
            {
                if(number==list.data)
                {
                    number=list.data;
                    break;
                }
                list=list.next;
            }

            System.out.println("Maximum Number is " + number);
        }
    }

    public static class node
    {
        int data;
        node next;

        public node(int data)
        {
            this.data=data;
        }
    }
}
