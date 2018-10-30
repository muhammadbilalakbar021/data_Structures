import java.util.Scanner;
public class binaryConversion_Stack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int input_Value = input.nextInt();
        int remaainder = input_Value, quotient;
        int[] stack_Array = new int[input_Value / 2 + 1];
        int i = 0;

        while (remaainder != 1) {
            quotient = remaainder % 2;
            remaainder = remaainder / 2;

            stack_Array[i] = quotient;
            i++;
        }
        stack_Array[i] = remaainder;
        toString_Display(stack_Array);
    }

    public static void toString_Display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}