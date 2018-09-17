public class array_Functions implements Array_List
{
    public array_Functions()
    {

    }

    @Override
    public int bubble_Sort(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length;j++)
            {
                if(array[i]<array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return 1;
    }

    @Override
    public int insertion_Sort(int[] array)
    {
        for(int i=1;i<array.length;i++)
        {
            int temp_Var=array[i];
            int j=i-1;
            while(temp_Var<array[j] && j>0)
            {

                array[j+1]=array[j];
                j--;

            }
            array[j+1]=temp_Var;
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.printf("%d%n",array[i]);
        }
        return 1;
    }

    @Override
    public int selection_Sort(int[] array)
    {
        int min_Index;
        for(int i=0;i<array.length;i++)
        {
            min_Index=i;
            for(int j=i;j<array.length;j++)
            {
                if(array[j]<array[min_Index])
                {
                    min_Index=j;

                }
            }
            int temp=array[min_Index];
            array[min_Index]=array[i];
            array[i]=temp;
        }

        for(int i=0;i<array.length;i++)
        {
            System.out.printf("%d%n",array[i]);
        }
        return 1;
    }

    @Override
    public int modifiedBubble_Sort(int[] array)
    {
        int flag=0;
        for(int i=0;i<array.length;i++)
        {

                for(int j=0;j<array.length;j++)
                {
                    if(array[i]<array[j])
                    {
                        int temp=array[i];
                        array[i]=array[j];
                        array[j]=temp;
                        flag=1;
                    }
                }
            if(flag==0)
            {
                break;
            }

        }
        for(int i=0;i<array.length;i++)
        {
            System.out.printf("%d%n",array[i]);
        }
        return 1;
    }

}
