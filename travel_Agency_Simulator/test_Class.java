package travel_Agency_Simulator;

import java.io.*;

public class test_Class {
    public static city[] object_city = new city[10];
    public static int total_city = 0;
    public static int booking_Number=728416;
    public static int Day_Report=1;


    public static void main(String[] args) throws IOException {
        //File file=new File("/home/bilalakbar/IdeaProjects/data_Structures/src/travel_Agency_Simulator/inputFile.txt");
        File file = new File("E:\\intellij_Idea\\data_Structures\\src\\travel_Agency_Simulator/inputFile.txt");
        PrintWriter writer = new PrintWriter("out_Printed", "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line = null;
        int numbers = 0;
        int loop_flag;
        String[] tokens;


        int hello = 0;

        while ((line = bufferedReader.readLine()) != null) {
            FCITqueue queue1 = new FCITqueue();
            FCITqueue queue2 = new FCITqueue();
            FCITqueue queue3 = new FCITqueue();

            FCITqueue printing_Stack = new FCITqueue();
            FCITbookingStack fciTbookingStack = new FCITbookingStack();

            int printing_Stack1 = -1;
            int printing_Stack2 = -1;
            int printing_Stack3 = -1;
            int time1 = -1;
            int time2 = -1;
            int time3 = -1;
            int city_time1 = -1;
            int city_time2 = -1;
            int city_time3 = -1;
            int timemanage1 = -1;
            int timemanage2 = -1;
            int timemanage3 = -1;
            int entering_Time1 = -1;
            int entering_Time2 = -1;
            int entering_Time3 = -1;


            FCITqueue fciTqueue = new FCITqueue();
            FCITmember fciTmember = new FCITmember();

            FCITmember outsideLIne = new FCITmember();
            numbers = Integer.parseInt(line);
            total_city = numbers;
            for (int i = 1; i <= numbers; i++) {
                line = bufferedReader.readLine();
                tokens = line.split("\\s+");
                String var_1 = tokens[0];
                int var_2 = Integer.parseInt(tokens[1]);
                object_city[i] = new city(var_1, var_2);
            }
            line = bufferedReader.readLine();
            numbers = Integer.parseInt(line);
            loop_flag = numbers;
            for (int i = 0; i < numbers; i++) {
                line = bufferedReader.readLine();
                tokens = line.split("\\s+");
                int var_1 = Integer.parseInt(tokens[0]);
                int var_2 = Integer.parseInt(tokens[1]);
                String var_3 = tokens[2];
                String var_4 = tokens[3];
                String var_5 = tokens[4];
                int var_6 = Integer.parseInt(tokens[5]);

                fciTqueue.push(var_3, var_4, var_2, var_5, var_6, var_1);
            }

//            for (int i = fciTqueue.front.getEnterTime(); i <= fciTqueue.back.getEnterTime() + ((fciTqueue.back.getNumSeats() * 6) + 1); i++) {
            for (int i = 0; i <= 700; i++) {
                if (!fciTqueue.empty()) {
                    if (fciTqueue.front.getEnterTime() == i) {
                        if (queue2.getFlag() < queue1.getFlag()) {
                            if (!fciTqueue.empty()) {
                                fciTmember = fciTqueue.pop();

                                if (fciTmember != null) {
                                    queue2.push(fciTmember.getFirstName(), fciTmember.getLastName(), fciTmember.getUniversityID(), fciTmember.getDestinationCity(), fciTmember.getNumSeats(), fciTmember.getEnterTime());
                                    System.out.println(timeConvert(i) + "PM: " + fciTmember.getFirstName() + " " + fciTmember.getLastName() + " arrived at the FCIT Travel Agency and entered Reservations Line 2.");

                                }
                            }
                        } else if (queue3.getFlag() < queue2.getFlag()) {
                            if (!fciTqueue.empty()) {
                                fciTmember = fciTqueue.pop();
                                if (fciTmember != null) {
                                    queue3.push(fciTmember.getFirstName(), fciTmember.getLastName(), fciTmember.getUniversityID(), fciTmember.getDestinationCity(), fciTmember.getNumSeats(), fciTmember.getEnterTime());
                                    System.out.println(timeConvert(i) + "PM: " + fciTmember.getFirstName() + " " + fciTmember.getLastName() + " arrived at the FCIT Travel Agency and entered Reservations Line 3.");
                                }
                            }
                        } else if (queue1.getFlag() == queue2.getFlag()) {

                            if (!fciTqueue.empty()) {
                                fciTmember = fciTqueue.pop();
                                queue1.push(fciTmember.getFirstName(), fciTmember.getLastName(), fciTmember.getUniversityID(), fciTmember.getDestinationCity(), fciTmember.getNumSeats(), fciTmember.getEnterTime());
                                System.out.println(timeConvert(i) + "PM: " + fciTmember.getFirstName() + " " + fciTmember.getLastName() + " arrived at the FCIT Travel Agency and entered Reservations Line 1.");
                            }

                        }
                        if (fciTqueue.front != null) {
                            if (fciTqueue.front.getEnterTime() == i) {
                                i--;
                            }
                        }
                    }
                }


                if (!queue1.empty()) {
                    if (queue1.front.getEnterTime() == i) {
                        System.out.println(timeConvert(i + 1) + "PM: " + queue1.front.getFirstName() + " " + queue1.front.getLastName() + " is at the front of Reservations Line 1 and is now beginning the booking.");
                        if (queue1.front.seat_Reserved() == false) {
                            if (object_city[cityDisplay(queue1.front.getDestinationCity())] != null) {
                                if (object_city[cityDisplay(queue1.front.getDestinationCity())].seatAvailabiltiy(queue1.front.getNumSeats())) {
                                    object_city[cityDisplay(queue1.front.getDestinationCity())].reserveSeats(queue1.front.getNumSeats());
                                    queue1.front.setSeatsAssigned(object_city[cityDisplay(queue1.front.getDestinationCity())].getReservedSeats());
                                    time1 = (queue1.front.getNumSeats() * 2) + (i);
                                    queue1.front.seats = true;
                                } else {
                                    city_time1 = i + 2;

                                }
                            } else {
                                city_time1 = i + 2;

                            }
                        }
                    }
                    if (city_time1 == i) {
                        System.out.println(timeConvert(i) + "PM: " + queue1.front.getFirstName() + " " + queue1.front.getLastName() + " is leaving the FCIT Travel Agency because no seats are available for the " +
                                "requested flight.");
                        if (queue1.front.seat_Reserved() == false) {
                            queue1.pop();
                            if(queue1.front!=null)
                            {
                                timemanage1 = queue1.front.getEnterTime() + 3 ;
                                queue1.front.setEnterTime(timemanage1);
                            }
                        }
                    }
                    if (time1 == i) {
                        System.out.println(timeConvert(i + 1) + "PM: " + queue1.front.getFirstName() + " " + queue1.front.getLastName() + " has finished the booking and is now exiting Reservations Line 1.");
                        printing_Stack.push(queue1.front.getFirstName(), queue1.front.getLastName(), queue1.front.getUniversityID(), queue1.front.getDestinationCity(), queue1.front.getNumSeats(), queue1.front.getEnterTime(), queue1.front.getSeatsAssigned(),i);
                        timemanage1 = queue1.front.getEnterTime() + 1 + queue1.front.getNumSeats() * 2;
                        queue1.pop();
                        printing_Stack1 = i + 1;
                        if (queue1.front != null) {
                            {
                                queue1.front.setEnterTime(timemanage1);
                            }
                        }
                    }
                }
                if (printing_Stack1 == i) {
                    if (printing_Stack.front != null) {
                        System.out.println(timeConvert(i + 1) + "PM: " + printing_Stack.front.getFirstName() + " " + printing_Stack.front.getLastName() + "has received Printed the Booking/Voucher and is leaving the FCIT Travel Agency.");
                        fciTbookingStack.push(booking_Number,printing_Stack.front.getFirstName(),printing_Stack.front.getLastName(),printing_Stack.front.getUniversityID(),printing_Stack.front.getDestinationCity(),printing_Stack.front.getSeatsAssigned(),i);
                        printing_Stack.pop();
                        booking_Number++;
                    }

                }


                if (!queue2.empty()) {
                    if (queue2.front.getEnterTime() == i) {
                        System.out.println(timeConvert(i + 1) + "PM: " + queue2.front.getFirstName() + " " + queue2.front.getLastName() + " is at the front of Reservations Line 2 and is now beginning the booking.");
                        if (queue2.front.seat_Reserved() == false) {
                            if (object_city[cityDisplay(queue2.front.getDestinationCity())] != null) {
                                if (object_city[cityDisplay(queue2.front.getDestinationCity())].seatAvailabiltiy(queue2.front.getNumSeats())) {
                                    object_city[cityDisplay(queue2.front.getDestinationCity())].reserveSeats(queue2.front.getNumSeats());
                                    queue2.front.setSeatsAssigned(object_city[cityDisplay(queue2.front.getDestinationCity())].getReservedSeats());
                                    time2 = (queue2.front.getNumSeats() * 2) + (i);
                                    queue2.front.seats = true;
                                } else {
                                    city_time2 = i + 2;
                                }
                            } else {
                                if (queue2.front.seat_Reserved() == false) {
                                    city_time2 = i + 2;
                                }
                            }
                        }
                    }
                    if (city_time2 == i) {
                        System.out.println(timeConvert(i) + "PM: " + queue2.front.getFirstName() + " " + queue2.front.getLastName() + " is leaving the FCIT Travel Agency because no seats are available for the " +
                                "requested flight.");
                        queue2.pop();
                        if(queue2.front!=null)
                        {
                            timemanage2 = queue2.front.getEnterTime() + 3 ;
                            queue2.front.setEnterTime(timemanage2);

                        }
                    }
                    if (time2 == i) {
                        System.out.println(timeConvert(i + 1) + "PM: " + queue2.front.getFirstName() + " " + queue2.front.getLastName() + " has finished the booking and is now exiting Reservations Line 2.");
                        timemanage2 = queue2.front.getEnterTime() + 1 + queue2.front.getNumSeats() * 2;
                        entering_Time2 = queue2.front.getEnterTime();
                        if(queue2.front.getSeatsAssigned()!=null)
                        printing_Stack.push(queue2.front.getFirstName(), queue2.front.getLastName(), queue2.front.getUniversityID(), queue2.front.getDestinationCity(), queue2.front.getNumSeats(), queue2.front.getEnterTime(), queue2.front.getSeatsAssigned(),i);
                        queue2.pop();
                        printing_Stack2 = i + 1;
                        if (queue2.front != null) {
//                           if(queue3.front.getEnterTime()==i)
                            {
                                queue2.front.setEnterTime(timemanage2);
                            }
                        }

                    }


                }
                if (printing_Stack2 == i) {
                    if (printing_Stack.front != null) {
                        System.out.println(timeConvert(i + 1) + "PM: " + printing_Stack.front.getFirstName() + " " + printing_Stack.front.getLastName() + "has received Printed the Booking/Voucher and is leaving the FCIT Travel Agency.");
                        fciTbookingStack.push(booking_Number,printing_Stack.front.getFirstName(),printing_Stack.front.getLastName(),printing_Stack.front.getUniversityID(),printing_Stack.front.getDestinationCity(),printing_Stack.front.getSeatsAssigned(),i);
                        printing_Stack.pop();
                        booking_Number++;
                    }
                }


                if (!queue3.empty()) {
                    if (queue3.front.getEnterTime() == i) {
                        System.out.println(timeConvert(i + 1) + "PM: " + queue3.front.getFirstName() + " " + queue3.front.getLastName() + " is at the front of Reservations Line 3 and is now beginning the booking.");
                        if (queue3.front.seat_Reserved() == false) {
                            if (object_city[cityDisplay(queue3.front.getDestinationCity())] != null) {
                                if (object_city[cityDisplay(queue3.front.getDestinationCity())].seatAvailabiltiy(queue3.front.getNumSeats())) {
                                    object_city[cityDisplay(queue3.front.getDestinationCity())].reserveSeats(queue3.front.getNumSeats());
                                    queue3.front.setSeatsAssigned(object_city[cityDisplay(queue3.front.getDestinationCity())].getReservedSeats());
                                    time3 = (queue3.front.getNumSeats() * 2) + (i);
                                    queue3.front.seats = true;
                                } else {
                                    city_time3 = i + 2;
                                }
                            }
                            else
                                {
                                if (queue3.front.seat_Reserved() == false) {
                                    city_time3 = i + 2;
                                }
                            }
                        }
                    }
                    if (city_time3 == i) {
                        System.out.println(timeConvert(i) + "PM: " + queue3.front.getFirstName() + " " + queue3.front.getLastName() + " is leaving the FCIT Travel Agency because no seats are available for the " +
                                "requested flight.");
                        queue3.pop();
                        if(queue3.front!=null)
                        {
                            timemanage3 = queue3.front.getEnterTime() + 3 ;
                            queue3.front.setEnterTime(timemanage3);
                        }
                    }
                    if (time3 == i) {
                        System.out.println(timeConvert(i + 1) + "PM: " + queue3.front.getFirstName() + " " + queue3.front.getLastName() + " has finished the booking and is now exiting Reservations Line 2.");
                        timemanage3 = queue3.front.getEnterTime() + 1 + queue3.front.getNumSeats() * 2;
                        entering_Time3 = queue3.front.getEnterTime();
                        if(queue3.front.getSeatsAssigned()!=null)
                            printing_Stack.push(queue3.front.getFirstName(), queue3.front.getLastName(), queue3.front.getUniversityID(), queue3.front.getDestinationCity(), queue3.front.getNumSeats(), queue3.front.getEnterTime(), queue3.front.getSeatsAssigned(),i);
                        queue3.pop();
                        printing_Stack3 = i + 1;
                        if (queue3.front != null) {
//                           if(queue3.front.getEnterTime()==i)
                            {
                                queue3.front.setEnterTime(timemanage3);
                                System.out.println( queue3.front.getFirstName() +  queue3.front.getEnterTime() + i);
                            }
                        }

                    }


                }
                if (printing_Stack3 == i) {
                    if (printing_Stack.front != null) {
                        System.out.println(timeConvert(i + 1) + "PM: " + printing_Stack.front.getFirstName() + " " + printing_Stack.front.getLastName() + "has received Printed the Booking/Voucher and is leaving the FCIT Travel Agency.");
                        fciTbookingStack.push(booking_Number,printing_Stack.front.getFirstName(),printing_Stack.front.getLastName(),printing_Stack.front.getUniversityID(),printing_Stack.front.getDestinationCity(),printing_Stack.front.getSeatsAssigned(),i);
                        printing_Stack.pop();
                        booking_Number++;

                    }
                }

            }

            System.out.println("*** Day "+Day_Report+ ": FCIT Travel Agency Report ***:");
            Day_Report++;
            System.out.println("Confirmed Bookings");
            while (!fciTbookingStack.empty()) {
//                if (!fciTbookingStack.empty())
                {
                    System.out.printf("Booking Number :    "+fciTbookingStack.top.getBookngNumber());
                    System.out.println();
                    System.out.printf("Time Completed :     "+timeConvert(fciTbookingStack.top.getTimeCompleted())+" PM");
                    System.out.println();
                    System.out.printf("Customer Name :     "+fciTbookingStack.getFirstname() + " " + fciTbookingStack.getLastName());
                    System.out.println();
                    System.out.printf("University Id :     "+fciTbookingStack.top.getUnversityID());
                    System.out.println();
                    System.out.printf("Destination City :  "+fciTbookingStack.top.getDestinationCity());
                    System.out.println();
                    System.out.printf("Seats :            "+fciTbookingStack.top.getSeatsAssigned());
                    fciTbookingStack.pop();
                    System.out.println( );
                    System.out.println( );
                    System.out.println( );
                    System.out.println( );
                }
            }
            System.out.println("--------------------------------------------------------------------------------------------------------");
        }
    }

    public static String timeConvert(int time) {
        if (time % 60 >= 10) {
            if (time / 60 % 12 == 0) {
                return (12 + time / 60 % 12) + ":" + time % 60;
            } else {
                return (time / 60 % 12) + ":" + time % 60;
            }
        } else {
            if (time / 60 % 12 == 0) {
                return (12 + time / 60 % 12) + ":" + "0" + time % 60;
            } else {
                return (time / 60 % 12) + ":" + "0" + time % 60;
            }
        }
    }

    public static int cityDisplay(String city) {
        int city_Named = 0;
        for (int i = 1; i <= total_city; i++) {
            if (object_city[i].getName().equals(city)) {
                city_Named = i;
            }
        }
        return city_Named;
    }
}

