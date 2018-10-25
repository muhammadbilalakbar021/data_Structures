import  java.util.Scanner;
public class Stack_Test
{
    public static void main(String[] args)
    {
        int input_var;
        Stack_Operations stack_operations=new Stack_Operations();
        System.out.println("How do you want to implement the stack ?");
        System.out.println("1. Arrays");
        System.out.println("2. Linked List");
        System.out.println("3. W Linked List");

        Scanner input=new Scanner(System.in);
        input_var=input.nextInt();

        switch (input_var)
        {
            case 1:
            {
                System.out.println("Which method you want to Perform ?");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                input_var=input.nextInt();
                break;
            }
            case 2:
            {
                input_var=input.nextInt();
                while (input_var!=0)
                {
                    System.out.println("Which method you want to Perform ?");
                    System.out.println("1. Push");
                    System.out.println("2. Pop");
                    input_var=input.nextInt();
                    if (input_var==1)
                    {
                        System.out.println("Enter a Value");
                        input_var=input.nextInt();
                        stack_operations.push(input_var);

                    }
                    else if(input_var==2)
                    {
                        stack_operations.pop();
                    }
                }

                break;
            }
            case 3:
            {
                input_var=input.nextInt();
                while (input_var!=0)
                {
                    System.out.println("Which method you want to Perform ?");
                    System.out.println("1. Push");
                    System.out.println("2. Pop");
                    input_var=input.nextInt();
                    if (input_var==1)
                    {
                        System.out.println("Enter a Value");
                        input_var=input.nextInt();
                        stack_operations.wlink_Push(input_var);

                    }
                    else if(input_var==2)
                    {
                        stack_operations.wlink_Pop();
                    }

                }
                break;
            }
            default:
            {
                System.out.println("You enter Wrong Choice");
            }
        }
    }
}
