public class Fibonacci_Series
{
    public static void main(String[] args)
    {
        int max_No=100;
        int previous_Number=0;
        int next_number=1;


        int[] series_Array=new int[50];
        int loop=series_Array.length-1;

        while (next_number<100)
        {
            series_Array[loop]=next_number;
            loop--;
            int temp=previous_Number;
            previous_Number=next_number;
            next_number=next_number+temp;
        }

        for(int i :series_Array)
        {
            if(i!=0)
            {
                System.out.println(i);
            }
        }
    }
}
