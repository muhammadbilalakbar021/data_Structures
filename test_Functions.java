import java.util.Scanner;
public class test_Functions
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
//        System.out.println("How do you want to implement the list ??");
//        System.out.println("1. ArrayADT");
//        System.out.println("2. Linked List");
//        System.out.println("3. Doubly Linked List  ");

//        int user_Input=input.nextInt();
        w_LinkLIST lt=new w_LinkLIST();
        lt.insertAtStart(9);
        lt.insertAtStart(8);
        lt.insertAtStart(7);
        lt.insertAtStart(6);
        lt.insertAtStart(5);
        lt.insertAtStart(4);
        lt.insertAtStart(3);
        lt.insertAtStart(2);

//        lt.reverse();

        lt.display();


    }
}
