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
        int time1=-1;
        int time2=-1;
        int time3=-1;
        int city_time1=-1;
        int city_time2=-1;
        int city_time3=-1;
        int hello=0;

        while ((line = bufferedReader.readLine()) != null) {
            FCITqueue queue1 = new FCITqueue();
            FCITqueue queue2 = new FCITqueue();
            FCITqueue queue3 = new FCITqueue();
            FCITbookingStack fciTbookingStack=new FCITbookingStack();


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
            for (int i=0;i<=700; i++)
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
                                    System.out.println(timeConvert(i) + "PM: " + fciTmember.getFirstName()+" "+fciTmember.getLastName() + " arrived at the FCIT Travel Agency and entered Reservations Line 2.");

                                }
                            }
                        } else if (queue3.getFlag() < queue2.getFlag()) {
                            if (!fciTqueue.empty()) {
                                fciTmember = fciTqueue.pop();
                                if (fciTmember != null) {
                                    queue3.push(fciTmember.getFirstName(), fciTmember.getLastName(), fciTmember.getUniversityID(), fciTmember.getDestinationCity(), fciTmember.getNumSeats(), fciTmember.getEnterTime());
                                    System.out.println(timeConvert(i) + "PM: " + fciTmember.getFirstName() +" "+fciTmember.getLastName()+ " arrived at the FCIT Travel Agency and entered Reservations Line 3.");
                                }
                            }
                        } else if (queue1.getFlag() == queue2.getFlag()) {

                            if (!fciTqueue.empty())
                            {
                                fciTmember = fciTqueue.pop();
                                queue1.push(fciTmember.getFirstName(), fciTmember.getLastName(), fciTmember.getUniversityID(), fciTmember.getDestinationCity(), fciTmember.getNumSeats(), fciTmember.getEnterTime());
                                System.out.println(timeConvert(i) + "PM: " + fciTmember.getFirstName() +" "+fciTmember.getLastName()+ " arrived at the FCIT Travel Agency and entered Reservations Line 1.");
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
                       System.out.println(timeConvert(i+1) +"PM: "+queue1.front.getFirstName() + " " +queue1.front.getLastName()+" is at the front of Reservations Line 1 and is now beginning the booking.");
                       if (queue1.front.seat_Reserved()==false)
                       {
                           if (object_city[cityDisplay(queue1.front.getDestinationCity())]!=null)
                           {
                               if(object_city[cityDisplay(queue1.front.getDestinationCity())].seatAvailabiltiy(queue1.front.getNumSeats()))
                               {
                                   object_city[cityDisplay(queue1.front.getDestinationCity())].reserveSeats(queue1.front.getNumSeats());
                                   time1=(queue1.front.getNumSeats()*2)+(i);
                                   queue1.front.seats=true;
                               }
                               else
                               {
                               }
                           }
                           else
                           {
//                               System.out.println(timeConvert(i+1) +"PM: "+queue1.front.getFirstName()+ " " +queue1.front.getLastName()+" is leaving the FCIT Travel Agency because no seats are available for the " +
//                                       "requested flight.");
                               city_time1=i+2;

                           }
                       }
                   }
                   if (city_time1==i)
                   {
                       System.out.println(timeConvert(i) +"PM: "+queue1.front.getFirstName()+ " " +queue1.front.getLastName()+" is leaving the FCIT Travel Agency because no seats are available for the " +
                               "requested flight.");
                       if (queue1.front.seat_Reserved()==false)
                       {
                           queue1.pop();
                       }
                   }
                   if(time1==i)
                   {
                       System.out.println(timeConvert(i+1) +"PM: "+queue1.front.getFirstName()+ " " +queue1.front.getLastName()+" has finished the booking and is now exiting Reservations Line 1.");
                       fciTbookingStack.push(queue1.front.getFirstName(),queue1.front.getLastName());
                       queue1.pop();
                       if (queue1.front!=null)
                       {
                           i=queue1.front.getEnterTime()-1;
                       }
                   }
               }
               if(!queue2.empty())
               {
                   if (queue2.front.getEnterTime()==i)
                   {
                       System.out.println(timeConvert(i+1) +"PM: "+queue2.front.getFirstName()+ " " +queue2.front.getLastName()+" is at the front of Reservations Line 2 and is now beginning the booking.");
                       if (queue2.front.seat_Reserved()==false)
                       {
                           if (object_city[cityDisplay(queue2.front.getDestinationCity())]!=null)
                           {
                               if(object_city[cityDisplay(queue2.front.getDestinationCity())].seatAvailabiltiy(queue2.front.getNumSeats()))
                               {
                                   object_city[cityDisplay(queue2.front.getDestinationCity())].reserveSeats(queue2.front.getNumSeats());
                                   time2=(queue2.front.getNumSeats()*2)+(i);
                                   queue2.front.seats=true;
                               }
                               else
                               {
                                   city_time2=i+2;
                               }
                           }
                           else
                           {
//                               System.out.println(timeConvert(i+1) +"PM: "+queue2.front.getFirstName()+ " " +queue2.front.getLastName()+" is leaving the FCIT Travel Agency because no seats are available for the " +
//                                       "requested flight.");
                               if (queue2.front.seat_Reserved()==false)
                               {
                                   city_time2=i+2;
                               }
                           }
                       }
                   }
                   if(city_time2==i)
                   {
                       System.out.println(timeConvert(i) +"PM: "+queue2.front.getFirstName()+ " " +queue2.front.getLastName()+" is leaving the FCIT Travel Agency because no seats are available for the " +
                               "requested flight.");
                       queue2.pop();
                   }
                   if (time2==i)
                   {
                       System.out.println(timeConvert(i+1) +"PM: "+queue2.front.getFirstName()+ " " +queue2.front.getLastName()+" has finished the booking and is now exiting Reservations Line 2.");
                       fciTbookingStack.push(queue2.front.getFirstName(),queue2.front.getLastName());
                       queue2.pop();
                       if (queue2.front!=null)
                       {
                           i=queue2.front.getEnterTime()-1;
                       }
                   }
               }
               if(!queue3.empty())
               {
                   if (queue3.front.getEnterTime()==i)
                   {
                       if (queue3.front.seat_Reserved()==false)
                       {
                           System.out.println(timeConvert(i+1) +"PM: "+queue3.front.getFirstName()+ " " +queue3.front.getLastName()+" is at the front of Reservations Line 3 and is now beginning the booking.");
                           if (object_city[cityDisplay(queue3.front.getDestinationCity())]!=null)
                           {
                               if(object_city[cityDisplay(queue3.front.getDestinationCity())].seatAvailabiltiy(queue3.front.getNumSeats()))
                               {
                                   object_city[cityDisplay(queue3.front.getDestinationCity())].reserveSeats(queue3.front.getNumSeats());
                                   time3=(queue3.front.getNumSeats()*2)+(i);
                                   queue3.front.seats=true;
                               }
                               else
                               {
                                   city_time3=i+2;
                               }
                           }
                           else
                           {
                               city_time3=i+2;
                           }
                       }
                   }
                   if(city_time3==i)
                   {
                       System.out.println(timeConvert(i) +"PM: "+queue3.front.getFirstName()+ " " +queue3.front.getLastName()+" is leaving the FCIT Travel Agency because no seats are available for the " +
                               "requested flight.");
                       if (queue3.front.seat_Reserved()==false)
                       {
                           queue3.pop();
                       }
                   }


                   if (time3==i)
                   {
                       System.out.println(timeConvert(i+1) +"PM: "+queue3.front.getFirstName()+ " " +queue3.front.getLastName()+" has finished the booking and is now exiting Reservations Line 3.");
                       fciTbookingStack.push(queue3.front.getFirstName(),queue3.front.getLastName());
                       queue3.pop();
                       if (queue3.front!=null)
                       {
                           i=queue3.front.getEnterTime();
                       }

                   }
               }

            }

            while (!fciTbookingStack.empty())
            {
//                if (!fciTbookingStack.empty())
                {
                    System.out.println(fciTbookingStack.getFirstname() +" " + fciTbookingStack.getLastName());
                    fciTbookingStack.pop();
                }
            }
            System.out.println("--------------------------------------------------------------------------------------------------------");
        }
    }

    public static String timeConvert(int time) {
        if(time%60>=10)
        {
            if(time/60%12==0)
            {
                return (12 + time / 60 % 12) + ":" + time % 60;
            }
            else
            {
                return ( time / 60 % 12) + ":" + time % 60;
            }
        }
        else
        {
            return (12 + time / 60 % 12) + ":" +"0"+ time % 60;
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

