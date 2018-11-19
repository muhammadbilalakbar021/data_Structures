import java.util.Scanner;
public class test_Functions
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("How do you want to implement the list ??");
        System.out.println("1. ArrayADT");
        System.out.println("2. Linked List");
        System.out.println("Doubly Linked List  ");

        int user_Input=input.nextInt();

        while(user_Input!=3)
        {
            switch (user_Input)
            {
                case 1:
                {
                    //Arrays code
                    System.out.println("How many Elements you want to insert in Array ?");
                    user_Input=input.nextInt();

                    Array_Operations array=new Array_Operations(user_Input);

                    System.out.println("What operation do you want to do on array?\n" +
                            "1.insert\n" +
                            "2.delete\n" +
                            "3.insert at index\n" +
                            "4.insert after value\n" +
                            "5.search\n" +
                            "6.sort(Insertion sort)\n" +
                            "9.print\n" +
                            "0.exit\n");


                    break;
                }

                case 2:
                {
                    //singly_List code here
                    break;
                }

                case 3:
                {
                    //Doubly_List code here
                    break;
                }
                default:
            }
        }

    }
}
