package travel_Agency_Simulator;

public class FCITmember
{
    private String firstName;
    private String lastName;
    private int universityID;
    private String destinationCity;
    private int numSeats;
    private boolean seatsAvailable;
    private String[] seatsAssigned;
    private int enterTime;
    private int timeNeededForBooking;
    FCITmember next;
    public boolean seats;

    public  FCITmember()
    {

    }

    public FCITmember(String firstName,String lastName, int universityID, String destinationCity,int numSeats,int enterTime)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.universityID = universityID;
        this.destinationCity = destinationCity;
        this.numSeats = numSeats;
        this.enterTime=enterTime;
    }


    public FCITmember(String firstName, String lastName, int universityID, String destinationCity, int numSeats, boolean seatsAvailable, String[] seatsAssigned, int enterTime, int timeNeededForBooking, FCITmember next)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.universityID = universityID;
        this.destinationCity = destinationCity;
        this.numSeats = numSeats;
        this.seatsAvailable = seatsAvailable;
        this.seatsAssigned = seatsAssigned;
        this.enterTime = enterTime;
        this.timeNeededForBooking = timeNeededForBooking;
        this.next = next;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getUniversityID()
    {
        return universityID;
    }

    public void setUniversityID(int universityID)
    {
        this.universityID = universityID;
    }

    public String getDestinationCity()
    {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity)
    {
        this.destinationCity = destinationCity;
    }

    public int getNumSeats()
    {
        return numSeats;
    }

    public void setNumSeats(int numSeats)
    {
        this.numSeats = numSeats;
    }

    public boolean isSeatsAvailable()
    {
        return seatsAvailable;
    }

    public void setSeatsAvailable(boolean seatsAvailable)
    {
        this.seatsAvailable = seatsAvailable;
    }

    public String[] getSeatsAssigned()
    {
        return seatsAssigned;
    }

    public void setSeatsAssigned(String[] seatsAssigned)
    {
        this.seatsAssigned = seatsAssigned;
    }

    public int getEnterTime()
    {
        return enterTime;
    }

    public void setEnterTime(int enterTime)
    {
        this.enterTime = enterTime;
    }

    public int getTimeNeededForBooking()
    {
        return timeNeededForBooking;
    }

    public void setTimeNeededForBooking(int timeNeededForBooking)
    {
        this.timeNeededForBooking = timeNeededForBooking;
    }

    public FCITmember getNext()
    {
        return next;
    }

    public void setNext(FCITmember next)
    {
        this.next = next;
    }

    public int nullHandler()
    {
        return 0;
    }

    public boolean seat_Reserved()
    {
       return seats;
    }
    public boolean seat_Reserved(boolean var)
    {
        this.seats=var;
        return seats;
    }
}
