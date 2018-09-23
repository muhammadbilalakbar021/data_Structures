public class binary_Search
{
    public static void main(String[] args)
    {
        int[] tobe_Search={1,2,3,4,5,6,7,8,9,10};
        int key=10;
        int lower_Num=0;
        int max_Num=tobe_Search.length-1;

        binarySearch(tobe_Search,key,lower_Num,max_Num);
    }
    public static int binarySearch(int []binary,int key,int lower_Num,int max_Num)
    {
        int mid_Num=binary.length/2;

        while (lower_Num<=max_Num)
        {


            if(key>binary[mid_Num])
            {
                lower_Num=mid_Num+1;
                mid_Num=(max_Num+lower_Num)/2;

//                binarySearch(binary,key,lower_Num,max_Num);
            }
            else if (key<binary[mid_Num])
            {
                max_Num=mid_Num-1;
                mid_Num=(max_Num+mid_Num)/2;
//                binarySearch(binary,key,lower_Num,max_Num);
            }
            else if (key==binary[mid_Num])
            {
                System.out.printf("%d",mid_Num);
                break;
            }
            else
            {
                System.out.printf("Not Found");
                break;
            }
//            mid_Num=(lower_Num+max_Num)/2;
        }

        return 1;
    }
}
