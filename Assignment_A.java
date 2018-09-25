import java.util.Random;
import java.util.Scanner;

public class Assignment_A
{
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4, 8, 10, 9};
        int[] f_Array = {1, 1, 1,2, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6,6, 7,7, 8, 8};
        int key = 5;
        int index=5;
        int useri;

        functionMethods testing_Array = new functionMethods();


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

        Scanner input=new Scanner(System.in);
        System.out.println("For linearSearch press 1");
        System.out.println("For binarySearch press 2");
        System.out.println("For bubbleSort press 3");
        System.out.println("For SelectionSort press 4");
        System.out.println("For insertionSort press 5");
        System.out.println("For reversingArray press 6");
        System.out.println("For frequency press 7");
        System.out.println("For min_max_Value press 8");
        System.out.println("For insert press 9");
        System.out.println("For delete press 10");
        System.out.println("For tostring press 11");
        System.out.println("For return value press 12");
        useri=input.nextInt();

        if(useri==1)
        {
            testing_Array.linearSearch(array, key);
        }
        else if (useri==2)
        {
            testing_Array.binarySearch(array, key);

        }
        else if (useri==3)
        {
            testing_Array.bubbleSort(array);

        }
        else if (useri==4)
        {
            testing_Array.SelectionSort(array);

        }
        else if (useri==5)
        {
            testing_Array.insertionSort(array);

        }
        else if (useri==6)
        {
            testing_Array.reversingArray(array);

        }
        else if (useri==7)
        {
            testing_Array.frequency(f_Array);

        }
        else if (useri==8)
        {
            testing_Array.min_max_Value(array);

        }
        else if (useri==9)
        {
            testing_Array.insert(array,key,index);

        }
        else if (useri==10)
        {
            testing_Array.delete(array,key,index);
        }
        else if (useri==12)
        {
            System.out.printf("Your element at 4 index= %d",array[4]);
        }




//        long startTime = System.nanoTime();
//        testing_Array.modifiedBubble_Sort();
//        long endTime = System.nanoTime();
//        long duration = (endTime - startTime)/1000000;
//        System.out.printf("%d is time ",duration);
    }

}

    interface function
    {
        public void linearSearch(int []array,int key);
        public void binarySearch(int []array,int key);
        public void bubbleSort(int []array);
        public void SelectionSort(int []array);
        public void insertionSort(int []array);
        public void reversingArray(int []array);
        public void frequency(int []array);
        public void min_max_Value(int []array);
        public int bubble_Sort(int[] array);
        public int insertion_Sort(int[] array);
        public int selection_Sort(int[] array);
        public int modifiedBubble_Sort(int[] array);
        public void insert(int []array,int key,int index);
        public void delete(int []array,int key,int index);

    }

    class functionMethods implements function
    {

        @Override
        public void linearSearch(int[] array, int key)
        {
            for(int i=0;i<array.length;i++)
            {
                if(key==array[i])
                {
                    System.out.printf("Key found through linear serarh at index at %d and value is %d",i,array[i]);
                }
            }
            System.out.println();
        }

        @Override
        public void binarySearch(int[] a, int key)
        {
            int l=0,u=a.length-1,mid;

            while(l<u)
            {
                mid=(l+u)/2;
                if(key<a[mid]) {
                    u = mid - 1;
                }
                else if(key>a[mid])
                {
                    l=mid+1;
                }
                else
                {
                    System.out.printf("nm");
                    if(u==l)
                    {
                        System.out.printf("Key found through linear serarh at index at %d and value is %d",u,a[u]);

                    }
                    else
                    {
                        System.out.printf("Key not found");
                    }
                }

            }
        }

        @Override
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

        @Override
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

        @Override
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

        @Override
        public void reversingArray(int[] data) {
            int flag = data.length;
            int extra = flag / 2;
            for (int i = 0; i < extra; i++) {
                int swap = 0;
                swap = data[i];
                data[i] = data[flag - 1];
                data[flag - 1] = swap;
                flag--;

            }
        }

        @Override
        public void frequency(int[] frequency_Array)
        {
            int[] max_Array=new int[9];
            int max_f=0;

            for(int i=0;i<frequency_Array.length;i++)
            {
                max_Array[frequency_Array[i]]++;

            }
            for(int i=0;i<max_Array.length;i++)
            {
                if(max_Array[i]>max_Array[max_f])
                {
                    max_f=i;
                }

            }
            System.out.printf("maximum frequency is of %d",frequency_Array[max_f]);

        }

        @Override
        public void min_max_Value(int[] array)
        {
            int min_Flag=0;
            int max_Flag=0;
            for(int i=0;i<array.length;i++)
            {
                if(array[i]>array[max_Flag])
                {
                    max_Flag=i;
                }

                if(array[i]<array[min_Flag])
            {
                min_Flag=i;
            }
            }
            System.out.printf("max value=%d%n",array[max_Flag]);
            System.out.printf("min value=%d",array[min_Flag]);
        }

        @Override
        public String toString()
        {
            return String.format("");
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

        @Override
        public void insert(int[] array, int key,int index)
        {
            for(int i=array.length-1;i>index;i--)
            {
                array[i]=array[i-1];
            }
            array[index]=key;

            for(int i=0;i<array.length;i++)
            {
                System.out.printf("%d",array[i]);
            }
        }

        @Override
        public void delete(int[] array, int key,int index)
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

    }

