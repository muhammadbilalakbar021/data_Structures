import java.util.Random;

public class array_Test
{
    public static void main(String[] args)
    {
        int[] random_Array=new int[100000];
        int[] reverse_Array=new int[100000];
        int[] sorted_Array=new int[100000];
        int counter=reverse_Array.length;

        Random random_Number=new Random();
        int value;

        for(int i=0;i<random_Array.length;i++)
        {
            value=random_Number.nextInt(100);
            random_Array[i]=value;
        }

        for(int i=0;i<reverse_Array.length;i++)
        {
            reverse_Array[i]=counter;
            counter--;
        }

        for(int i=0;i<sorted_Array.length;i++)
        {
            sorted_Array[i]=i+1;
        }


        array_Functions array= new array_Functions();
        long startTime = System.nanoTime();
        array.modifiedBubble_Sort(reverse_Array);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime)/1000000;
        System.out.printf("%d is time ",duration);
    }


}
