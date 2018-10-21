import java.util.Scanner;
public class test_Functions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How do you want to implement the list ??");
        System.out.println("1. ArrayADT");
        System.out.println("2. Linked List");
        System.out.println("3. Doubly Linked List  ");

        int user_Input = input.nextInt();

        switch (user_Input) {
            case 1: {
                System.out.println("How many Elements do you want in the Array");
                user_Input = input.nextInt();
                int[] array = new int[user_Input];
                Array_Operations array_operations = new Array_Operations();
                System.out.printf("An Array of %d elements have been created");
                System.out.printf("What operation do you want to do on array%n" +
                        "1. Insert%n" +
                        "2. Delete%n" +
                        "3. Insert at Index%n" +
                        "4. Insert after value%n" +
                        "5. Search%n" +
                        "6. Sort (Insertion Sort)%n" +
                        "7. Bubble Sort%n" +
                        "8. Modified Bubble Sort%n" +
                        "9. Print%n" +
                        "0. Exit%n");
                user_Input = input.nextInt();
                int input1, input2;
                while (user_Input != 0) {
                    switch (user_Input) {
                        case 1: {
                            System.out.println("Enter the number you want to enter");
                            input1 = input.nextInt();
                            System.out.println("Enter the index where you want to enter");
                            input2 = input.nextInt();
                            array_operations.insert(array, input1, input2);
                        }
                        case 2: {
                            System.out.println("Enter the number you want to delete");
                            input1 = input.nextInt();
                            System.out.println("Enter the index where you want to delete");
                            input2 = input.nextInt();
                            array_operations.delete(array, input1, input2);
                        }
                        case 3: {
                            System.out.println("Enter the number you want to enter");
                            input1 = input.nextInt();
                            System.out.println("Enter the index where you want to replace");
                            input2 = input.nextInt();
                            array_operations.insert_at_Index(array, input1, input2);
                        }
                        case 4: {
                            System.out.println("Enter the number you want to enter");
                            input1 = input.nextInt();
                            System.out.println("Enter the value after you want to enter ?");
                            input2 = input.nextInt();
                            array_operations.insert_after_Value(array, input1, input2);
                        }
                        case 5: {
                            System.out.println("Enter the number you want to Search ?");
                            input1 = input.nextInt();
                            array_operations.search(array, input1);
                        }
                        case 6: {
                            array_operations.insertionSort(array);
                        }
                        case 7: {
                            array_operations.bubbleSort(array);
                        }
                        case 8: {
                            array_operations.modifiedBubble_Sort(array);
                        }
                        case 9: {

                        }
                        case 0: {
                            break;
                        }
                        default: {
                            System.out.println("YOu entered wrong number !");
                        }
                    }
                }

            }
            case 2: {
                System.out.println("A singly linked list with 0 elements has been created.");
//                user_Input = input.nextInt();
                linked_LIst linked_lIst=new linked_LIst();
                System.out.printf("What operation do you want to do on linked list%n" +
                        "1. Insert%n" +
                        "2. Delete%n" +
                        "3. Insert at Index%n" +
                        "4. Insert after value%n" +
                        "5. Search%n" +
                        "6. Sort (Insertion Sort)%n" +
                        "7. Bubble Sort%n" +
                        "8. Modified Bubble Sort%n" +
                        "9. Print%n" +
                        "0. Exit%n");
                user_Input = input.nextInt();
                int input1, input2;
                while (user_Input != 0) {
                    switch (user_Input) {
                        case 1: {
                            System.out.println("Enter the number you want to enter");
                            input1 = input.nextInt();
                            linked_lIst.insertAtStart(input1);
                        }
                        case 2: {
                            System.out.println("Enter the location you want to delete");
                            input1 = input.nextInt();
                            linked_lIst.deleteAtLocation(input1);
                        }
                        case 3: {
                            System.out.println("Enter the number you want to enter");
                            input1 = input.nextInt();
                            System.out.println("Enter the location where you want to enter");
                            input2 = input.nextInt();
                            linked_lIst.insertAtLocation(input2,input1);
                        }
                        case 4: {
                            System.out.println("Enter the number you want to enter");
                            input1 = input.nextInt();
                            System.out.println("Enter the value after you want to enter ?");
                            input2 = input.nextInt();
                            linked_lIst.insertAfterValue(input2,input1);
                        }
                        case 5: {
                            System.out.println("Enter the number you want to Search ?");
                            input1 = input.nextInt();
                            linked_lIst.search(input1);

                        }
                        case 6:
                        {
                            linked_lIst.insertionSort();
                        }
                        case 7:
                            {
                                System.out.println("Bubble Sort in Progress");
                            }
                        case 8:
                            {
                                System.out.println("MOdified Bubble Sort in Progress");
                            }
                        case 9:
                            {
                                linked_lIst.display();
                            }
                        case 0:
                            {
                            break;
                            }
                        default:
                            {
                            System.out.println("YOu entered wrong number !");
                            }
                    }
                }

            }
            case 3:
                {
                    System.out.println("A doubly linked list with 0 elements has been created.");
//                user_Input = input.nextInt();
                    w_LinkLIST w_linkLIST=new w_LinkLIST();
                    System.out.printf("What operation do you want to do on linked list%n" +
                            "1. Insert%n" +
                            "2. Delete%n" +
                            "3. Insert at Index%n" +
                            "4. Insert after value%n" +
                            "5. Search%n" +
                            "6. Sort (Insertion Sort)%n" +
                            "7. Bubble Sort%n" +
                            "8. Modified Bubble Sort%n" +
                            "9. Print%n" +
                            "0. Exit%n");
                    user_Input = input.nextInt();
                    int input1, input2;
                    while (user_Input != 0) {
                        switch (user_Input) {
                            case 1: {
                                System.out.println("Enter the number you want to enter");
                                input1 = input.nextInt();
                                w_linkLIST.insertAtStart(input1);
                            }
                            case 2: {
                                System.out.println("Enter the location you want to delete");
                                input1 = input.nextInt();
                                w_linkLIST.deleteAtLocation(input1);
                            }
                            case 3: {
                                System.out.println("Enter the number you want to enter");
                                input1 = input.nextInt();
                                System.out.println("Enter the location where you want to enter");
                                input2 = input.nextInt();
                                w_linkLIST.insertAtLocation(input2,input1);
                            }
                            case 4: {
                                System.out.println("Enter the number you want to enter");
                                input1 = input.nextInt();
                                System.out.println("Enter the value after you want to enter ?");
                                input2 = input.nextInt();
                                w_linkLIST.insertAfterValue(input2,input1);
                            }
                            case 5: {
                                System.out.println("Enter the number you want to Search ?");
                                input1 = input.nextInt();
                                w_linkLIST.search(input1);

                            }
                            case 6:
                            {
                                w_linkLIST.insertion_Sort();
                            }
                            case 7:
                            {
                                w_linkLIST.bubble_Sort();
                            }
                            case 8:
                            {
                                w_linkLIST.modified_Sort();
                            }
                            case 9:
                            {
                                w_linkLIST.display();

                            }
                            case 0:
                            {
                                break;
                            }
                            default:
                            {
                                System.out.println("YOu entered wrong number !");
                            }
                        }
                    }

                }
            }
        }
    }

