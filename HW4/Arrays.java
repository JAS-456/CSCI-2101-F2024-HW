package HW4;

public class Arrays {

    // CONVERT THE SUMS METHOD FROM HW3 TO ADD EACH VALUE TO AN ARRAY AND THEN OUTPUT THE 
    // ARRAY AND THE TOTAL.
    // SEE HW3 FOR SUMS METHOD
    // Otherwise if you are using a regular array, assume the size is 10 total. 
    // EXAMPLE 
    // I will add up the numbers you give me....
    // Number: 12
    // The total so far is 12.
    // Number: 2
    // The total so far is 14.
    // Number: 3
    // The total so far is 17.
    // Number: 4
    // The total so far is 21.
    // Number: 1
    // The total so far is 22.
    // Number: 0
    // Total: 22
    // Array: {12,2,3,4,1,0}
    // Note: You can not use Arrays class to do this. You must use a regular array. No Arrays.stream
    public static void Arraysums(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] numbers = new int[10];
        int total = 0;
        int count = 0;
        
        System.out.println("I will add up the numbers you give me....");
        
        while (count < 10) {
            System.out.print("Number: ");
            int number = scanner.nextInt();
            numbers[count] = number;
            total += number;
            System.out.println("The total so far is " + total + ".");
            count++;
            if (number == 0) break; {    
            }
        } 
        
        System.out.println("Total: " + total);
        System.out.print("Array: {");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i]);
            if (i < count - 1) {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
    
    
    // Create a method that will brute force a password EX.
    // bruteForce("ZZZZ")
    // The program should then guess each char of the string and compare it to see if it is equal
    // to the index of the alphabet char array below
    // Output Example:
    // Z
    // ZZ
    // ZZZ
    // ZZZZ

    // Hint 1: using a char array for the password is helpful here 
    // Hint 2: using the method .toCharArray is a way to convert the password parameter to a char array as well
    // From there creating for and while loops to compare the values is trivial



    public static String bruteForce(String password){
        String answer = "";
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        '!', '@', '#', '$', '%', '^', '&', '*', '(', ')','<','>','/','?'};
    
        return answer; 

        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] passwordChars = password.toCharArray();
        char[] guess = new char[password.length()]; 
        for (int i = 0; i < password.length(); i++) {
        for (char c : alphabet) {
            guess[i] = c;
            System.out.println(new String(guess));
            if (guess[i] == passwordChars[i]) {
                break;
            }
            }
        }
    }

    public static void main(String[] args) {
        bruteForce("ZZZZ");
    }
}

   
    

   

    
    

    // Create a method that will sort an Array of integers from smallest to greatest.
    // NOTE: You CANNOT use the built in Arrays.sort method
    // Ex. 
    // sorter([9,10,2,5,3,4,7,8]) -> [2,3,4,5,7,8,9,10]

    // Hint 1: a temp Array is a helpful way to store variables for comparing 
    // Hint 2: 2 nested For loops should be all thats needed for the swapping logic
    public static int[] sorter(int[] nums){
        int [] sortedArray = new int[nums.length];
        return sortedArray;
       
        int n = nums.length;
        int[] sortedArray = new int[n];
    }



    public static void main(String[] args) {
        // Tester main method for your methods
       
        System.out.println("HW4!");
       
        System.out.print("Sorted array: ");
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
