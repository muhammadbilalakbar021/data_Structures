import java.util.Scanner;
public class Replace
{
    public static void main(String[] args)
    {
        int[] data={1,2,3,4,5};
        Scanner input=new Scanner(System.in);
        int userInput=input.nextInt();
        int userIndex=input.nextInt();


        data[userInput]=userIndex;

        System.out.printf("Your value=%d at index %d",userInput,userIndex);
    }
}
