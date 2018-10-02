public class linked_Test
{
    public static void main(String[] args)
    {
        linked_LIst linked=new linked_LIst();



        linked.insertAtStart(1);
        linked.insertAtStart(2);
        linked.insertAtEND(3);
        linked.deleteAtLocation(2);
//        linked.deleteAtEnd();
//        linked.deleteAtStart();
        linked.display();

    }
}
