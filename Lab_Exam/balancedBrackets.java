public class balancedBrackets {
    public static void main(String[] args) {
        String string = "{([]}]";
        liniked linked_lIst = new liniked();

        String[] array=string.split("");


        for (int i=0;i<array.length;i++)
        {
            if(array[i].equals("{") || array[i].equals("[")  || array[i].equals("("))
            {
                linked_lIst.push(array[i]);

            }
            else
            {
                if (linked_lIst.empty()==false)
                {
//                    if(linked_lIst.head.data=="}" || linked_lIst.head.data=="]" || linked_lIst.head.data==")")
                    if(array[i].equals("}") || array[i].equals("]")  || array[i].equals(")"))
                    {
                        linked_lIst.pop();
                    }

                }
            }
        }
//        linked_lIst.display();

        System.out.println(linked_lIst.head.data);
        if(linked_lIst.empty()==true)
        {
            System.out.println( "true");
        }
        else
        {
            System.out.println( "false");
        }

    }

    public static class liniked {
        node head;
        node tail;


        void push(String val) {
            node list = new node(val);

            if (head == null) {
                head = list;
                tail = list;
            }
            else {
                list.next = head;
                head = list;
            }
        }

        void  pop()
        {
            head=head.next;
        }


        boolean empty()
        {
            if (head ==null )
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
            node list=head;
            while (list.next!=null)
            {
                System.out.println(list.data);
                list=list.next;
            }
        }
    }

    public static class node {
        String data;
        node next;

        public node(String data) {
            this.data = data;
        }
    }
}

