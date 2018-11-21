//Bilal Mazhar FA17-BSE-153
//FAHAD Tanveer FA17-BSE-047
//Sajjad Ahmed FA17-BSE-125
//Bilal Akbar FA17-BSE-068
package travel_Agency_Simulator;

import java.util.Arrays;

public class city {
    public String name;
    public int rows;
    public String[][] seats;
    public String[] seats_Reserved;
    public int total;
    public int numUsed;
    public int starting_Number=1;

    public city(String name, int rows) {
        this.name = name;
        this.rows = rows+1;
        this.total = rows * 6;
        this.numUsed = 0;
        seat_Maker();


    }


    //This method is Creating Two day array of all Seats of String Type
    private void seat_Maker() {
        seats = new String[rows][7];
        for (int i = 1; i <rows; i++) {
            for (int j = 1; j <= 6; j++) {
                int number = 64 + j;
                seats[i][j] = "" + i + (char) number;

            }
        }


    }


    //Method to Chechk Seat Availabilty
    public boolean seatAvailabiltiy(int seats_number) {
        if ((total - numUsed) >= seats_number)
        {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String[][] getSeats() {
        return seats;
    }

    public void setSeats(String[][] seats) {
        this.seats = seats;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNumUsed() {
        return numUsed;
    }

    public void setNumUsed(int numUsed) {
        this.numUsed = numUsed;
    }

    public void display() {

    }


    //Method to reserve SeaTS
    public void reserveSeats(int number)
    {
        seats_Reserved=new String[rows*6];
//        seats_Reserved= Arrays.copyOf(seats,seats.length);
        if(starting_Number==1)
        {


            for (int i = 1; i <rows; i++)
            {
                for (int j = 1; j <= 6; j++)
                {
                    if(starting_Number<=number)
                    {
                        seats_Reserved[starting_Number]=seats[i][j];
                        seats[i][j]=null;
                        starting_Number++;
                    }

                }
            }
            starting_Number=number;
            this.numUsed=number;

        }
        else
        {
            number=starting_Number+number-1;
            for (int i = 1; i <rows; i++)
            {
                for (int j = 1; j <= 6; j++)
                {
                    if(seats[i][j]!=null)
                    {
                        if(starting_Number<=number)
                        {
                            seats_Reserved[starting_Number]=seats[i][j];
                            seats[i][j]=null;
                            starting_Number++;
                        }
                    }

                }
            }
            starting_Number=number;
           this.numUsed=number+1;
        }

    }


    public String[] getReservedSeats()
    {
        return seats_Reserved;
    }
}
