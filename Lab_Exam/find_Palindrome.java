public class find_Palindrome {
    public static void main(String[] args)
    {
        String string = "hellooslleh";

        liniked linked_lIst = new liniked();
        String[] array=string.split("");

        for (int i=0;i<array.length;i++)
        {
            linked_lIst.push(array[i]);
        }

        if(linked_lIst.find((array.length)/2-1)==true )
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is not Palindrome");

        }
        System.out.println();
//        linked_lIst.display();

    }

    public static class liniked
    {
        node head;
        node tail;
        node previous;


        void push(String val)
        {
            node list=new node(val);

            if(head==null)
            {
                head=list;
                tail=list;
            }
            else
            {
                list.next=head;
                list.next.last=list;
                head=list;
                previous=list;
            }
        }

        boolean find(int number)
        {
            node list=head;
            node back=tail;
            int check=-1;

            for (int i=0;i<=number;i++)
            {

//                System.out.printf(list.data + " ");
//                System.out.printf(back.data + " ");

                if(list.data.equals(back.data))
                {
                    System.out.printf(list.data + " ");
                    System.out.printf(back.data + " ");
                    check++;
                }
                list=list.next;
                back=back.last;
                System.out.println();

            }

            if(check==number)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        void display()
        {
            node list=tail;
            for(;list!=null;list=list.last)
            {
                System.out.printf(list.data + " ");
            }
        }
    }

    public static class node
    {
        String data;
        node next;
        node last;

        public node(String data)
        {
            this.data=data;
        }
    }
}
