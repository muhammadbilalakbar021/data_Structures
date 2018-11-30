public class binary_Converter {
    public static void main(String[] args) {
        int i = 0;
        int number = 50;
        int[] array = new int[20];

        while (number != 1 || number != 0) {
            int n = number % 2;
            number = number / 2;
            array[i] = n;
            i++;
            if(number ==0)
            {
                break;
            }
        }

       for(int count=0;count<i;count++)
       {
           System.out.println(array[count]);
       }
    }
}
