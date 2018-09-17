import  java.util.Scanner;
public class InsertDelete
{
    public static void main()
    {
        int[] dataArray=new int[5];

        dataArray[0]=1;
        dataArray[1]=2;
        dataArray[3]=4;
        dataArray[4]=5;

        System.out.printf("For Insertion press 1");
        System.out.printf("For Delete press 2");

        Scanner input=new Scanner(System.in);
        int userValue=input.nextInt();

        int userIndex = 0;
        int indexValue=0;
        if(userValue==1)
        {
            System.out.printf("At which index you want to insert");
            int flag=input.nextInt();
            if(flag<0||flag>4)
            {
                System.out.printf("You Entered Wrong number ");
            }
            else
            {
                 userIndex =flag;
            }
            System.out.printf("Enter the value you want to enter");
            flag=input.nextInt();
            if(flag<0)
            {
                System.out.printf("You Entered negative number ");
            }
            else
            {
                 indexValue=flag;
            }

            for(int i=userIndex;i<dataArray.length;i++)
            {
                int swap=0;
                swap=dataArray[i+1];
                dataArray[i]=indexValue;


            }
        }
        else if (userValue==2)
        {
            System.out.printf("At which index you want to Delete");
            int flag=input.nextInt();
            if(flag<0||flag>4)
            {
                System.out.printf("You Entered Wrong number ");
            }
            else
            {
                 userIndex=flag;
            }
            System.out.printf("Enter the value you want to enter");
            flag=input.nextInt();
            if(flag<0)
            {
                System.out.printf("You Entered negative number ");
            }
            else
            {
                 indexValue=flag;
            }
        }
        else
        {
            System.out.printf("You pressed Nothing");
        }
    }
}
