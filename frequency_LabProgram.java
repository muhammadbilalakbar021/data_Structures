public class frequency_LabProgram
{
    public static void main(String[] args)
    {
        int[] frequency_Array={1,1,2,2,2,3,4,4,4,4,4,5,5,6,7,7,8};

        int[] max_Array=new int[9];

        for(int i=0;i<frequency_Array.length;i++)
        {
            max_Array[frequency_Array[i]]++;

        }

        for (int i=0;i<max_Array.length;i++)
        {
            System.out.printf("%d",max_Array[i]);
        }
    }
}
