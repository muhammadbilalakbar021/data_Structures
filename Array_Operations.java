public class Array_Operations
{
    int number;
    public Array_Operations(int number)
    {
        this.number=number;
    }

    int[] array=new int[this.number];

    public void insert(int key,int index)
    {
        for(int i=array.length-1;i>index;i--)
        {
            array[i]=array[i-1];
        }
        array[index]=key;
    }

    public void delete(int key,int index)
    {
        for(int i=index;i<array.length-1;i++)
        {
            array[i]=array[i+1];
        }
        array[array.length-1]=0;

        for(int i=0;i<array.length;i++)
        {
            System.out.printf("%d",array[i]);
        }
    }

    public void insert_at_Index(int[] array, int key,int index)
    {
        array[index]=key;
    }

    public void insert_after_Value(int[] array, int key,int index)
    {
        for(int i=array.length-1;i>index;i--)
        {
            array[i]=array[i-1];
        }
        array[index]=key;
    }

    public void bubbleSort(int[] array)
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

    }

    public void SelectionSort(int[] array)
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
    }

    public void insertionSort(int[] array) {
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

    }

    public void modifiedBubble_Sort(int[] array) {
        int flag = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }

        }
    }

    public String toString()
    {

        return null;
    }
}