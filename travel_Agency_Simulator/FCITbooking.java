//Bilal Mazhar FA17-BSE-153
//FAHAD Tanveer FA17-BSE-047
//Sajjad Ahmed FA17-BSE-125
//Bilal Akbar FA17-BSE-068


import java.io.PrintStream;

public class FCITbooking
{
    private int bookngNumber;
    private String firstName;
    private String lastName;
    private int unversityID;
    private int numSeats;
    private String destinationCity;
    private String[] seatsAssigned;
    private int timeCompleted;
    private FCITbooking next;
    StringBuilder stringBuilder= new StringBuilder();


    public FCITbooking(int bookngNumber, String firstName, String lastName, int unversityID,  String destinationCity, String[] seatsAssigned, int timeCompleted)
    {
        this.bookngNumber = bookngNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.unversityID = unversityID;
        this.numSeats = numSeats;
        this.destinationCity = destinationCity;
        this.seatsAssigned = seatsAssigned;
        this.timeCompleted = timeCompleted;
        this.next = next;
    }

    public FCITbooking(String firstName, String lastName,String[] seatsAssigned)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.seatsAssigned=seatsAssigned;

    }

    public int getBookngNumber() {
        return bookngNumber;
    }

    public void setBookngNumber(int bookngNumber) {
        this.bookngNumber = bookngNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getUnversityID() {
        return unversityID;
    }

    public void setUnversityID(int unversityID) {
        this.unversityID = unversityID;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getSeatsAssigned()
    {
        for (int i=0;i<seatsAssigned.length;i++)
        {
            if(seatsAssigned[i]!=null)
            {
                 stringBuilder.append(" " + seatsAssigned[i]);
            }

        }
        String final_String=stringBuilder.toString();
        return final_String;

    }

    public void setSeatsAssigned(String[] seatsAssigned) {
        this.seatsAssigned = seatsAssigned;
    }

    public int getTimeCompleted() {
        return timeCompleted;
    }

    public void setTimeCompleted(int timeCompleted) {
        this.timeCompleted = timeCompleted;
    }

    public FCITbooking getNext() {
        return next;
    }

    public void setNext(FCITbooking next) {
        this.next = next;
    }
}
