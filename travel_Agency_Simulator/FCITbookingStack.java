//Bilal Mazhar FA17-BSE-153
//FAHAD Tanveer FA17-BSE-047
//Sajjad Ahmed FA17-BSE-125
//Bilal Akbar FA17-BSE-068

public class FCITbookingStack
{
     FCITbooking top;

    public FCITbookingStack()
    {
        this.top = null;
    }

    public void push(int bookngNumber, String firstName, String lastName, int unversityID, String destinationCity, String[] seatsAssigned, int timeCompleted)
    {
        FCITbooking fciTbooking=new FCITbooking(bookngNumber,firstName,lastName,unversityID,destinationCity,seatsAssigned,timeCompleted);
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

//    public void push(String name, String firstName, int universityID, String lastName, int numSeats, int enterTime)
    public void push(String firstName,String lastName, String[] seatsAssigned)
    {
        FCITbooking fciTbooking=new FCITbooking(firstName,lastName, seatsAssigned);
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

    public String getFirstname()
    {
        return top.getFirstName();
    }

    public String getLastName()
    {
        return top.getLastName();
    }

    public boolean empty()
    {
        if(top==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}
