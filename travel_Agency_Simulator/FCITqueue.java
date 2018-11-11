package travel_Agency_Simulator;

public class FCITqueue
{
    FCITmember front;
    FCITmember back;
    private String name;

    public void FCITqueuesetnull()
    {
        this.front=null;
        this.back=null;
    }

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

    public void push(String firstName, String lastName, int universityID, String destinationCity, int numSeats,int time)
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

    public FCITmember pop()
    {
//        if(front!=null)
//        {
//            FCITmember temp=front;
//            if (front.getNext()!=null)
//            {
//                front=front.getNext();
//            }
//            return temp;
//        }
//        else
//        {
//            System.out.println("FCITqueue is empty");
//            return null;
//        }
        FCITmember temp=front;
        front=front.getNext();
        return temp;


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
