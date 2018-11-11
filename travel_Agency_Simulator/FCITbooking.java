package travel_Agency_Simulator;

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

    public FCITbooking(int bookngNumber, String firstName, String lastName, int unversityID, int numSeats, String destinationCity, String[] seatsAssigned, int timeCompleted)
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

    public String[] getSeatsAssigned() {
        return seatsAssigned;
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
