package travel_Agency_Simulator;

public class FCITbookingStack
{
    private FCITbooking top;

    public FCITbookingStack(FCITbooking top)
    {
        this.top = top;
    }

    public void push(int bookngNumber, String firstName, String lastName, int unversityID, int numSeats, String destinationCity, String[] seatsAssigned, int timeCompleted)
    {
        FCITbooking fciTbooking=new FCITbooking(bookngNumber,firstName,lastName,unversityID,numSeats,destinationCity,seatsAssigned,timeCompleted);
        if(top==null)
        {
            top=fciTbooking;
        }
        else
        {
            fciTbooking.setNext(top);
            top=fciTbooking;
        }
    }

    public void pop()
    {
        if(top!=null)
        {
            top=top.getNext();
        }
        else
        {
            System.out.println("FCITbooking is Empty");
        }
    }
}
