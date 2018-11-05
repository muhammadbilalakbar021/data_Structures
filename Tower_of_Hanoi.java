import java.util.Scanner;
public class Tower_of_Hanoi
{

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
        int flag=0;
        int check=0;
        Node temp_Node=head;
        int C_Stack_status=0;


        void insert_Function(int val)
        {
            Node list = new Node(val);

            if (head == null) {
                head = list;
                tail = list;
            } else {
                tail.next = list;
                tail = list;

            }
            flag=1;
            C_Stack_status++;

        }

        int check_Stack()
        {
            if (flag==1)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }

        int check_Value()
        {
            return head.data;
        }

        int returnStack()
        {

            if(head!=null)
            {
                int value=head.data;
                head=head.next;
                C_Stack_status--;
                return value;
            }
            else
            {
                return 0;
            }
        }

        boolean game_Status()
        {
            if(C_Stack_status==3)
            {
                return true;
            }
            else
            {
                return false;
            }

        }


        int printStack()
        {

            if(check==0)
            {
                temp_Node=head;
                check=1;
                if(temp_Node!=null)
                {
                    int temp=temp_Node.data;
                    temp_Node=temp_Node.next;
                    return temp;
                }
                else
                {
                    return 0;
                }
            }
            else
            {
                if(temp_Node!=null)
                {
                    int temp=temp_Node.data;
                    temp_Node=temp_Node.next;
                    return temp;
                }
                else
                {

                    return 0;
                }
            }
        }

        void setCheck(int val)
        {
            this.check=val;
        }

        void Game()
        {

            Scanner input=new Scanner(System.in);
            char input_Source,input_Destination;
            Stack_Array A=new Stack_Array();
            Stack_Array B=new Stack_Array();
            Stack_Array C=new Stack_Array();
            System.out.println("Enter the number of Discs ?");
            int discs=input.nextInt();

            for (int i=1;i<=discs;i++)
            {
                A.insert_Function(i);

            }
//            A.display(discs,A,B,C);
//            setCheck(0);

            System.out.println("Enter Source");
            input_Source=input.next().charAt(0);
            System.out.println("Enter Destination");
            input_Destination=input.next().charAt(0);

            while (C.game_Status()==false)
            {
                if(input_Source=='A' || input_Source=='a')
                {
                    switch (input_Destination)
                    {
                        case 'B' :
                        {

                            if(B.check_Stack()==0)
                            {
                                B.insert_Function(A.returnStack());
//                                A.display(discs,A,B,C);
//                                setCheck(0);
                                System.out.println("A ->B");
                            }
                            else
                            {
                                if(A.check_Value()<B.check_Value())
                                {
                                    B.insert_Function(A.returnStack());
                                    System.out.println(B.check_Stack());
                                    System.out.println("A ->B stat 1");
                                }
                                else
                                {
                                    System.out.println("Pushing Disc not Possible");
                                }
                            }

                            break;
                        }
                        case 'C':
                        {
                            if(C.check_Stack()==0)
                            {
                                C.insert_Function(A.returnStack());
                                System.out.println("A -> C");
                            }
                            else
                            {
                                if(A.check_Value()<C.check_Value())
                                {
                                    C.insert_Function(A.returnStack());
                                    System.out.println("A -> C STAT 1");
                                }
                                else
                                {
                                    System.out.println("Pushing Disc not Possible");
                                }
                            }
                            break;
                        }
                        default:
                        {
                            System.out.println("None");
                        }
                    }

                }
                else if(input_Source=='B' || input_Source=='b')
                {
                    switch (input_Destination)
                    {
                        case 'A' :
                        {

                            if(A.check_Stack()==0)
                            {
                                A.insert_Function(B.returnStack());
                                A.display(discs,A,B,C);
                                setCheck(0);
                            }
                            else
                            {
                                if(B.check_Value()<A.check_Value())
                                {
                                    A.insert_Function(B.returnStack());
                                    System.out.println(B.check_Stack());
                                }
                                else
                                {
                                    System.out.println("Pushing Disc not Possible");
                                }
                            }

                            break;
                        }
                        case 'C':
                        {
                            if(C.check_Stack()==0)
                            {
                                C.insert_Function(B.returnStack());
                            }
                            else
                            {
                                if(A.check_Value()<C.check_Value())
                                {
                                    C.insert_Function(B.returnStack());
                                }
                                else
                                {
                                    System.out.println("Pushing Disc not Possible");
                                }
                            }
                            break;
                        }
                        default:
                        {
                            System.out.println("None");
                        }
                    }

                }
                else if(input_Source=='C' || input_Source=='c')
                {
                    switch (input_Destination)
                    {
                        case 'B' :
                        {

                            if(B.check_Stack()==0)
                            {
                                B.insert_Function(C.returnStack());
                                A.display(discs,A,B,C);
                                setCheck(0);
                            }
                            else
                            {
                                if(C.check_Value()<B.check_Value())
                                {
                                    B.insert_Function(C.returnStack());
                                    System.out.println(B.check_Stack());
                                }
                                else
                                {
                                    System.out.println("Pushing Disc not Possible");
                                }
                            }

                            break;
                        }
                        case 'A':
                        {
                            if(C.check_Stack()==0)
                            {
                                A.insert_Function(C.returnStack());
                            }
                            else
                            {
                                if(A.check_Value()>C.check_Value())
                                {
                                    A.insert_Function(C.returnStack());
                                }
                                else
                                {
                                    System.out.println("Pushing Disc not Possible");
                                }
                            }
                            break;
                        }
                        default:
                        {
                            System.out.println("None");
                        }
                    }

                }

                System.out.println("Enter Source");
                input_Source=input.next().charAt(0);
                System.out.println("Enter Destination");
                input_Destination=input.next().charAt(0);

            }




        }

        void display(int discs,Stack_Array A,Stack_Array B,Stack_Array C)
        {
            System.out.println("  A   B   C");
            for(int i=1;i<=discs;i++)
            {
                System.out.printf("%3d %3d %3d%n",A.printStack(),B.printStack(),C.printStack());
            }
        }
    }

    public static void main(String[] args)
    {
        Stack_Array object=new Stack_Array();
        object.Game();
    }
}
