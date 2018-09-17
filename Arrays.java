public class Arrays
{
    public static void main(String[] args)
    {


        int[] frequency=new int[10];
        int flag=0;

       int data[] ={1,2,2,3,3,4,5,6,6,6};

        for (int i=0;i<data.length;i++)
        {
            flag=data[i];
            frequency[flag]++;

        }

        for (int i=0;i<data.length;i++)
        {
            if (frequency[i]==0)
            {

            }
            else
            {
                System.out.printf("Value of %d = %d%n",i,frequency[i]);
            }

        }
    }
}
