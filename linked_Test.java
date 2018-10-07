public class linked_Test
{
    public static void main(String[] args)
    {
        wLink_SortingClass linked=new wLink_SortingClass();


//
        linked.insertAtStart(54);
        linked.insertAtStart(23);
        linked.insertAtStart(59);
        linked.insertAtStart(87);
        linked.insertAtStart(65);
        linked.insertAtStart(12);

//        linked.bubble_Sort();
//        linked.modified_Sort();
        linked.selection_Sort();


//        linked.insertAtStart(12);
//        linked.insertAtStart(32);
//        linked.insertAtStart(42);
//        linked.insertAtEND(52);
//        linked.insertAtLocation(3,92);
//        linked.deleteAtStart();
//        linked.deleteAtEnd();
//        linked.deleteAtLocation(2);



//
//        linked.insertAtStart(1);
//        linked.insertAtStart(2);
//        linked.insertAtEND(3);
//        linked.insertAtLocation(3,32);
//        linked.deleteAtLocation(2);
//        linked.deleteAtEnd();
//        linked.deleteAtStart();
        linked.display();




    }
}
