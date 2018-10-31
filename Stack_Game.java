import java.util.Scanner;
public class Stack_Game
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("How many Menbers you Wnat for Game");
        int input_Variable=input.nextInt();

        Stack_Array stack_array=new Stack_Array();

        for (int i=1;i<=input_Variable;i++)
        {
            stack_array.insert_Function(i);
        }

        stack_array.game(input_Variable);

        stack_array.display();
    }

    public static class Node
    {
        int data;
        Node next=null;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public static class Stack_Array
    {
        Node head;
        Node tail;

       void insert_Function(int val)
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

        void game(int inout_Variable)
        {
            Node game_Pointer=head;
            Node counter_Var=head;

            tail.next=head;

            while (inout_Variable!=1)
            {
                game_Pointer.next=game_Pointer.next.next;
                game_Pointer=game_Pointer.next;
                counter_Var=counter_Var.next;
//                System.out.println(game_Pointer.next);
//                if(game_Pointer.next==game_Pointer)
//                {
//                    break;
//                }
                inout_Variable--;
                System.out.println(inout_Variable);
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
}
