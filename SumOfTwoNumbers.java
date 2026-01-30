public class SumOfTwoNumbers {
    
    public static void main(String[] args) {
        // Method 1: Using two hardcoded numbers
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        
        // Method 2: Using a method
        int result = addNumbers(15, 25);
        System.out.println("Sum using method: " + result);
    }
    
    // Method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}