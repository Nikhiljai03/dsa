
import java.util.Arrays;

// class recursion {

//     // This code is a simple demonstration of recursion in Java.
//     // It defines a class with a static method that prints numbers from 1 to 3
//     // using recursion, and a main method to initiate the process.
//     // The count variable is used to keep track of how many times the print method has been
//     static int count = 0 ;
//     public static void print(){
//         if(count  ==  3){
//             return;
//         }
//         System.out.println(count);
//         count++;
//         print();
//         // The print method calls itself recursively until count reaches 2.
//     }
//     public static void main(String[] args) {
//         print();
//     }
// }


// this code is a simple Java program that demonstrates recursion by printing a message a specified number of times. 
// The user is prompted to enter a number, and the program prints "Nikhil Jai" that many times using a recursive method.

// import java.util.Scanner;
// class recursion{
//     public static void print(int i, int n){
//         if(i > n){
//             return;
//         }
//         System.out.println("Nikhil Jai");
//         print(i + 1, n);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println(("Enter a number : "));
//         int n = sc.nextInt();
//         print(1,n);
//     }
// }


// this code is a simple Java program that demonstrates recursion by printing numbers from 1 to a user-defined number.

// import java.util.Scanner;
// class recursion{
//     public static void print(int i , int n){
//         if(i > n){
//             return;
//         }
//         System.out.println(i);
//         print(i+1,n);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number : ");
//         int n = sc.nextInt();
//         print(1, n);
//     }
// }


// This code is a simple Java program that demonstrates recursion by printing numbers from a user-defined number N to 1.

// import java.util.Scanner;
// class recursion{
//     public static void print(int n, int i){
//         if(n < i){
//             return;
//         }
//         System.out.println(n);
//         print(n-1, i);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number : ");
//         int n = sc.nextInt();
//         print(n, 1);
//     }
// }


// This code is a simple Java program that demonstrates recursion by calculating the sum of numbers from 1 to a user-defined number N.

// import java.util.Scanner;
// class recursion{
//     public static int print(int i,int sum){
//         if(i < 1){ 
//             return sum;
//         }
//         sum += i;
//         return print(i - 1,sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number : ");
//         int n = sc.nextInt();
//         int r =print(n,0);
//         System.out.println(r);
//     }
// }


// This code is a simple Java program that demonstrates recursion by printing numbers from a user-defined number N to 1, but in reverse order.
// using backtracking to print the numbers in reverse order.

// import java.util.Scanner;
// class recursion{
//     public static void print(int i, int n){
//         if(i < 1){
//             return;
//         }
//         print(i - 1,n);
//         System.out.println(i);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number : ");
//         int n= sc.nextInt();
//         print(n, n);
//     }
// }


// This code is a simple Java program that demonstrates recursion by printing numbers from 1 to a user-defined number N in reverse order.
// using backtracking to print the numbers in reverse order.

// import java.util.Scanner;
// class recursion{
//     public static void print(int i, int n){
//         if(i > n){
//             return;
//         }
//         print(i + 1,n);
//         System.out.println(i);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number : ");
//         int n= sc.nextInt();
//         print(1, n);
//     }
// }


// this code is a simple Java program that demonstrates recursion by calculating the sum of numbers from 1 to a user-defined number N. 
// class recursion{

//     public static int print(int n){
//     if(n ==0){
//         return 0;
//     }
//     return n + print(n - 1);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(print(n));
//     }
// }


// // This code is a simple Java program that demonstrates recursion by calculating the factorial of a user-defined number N.

// class recursion{

//     public static int factorial(int n){
//         if(n == 1){
//             return 1;
//         }
//         return n * factorial(n - 1);
//     }
//     public static void main(String[] args) {
//         int n = 4;
//         System.out.println(factorial(n));
//     }
// }


// This code is a simple Java program that demonstrates recursion by reversing an array.

// class recursion{

//     public static int[] reverse(int arr[] , int l, int r){
//         if(l >= r){
//             return new int[arr.length];
//         }
//         int temp = arr[l];
//         arr[l] = arr[r];
//         arr[r] = temp;
//         reverse(arr, l + 1, r - 1);
//         return arr;

//     }
//     public static void main(String[] args) {
//         int [] arr = {1, 2, 3, 4, 5};
//         int n = arr.length;
//         System.out.println(Arrays.toString(reverse(arr, 0,n -1)));
//     }
// }







































// public class recursion {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] nums = {3, 1, 4, 4, 5, 2};
//         System.out.println("The second largest element is: " + sol.secondLargestElement(nums));
//     }
// }
// class Solution {
//     public int secondLargestElement(int[] nums) {
//         int sec = Integer.MIN_VALUE;
//         int m = max(nums);

//         for(int  i= 0; i < nums.length;i++){
//             if(nums[i] != m && nums[i] > sec){
//                 sec = nums[i];
//             }
//         }
//         if(sec == Integer.MIN_VALUE){
//             return -1;
//         }
//         return sec;
//     }
//     public int max(int [] nums){
//         int max = Integer.MIN_VALUE;
//         for(int  i = 0; i < nums.length; i++){
//             if(nums[i] > max){
//                 max = nums[i];
//             }
//         }
//         return max;
//     }
// }

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

// class recursion{
//     public static void main(String[] args) {
//         int n = 36;
//         List<Integer> divisors = new ArrayList<>();
//         for(int  i = 1; i < Math.sqrt(n); i++){
//             if(n % i == 0){
//                 divisors.add(i);
//                 if(i != n / i) {
//                     divisors.add(n / i);
//                 }   
//             }
//         }
        
//        Collections.sort(divisors);
//         for(int i = 0; i < divisors.size(); i++) {
//             System.out.print(divisors.get(i) + " ");
//         }
// }
// }
// import java.util.Scanner;
// class recursion {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int count= 0;
//         boolean isPrime = true;
//         System.out.println("Enter a number to check if it is prime:");
//         int n = sc.nextInt();
//         for(int i = 2;i <= Math.sqrt(n);i++){
//             if(n % i==0){
//                 isPrime =  false;
//                 break;
//             }
//         }
//         if(isPrime && n > 1){
//             System.out.println("prime");
//         }
//         else{
//             System.out.println("not prime");
//         }
//     }
// }

// class recursion {
//     public static void main(String[] args) {
//         System.out.println(gcd(20, 40));
//     }
//     public static int gcd(int n1, int n2){
//         while(n1 !=0 && n2 != 0){
//             if(n1 > n2){
//                 n1 = n1 % n2;
//             } else {
//                 n2 = n2 % n1;
//             }
//         }
//         if(n1 == 0){
//             return n2;
//         } else {
//             return n1;
//         }
//     }
// }