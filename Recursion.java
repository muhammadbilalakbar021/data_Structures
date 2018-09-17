public class Recursion
{
    public static void main(String[] args)
    {
        int[] binary_Array={1,2,3,4,5};
        int lenght_ofArray=binary_Array.length;
        int counter_Value=(lenght_ofArray/2)+1;
        int user_Value=1;

        if(user_Value<binary_Array[counter_Value])
        {
            System.out.println("1");
            binary_Function(binary_Array,0,counter_Value-1,user_Value);

        }
        else if(user_Value>binary_Array[counter_Value])
        {
            System.out.println("2");
            binary_Function(binary_Array,counter_Value+1,lenght_ofArray-1,user_Value);


        }
        else
        {
            System.out.println("2");
        }
    }
    public static void binary_Function(int[] to_Search,int count_Value,int loop_Value,int user_Value)
    {
        int lenght_ofArray=to_Search.length;
        int counter_Value=(loop_Value/2)+1;

        if(counter_Value==1)
        {
            System.out.println("counter 1");
        }
        else
        {
            if(user_Value<to_Search[counter_Value])
            {
                System.out.println(counter_Value);
                System.out.println("1");
                binary_Function(to_Search,0,counter_Value,user_Value);

            }
            else if(user_Value>to_Search[counter_Value])
            {
                System.out.println("2");
                binary_Function(to_Search,counter_Value,lenght_ofArray,user_Value);


            }
            else
            {
                System.out.println("2");
            }
        }



    }
}
