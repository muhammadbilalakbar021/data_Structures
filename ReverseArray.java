import  java.util.Scanner;
public class ReverseArray
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

            int[] data={1,2,3,4,5};
        int flag=data.length;
        int extra=flag/2;
        for(int i=0;i<extra;i++)
        {
            int swap=0;
            swap=data[i];
            data[i]=data[flag-1];
            data[flag-1]=swap;
            flag--;
        }

        for (int i=0;i<data.length;i++)
        {
                System.out.printf("Value of %d = %d%n",extra,data[i]);
         }
    }
}
