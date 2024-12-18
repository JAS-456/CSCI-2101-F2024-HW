package HW5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPlayground {
    public static void main(String[] args) {
        System.out.println("HW5!");
        // Question 1
        // Write Java statements that do the following:
        // a) Declare an arrayList nums of 15 elements of type Integer.
        ArrayList<Integer> nums = new ArrayList<>(Collections.nCopies(15, 0));
        // b) Output the value of the tenth element of the arrayList nums.
        System.out.println(nums.get(9));
        // c) Set the value of the 5th element of the arrayList nums to 99.
        nums.set(4, 99);
        // d) set the value of the 13th element to 15
        nums.set(12, 15);
        // d) set the value of the 2nd element to 6
        nums.set(1, 6);
        // d) Set the value of the 9th element of the arrayList nums to the sum of the 13th
        // and 2nd elements of the arrayList nums.
        nums.set(8,nums.get(12)+ nums.get(1));
        

        // Question 2
        // a) create an arrayList of Strings that contain each day of the week.(starting
        // on monday)
        ArrayList<String> daysOfWeek = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        // b) output each of the days of the week
        for(String day : daysOfWeek) {System.out.println(day);}
        // c) output the days of the week that we have class
        System.out.println("Class days:");
        System.out.println(daysOfWeek.get(0)); 
        System.out.println(daysOfWeek.get(2));
        System.out.println(daysOfWeek.get(4));
        // d) change the arrayList to start on Sunday
        daysOfWeek.add(0, daysOfWeek.remove(6));

        // Question 3
        // a) create an ArrayList and prompt the user for numbers to add to it until the
        // number 0 is selected
        // b) return the largest and smallest number
        
        // c) return the ArrayList sorted smallest to largest
        // d) take that ArrayList see if its size is divisable by 3 and then output the
        // ArrayList in a matrix format
        // NOTE: make the matrix n X 3 so it can be n rows by 3 columns
        // EX. ArrayList [1,2,3,4,5,6,7,8,9]
        // 1 2 3
        // 4 5 6
        // 7 8 9
        // NOTE: If the ArrayList is NOT divisable by 3 ask the user for more numbers
        // and add them until it is
        // ArrayList Size: 7
        // Please enter 2 more numbers to create the matrix...
        //
        // Hint 1: use collections sort to sort the numbers
        // Hint 2: you can see if the size of the array list is divisible by 3 by
        // running:
        // numbers.size()%3==0
        // Hint 3: You can use this logic to print the array list in a 3x3 pattern once
        // its created:
        // for(int i=0;i<numbers.size();i++)
        // {
        // System.out.print(numbers.get(i)+" ");
        // if((i+1)%3==0)
        // {
        // System.out.println();
        // }
        // }
    
        import java.util.ArrayList;
        import java.util.Scanner;
        import java.util.Collections;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                ArrayList<Integer> numbers = new ArrayList<>();
                int num;
        
                System.out.println("Enter numbers (0 to stop):");
                while ((num = scanner.nextInt()) != 0) {
                numbers.add(num);
                }
                   
                
   //b)
    if (!numbers.isEmpty()) {
    int largest = Collections.max(numbers);
    int smallest = Collections.min(numbers);
    System.out.println("Largest number: " + largest);
    System.out.println("Smallest number: " + smallest);
       
     //c)
     Collections.sort(numbers);
     System.out.println("Sorted ArrayList: " + numbers);

                System.out.println("Sorted numbers:" + numbers);
                scanner.close();

    //d)
                if (numbers.size() % 3 == 0) {
                    System.out.println("Matrix format:");
                    for (int i = 0; i < numbers.size(); i++) {
                        System.out.print(numbers.get(i) + " ");
                        if ((i + 1) % 3 == 0) {
                            System.out.println();
                        }
                    }
                } else {
                    System.out.println("The size of the ArrayList is not divisible by 3.");
                }
        
                scanner.close();
            }
        }
    }
    

