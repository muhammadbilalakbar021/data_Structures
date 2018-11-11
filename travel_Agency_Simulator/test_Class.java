package travel_Agency_Simulator;
import java.io.*;

public class test_Class
{
    public static city[] object_city=new city[10];
    public static int total_city=0;


    public static void main(String[] args) throws IOException
    {
        File file=new File("/home/bilalakbar/IdeaProjects/data_Structures/src/travel_Agency_Simulator/inputFile.txt");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line=null;
        int numbers=0;
        int loop_flag;
        String [] tokens;

        FCITqueue queue1=new FCITqueue();
        FCITqueue queue2=new FCITqueue();
        FCITqueue queue3=new FCITqueue();

        FCITqueue fciTqueue=new FCITqueue();
        FCITmember fciTmember=new FCITmember();

        FCITmember outsideLIne=new FCITmember();



        while ((line=bufferedReader.readLine())!=null)
//        line=bufferedReader.readLine();
        {
            numbers=Integer.parseInt(line);
            total_city=numbers;
            for(int i=1;i<=numbers;i++)
            {
                line=bufferedReader.readLine();
                tokens = line.split("\\s+");
                String var_1 = tokens[0];
                int var_2 = Integer.parseInt(tokens[1]);
                object_city[i]=new city(var_1,var_2);
//                object_city[i].display();
            }
            line=bufferedReader.readLine();
            numbers=Integer.parseInt(line);
            System.out.println("Total numbers : " + numbers);
            loop_flag=numbers;
            for(int i=0;i<numbers;i++)
            {
                line=bufferedReader.readLine();
                tokens = line.split("\\s+");
                int var_1 = Integer.parseInt(tokens[0]);
                int var_2 = Integer.parseInt(tokens[1]);
                String var_3 = tokens[2];
                String var_4 = tokens[3];
                String var_5 = tokens[4];
                int var_6 = Integer.parseInt(tokens[5]);

                fciTqueue.push(var_3,var_4,var_2,var_5,var_6,var_1);
            }
//            fciTqueue.display();
            System.out.println("starting time of loop " + fciTqueue.getFlag());
            System.out.println("Ending time of loop " + (fciTqueue.back.getEnterTime()+((fciTqueue.back.getNumSeats()*2)+1)));

//            for (int i=fciTqueue.front.getEnterTime();i<=fciTqueue.back.getEnterTime()+((fciTqueue.back.getNumSeats()*2)+1);i++)
            for (int i=1;i<=fciTqueue.getFlag();i++)
            {
//                if(i==fciTqueue.time())
                {
//                    System.out.println("///////////////////////////////////////////////////////");
//                    System.out.println(i);
//                    System.out.println("///////////////////////////////////////////////////////");
                    if(queue1.empty())
                    {
                        fciTmember =fciTqueue.pop();
                        queue1.push(fciTmember.getFirstName(),fciTmember.getLastName(),fciTmember.getUniversityID(),fciTmember.getDestinationCity(),fciTmember.getNumSeats(),fciTmember.getEnterTime());
//                        queue1.display();
//                        System.out.println(fciTmember.getFirstName()+ " Arrival time is " +timeConvert(i));
//                        System.out.println(object_city[cityDisplay(fciTmember.getDestinationCity())].name);
//                        System.out.println(object_city[cityDisplay(fciTmember.getDestinationCity())].getRows());
//                        System.out.println("================");
                    }
                    else if(queue2.empty())
                    {
                        fciTmember =fciTqueue.pop();
                        queue2.push(fciTmember.getFirstName(),fciTmember.getLastName(),fciTmember.getUniversityID(),fciTmember.getDestinationCity(),fciTmember.getNumSeats(),fciTmember.getEnterTime());
//                        queue2.display();
//                        System.out.println(fciTmember.getFirstName()+ " Arrival time is " +timeConvert(i));
//                        System.out.println("================");
                    }
                    else if(queue3.empty())
                    {
                        fciTmember =fciTqueue.pop();
                        queue3.push(fciTmember.getFirstName(),fciTmember.getLastName(),fciTmember.getUniversityID(),fciTmember.getDestinationCity(),fciTmember.getNumSeats(),fciTmember.getEnterTime());
//                        queue3.display();
//                        System.out.println(fciTmember.getFirstName()+ " Arrival time is " +timeConvert(i));
//                        System.out.println("================");
                    }

                    else if(queue2.getFlag()<queue1.getFlag())
                    {
                        if(!fciTqueue.empty())
                        {

                            fciTmember =fciTqueue.pop();

                            if (fciTmember!=null)
                            {
                                queue2.push(fciTmember.getFirstName(),fciTmember.getLastName(),fciTmember.getUniversityID(),fciTmember.getDestinationCity(),fciTmember.getNumSeats(),fciTmember.getEnterTime());

//                                queue2.display();
//                                System.out.println("Queue 2");
//                                System.out.println(fciTmember.getFirstName()+ " Arrival time is " +timeConvert(i));
//                                System.out.println("================");
                                System.out.println("queue 2 flag" + queue2.getFlag() +" and  queue 3" + queue2.getFlag());
                            }
                        }
                    }
                    else if(queue3.getFlag()<queue2.getFlag())
                    {
                        if(!fciTqueue.empty())
                        {
                            fciTmember =fciTqueue.pop();
                            if (fciTmember!=null)
                            {
                                queue3.push(fciTmember.getFirstName(),fciTmember.getLastName(),fciTmember.getUniversityID(),fciTmember.getDestinationCity(),fciTmember.getNumSeats(),fciTmember.getEnterTime());
                                System.out.println("queu3 hello");
//                                queue3.display();
//                                System.out.println("Queue 3");
//                                System.out.println(fciTmember.getFirstName()+ " Arrival time is " +timeConvert(i));
//                                System.out.println("================");
                            }
                        }
                    }
                    else if(queue1.getFlag()==queue2.getFlag())
                    {

                        if(!fciTqueue.empty())
                        {
                            fciTmember =fciTqueue.pop();
                            queue1.push(fciTmember.getFirstName(),fciTmember.getLastName(),fciTmember.getUniversityID(),fciTmember.getDestinationCity(),fciTmember.getNumSeats(),fciTmember.getEnterTime());
//                            queue1.display();
//                            System.out.println(fciTmember.getFirstName()+ " Arrival time is " +timeConvert(i));
//                            System.out.println("================");
                        }
                        System.out.println("queue 1 flag" + queue1.getFlag() +" and " + queue2.getFlag());
                    }

//                    if(!fciTqueue.empty())
//                    {
//                        System.out.println("Error");
//                        if (fciTqueue.front.getEnterTime()==i)
//                        {
//
//                            i--;
//                        }
//                    }
//                    System.out.println("///////////////////////////////////////////////////////");
//                    System.out.println(i);
//                    System.out.println("///////////////////////////////////////////////////////");
                }

            }
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Queue 1");
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            queue1.display();
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Queue 2");
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            queue2.display();
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Queue 3");
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            queue3.display();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!    DAY 1   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            fciTqueue.display();

            queue1.FCITqueuesetnull();
            queue2.FCITqueuesetnull();
            queue3.FCITqueuesetnull();
            fciTqueue.FCITqueuesetnull();
        }
    }
    public static String timeConvert(int time)
    {
        return (12+time/60%24) + ":" + time%60;
    }

    public static int cityDisplay(String city)
    {
        int city_Named = 0;
        for (int i=1;i<=total_city;i++)
        {
            if (object_city[i].getName().equals(city))
            {
                city_Named=i;
            }
        }
        return city_Named;
    }
}



