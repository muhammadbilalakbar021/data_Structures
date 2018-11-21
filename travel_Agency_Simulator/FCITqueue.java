//Bilal Mazhar FA17-BSE-153
//FAHAD Tanveer FA17-BSE-047
//Sajjad Ahmed FA17-BSE-125
//Bilal Akbar FA17-BSE-068


public class FCITqueue
{
    FCITmember front;
    FCITmember back;
    private String name;


    public int getFlag()
    {
        return flag;
    }

    public void setFlag(int flag)
    {
        this.flag = flag;
    }

    private int flag=0;


    public FCITqueue()
    {
        this.front = null;
        this.back = null;
        this.name = null;
    }

    public void push(String firstName, String lastName, int universityID, String destinationCity, int numSeats, int time)
    {
        FCITmember fciTmember= new FCITmember(firstName,lastName,universityID,destinationCity,numSeats,time);

        if(front==null)
        {
            front=fciTmember;
            back=fciTmember;
            flag++;

        }
        else
        {
            back.setNext(fciTmember);
            back=fciTmember;
            flag++;
        }

    }
    public void push(String firstName, String lastName, int universityID, String destinationCity, int numSeats, int time, String[] assigned ,int timec)
    {
        FCITmember fciTmember= new FCITmember(firstName,lastName,universityID,destinationCity,numSeats,time,assigned,timec);

        if(front==null)
        {
            front=fciTmember;
            back=fciTmember;
            flag++;

        }
        else
        {
            back.setNext(fciTmember);
            back=fciTmember;
            flag++;
        }

    }
    public FCITmember pop()
    {

        FCITmember temp=front;
            front=front.next;
            flag--;
            return temp;

//        if (front.next!=null)
//        {
//            FCITmember temp=front;
//            front=front.next;
//            return temp;
//        }
//        else
//        {
//            return null;
//        }



    }

    public void display()
    {
        FCITmember temp=front;
        while (temp!=null)
        {
            System.out.println(temp.getEnterTime());
            System.out.println(temp.getUniversityID());
            System.out.println(temp.getFirstName());
            System.out.println(temp.getLastName());
            System.out.println(temp.getDestinationCity());
            System.out.println(temp.getNumSeats());
            temp=temp.getNext();
        }
    }

    public boolean empty()
    {
        if(front==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int time()
    {
        if(front!=null)
        {
            return front.getEnterTime();
        }
        else
        {
            return 0;
        }
    }




}
