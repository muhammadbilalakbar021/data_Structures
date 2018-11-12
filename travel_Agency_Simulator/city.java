package travel_Agency_Simulator;

public class city {
    public String name;
    public int rows;
    public String[][] seats;
    public int total;
    public int numUsed;

    public city(String name, int rows) {
        this.name = name;
        this.rows = rows;
        this.total = rows * 6;
        this.numUsed = 0;
        seat_Maker();
    }

    private void seat_Maker() {
        seats = new String[rows][6];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 6; j++) {
                int number = 65 + j;
                seats[i][j] = "" + i + (char) number;

            }
        }
    }


    public boolean seatAvailabiltiy(int seats_number) {
        if ((total - numUsed) > seats_number) {
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
        System.out.println(name);
        System.out.println(rows);
    }

    public void reserveSeats(int number)
    {
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                if (i + j < number)
                    {
                    seats[i][j] = null;
                    numUsed++;
                }
            }
        }
    }
}
