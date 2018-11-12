package travel_Agency_Simulator;
import java.io.*;

public class test_Class {
    public static city[] object_city = new city[10];
    public static int total_city = 0;


    public static void main(String[] args) throws IOException {
        //File file=new File("/home/bilalakbar/IdeaProjects/data_Structures/src/travel_Agency_Simulator/inputFile.txt");
        File file = new File("E:\\intellij_Idea\\data_Structures\\src\\travel_Agency_Simulator/inputFile.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line = null;
        int numbers = 0;
        int loop_flag;
        String[] tokens;

        while ((line = bufferedReader.readLine()) != null) {
            FCITqueue queue1 = new FCITqueue();
            FCITqueue queue2 = new FCITqueue();
            FCITqueue queue3 = new FCITqueue();

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
            for (int i=0;i<=400; i++)
            {
                if(!fciTqueue.empty())
                {
                    if(fciTqueue.front.getEnterTime()==i)
                    {
                        if (queue2.getFlag() < queue1.getFlag()) {
                            if (!fciTqueue.empty()) {
                                fciTmember = fciTqueue.pop();

                                if (fciTmember != null) {
                                    queue2.push(fciTmember.getFirstName(), fciTmember.getLastName(), fciTmember.getUniversityID(), fciTmember.getDestinationCity(), fciTmember.getNumSeats(), fciTmember.getEnterTime());
                                    System.out.println(timeConvert(i) + "PM:  " + fciTmember.getFirstName() + " arrived at the FCIT Travel Agency and entered Reservations Line 2.");

                                }
                            }
                        } else if (queue3.getFlag() < queue2.getFlag()) {
                            if (!fciTqueue.empty()) {
                                fciTmember = fciTqueue.pop();
                                if (fciTmember != null) {
                                    queue3.push(fciTmember.getFirstName(), fciTmember.getLastName(), fciTmember.getUniversityID(), fciTmember.getDestinationCity(), fciTmember.getNumSeats(), fciTmember.getEnterTime());
                                    System.out.println(timeConvert(i) + "PM:  " + fciTmember.getFirstName() + " arrived at the FCIT Travel Agency and entered Reservations Line 3.");
                                }
                            }
                        } else if (queue1.getFlag() == queue2.getFlag()) {

                            if (!fciTqueue.empty()) {
                                fciTmember = fciTqueue.pop();
                                queue1.push(fciTmember.getFirstName(), fciTmember.getLastName(), fciTmember.getUniversityID(), fciTmember.getDestinationCity(), fciTmember.getNumSeats(), fciTmember.getEnterTime());
                                System.out.println(timeConvert(i) + "PM:  " + fciTmember.getFirstName() + " arrived at the FCIT Travel Agency and entered Reservations Line 1.");
                            }

                        }
                        if(fciTqueue.front!=null)
                        {
                            if(fciTqueue.front.getEnterTime()==i)
                            {
                              i--;
                            }
                        }
                    }
                }

               if(!queue1.empty())
               {
                   if(queue1.front.getEnterTime()==i)
                   {
                       System.out.println(timeConvert(i+1) +"PM: "+queue1.front.getFirstName()+" is at the front of Reservations Line 1 and is now beginning the booking.");
                       if (queue1.front.seat_Reserved()==false)
                       {
                           if (object_city[cityDisplay(queue1.front.getDestinationCity())]!=null)
                           {
                               if(object_city[cityDisplay(queue1.front.getDestinationCity())].seatAvailabiltiy(queue1.front.getNumSeats()))
                               {
                                   System.out.println(timeConvert(i+1+(queue1.front.getNumSeats()*2)) +"PM: "+queue1.front.getFirstName()+" has finished the booking and is now exiting Reservations Line 1.");
                                   queue1.front.seats=true;
                                   queue1.pop();
//                               if(queue1.front.next.getEnterTime()==i)
//                               {
//                                   i--;
//                               }
                               }
                           }
                           else
                           {
                               System.out.println(timeConvert(i+1) +"PM: "+queue1.front.getFirstName()+" is leaving the FCIT Travel Agency because no seats are available for the " +
                                       "requested flight.");
                           }
                       }
                   }
               }
               if(!queue2.empty())
               {
                   if (queue2.front.getEnterTime()==i)
                   {
                       System.out.println(timeConvert(i+1) +"PM: "+queue2.front.getFirstName()+" is at the front of Reservations Line 2 and is now beginning the booking.");
                       if (queue2.front.seat_Reserved()==false)
                       {
                           if (object_city[cityDisplay(queue2.front.getDestinationCity())]!=null)
                           {
                               if(object_city[cityDisplay(queue2.front.getDestinationCity())].seatAvailabiltiy(queue2.front.getNumSeats()))
                               {
                                   System.out.println(timeConvert(i+1+(queue2.front.getNumSeats()*2)) +"PM: "+queue2.front.getFirstName()+" has finished the booking and is now exiting Reservations Line 2.");
                                   queue2.front.seats=true;
                                   queue2.pop();
//                               if(queue1.front.next.getEnterTime()==i)
//                               {
//                                   i--;
//                               }
                               }
                           }
                           else
                           {
                               System.out.println(timeConvert(i+1) +"PM: "+queue2.front.getFirstName()+" is leaving the FCIT Travel Agency because no seats are available for the " +
                                       "requested flight.");
                           }
                       }
                   }
               }
               if(!queue3.empty())
               {
                   if (queue3.front.getEnterTime()==i)
                   {
                       System.out.println(timeConvert(i+1) +"PM: "+queue3.front.getFirstName()+" is at the front of Reservations Line 3 and is now beginning the booking.");
                       if (queue3.front.seat_Reserved()==false)
                       {
                           if (object_city[cityDisplay(queue3.front.getDestinationCity())]!=null)
                           {
                               if(object_city[cityDisplay(queue3.front.getDestinationCity())].seatAvailabiltiy(queue3.front.getNumSeats()))
                               {
                                   System.out.println(timeConvert(i+1+(queue3.front.getNumSeats()*2)) +"PM: "+queue3.front.getFirstName()+" has finished the booking and is now exiting Reservations Line 3.");
                                   queue3.front.seats=true;
                                   queue3.pop();
//                               if(queue1.front.next.getEnterTime()==i)
//                               {
//                                   i--;
//                               }
                               }
                           }
                           else
                           {
                               System.out.println(timeConvert(i+1) +"PM: "+queue3.front.getFirstName()+" is leaving the FCIT Travel Agency because no seats are available for the " +
                                       "requested flight.");
                           }
                       }
                   }
               }

            }
//            System.out.println("--------------------------------------------------------------------------------------------------------");
//            queue1.display();
//            queue2.display();
//            queue3.display();
            System.out.println("--------------------------------------------------------------------------------------------------------");


            queue1.FCITqueuesetnull();
            queue2.FCITqueuesetnull();
            queue3.FCITqueuesetnull();
            fciTqueue.FCITqueuesetnull();
        }
    }

    public static String timeConvert(int time) {
        return (12 + time / 60 % 12) + ":" + time % 60;
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

