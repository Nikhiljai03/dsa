
    //     }
    //     for (int i=0; i < str.length();i++){
    //         if(str.charAt(i) == target){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // static long search(long[] arr, long target){
    //     if(arr.length == 0){
    //         return -1;
    //     }
    //     for(int i=0;i<arr.length;i++){
    //         long element = arr[i];
    //         if(element == target){
    //             System.out.println("found");
    //             return 1;
    //         }
    //     }
    //     return 0;
    // }


    // minimum element in an array and maximum element in an array

// class practice{
//     static int max(int[] arr){
//         int ans=arr[0];
//         for(int i =0;i<arr.length;i++){
//             if (arr[i]>ans){
//                 ans = arr[i];
//             }
//         }
//         return ans;

//     }
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7,8,9};
//         System.out.println(max(arr));
//     }
// }

// linear search in an array

// class practice{
// static int search(int[]arr,int target){
//     for(int i =0; i<arr.length;i++){
//         int element = arr[i];
//         if(element == target){
//             System.out.println("found");
//             return 1;
//         } 
//     }
//     System.out.println("not found");
//     return 0;

// }
// public static void main(String[] args) {
//     int[] arr = {1,2,3,4,5,6,7,8,9};
//     search(arr, 5);
// }
// }


//  taking input from the user and searching for the element in the array

// class practice{
    
//         static int min(int[] arr){
//         int ans=arr[0];
//         for(int i =0;i<arr.length;i++){
//             if (arr[i]<ans){
//                 ans = arr[i];
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[10];
//         System.out.println("Enter the elements of the array :");
//         for(int i =0;i<arr.length;i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("The elements of the array are :" + Arrays.toString(arr) );
//         System.out.println("the mimimum element in the array is : " + min(arr));
//     }
// }

// taking input for arr and printing the array

// class practice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[10];
//         for (int i = 0;i < arr.length;i++) {
//             arr[i] = sc.nextInt();
//         }
//         for(int i = 0; i<arr.length;i++){
//             System.out.println(Arrays.toString(arr));
//             break;
//         }
//     }
// }

// changing the array elements

// class practice{
//     static void changeArray(int[] arr){
//         arr[0] = 100;
//     }
//     public static void main(String[] args) {
//         int[] arr = {2,6,3,44,9};
//         System.out.println("Before calling the function : " + Arrays.toString(arr));
//         changeArray(arr);
//         System.out.println("after" + Arrays.toString(arr));
//     }
// }

// finding the character in the string

// class practice {
    
//     static boolean findChar(String str, char target){
//         if(str.length() == 0){
//             System.out.println("you cannot provide empty string");
//             return false;
//         }
//         for(int i =0; i< str.length();i++){
//             if(target==str.charAt(i)){
//                 System.out.println("the character found");
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         String name = "nikhil";
//         char target = 'k';
//         findChar(name,target);
//     }
// }

// finding an element in the particular range of the array

// class practice{
//     static int findElement(int[] arr, int target, int start, int end){
//         if (arr.length==0){
//             return -2;
//         }
//         for(int i =start; i<=end;i++){
//             if(arr[i]==target){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int[] arr ={2,6,88,55,44,66,99,55,6,5,6,55,55,66,55,5};
//         int result = findElement(arr, 100, 2, 11);
        
//         if(result == -2){
//             System.out.println("Array is empty");
//         }
//         else if(result == -1){
//             System.out.println("Element not found");
//         }
//         else{
//             System.out.println("Element found at index : " + result);

//         }
//     }
// }

// finding even numbers in the array

// class practice {
    
//     static int findEvenNumber(int[] nums){
//         int count = 0;
//         for(int num : nums){
//             if(isEven(num)){
//                 count++;
//             }
//         }
//         return count;
//     }
//     static boolean isEven(int num){
//         int numberOfDigits = digit(num);
//         if(numberOfDigits % 2 == 0){
//             return true;
//         }
//         return false;
//     }
    
//     static int digit(int num){
//         int count = 0;
//         while(num>0){
//             count++;
//             num = num / 10;
//         }
//         return count;
//     }

    
//     public static void main(String[] args) {
//         int[] nums = {100,5654,625,505,520,1230,113645,545664,554564};
//         System.out.println(findEvenNumber(nums));
// }
// }

// finding in 2d array

// class practice{

//     static boolean search(int[][] arr , int target){
//         for(int row = 0; row<arr.length; row++){
//             for(int clm= 0; clm<arr[row].length;clm++){
//                 if(arr[row][clm] == target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int[][] arr = {
//             {1,2,3},
//             {4,5,6},
//             {7,8,9}
//         };
//         int target = 99;
//         if(search(arr, target)){
//             System.out.println("Element found");
//         }
//         else{
//             System.out.println("Element not found");
//         }
//     }
// }

// finding in 2d array using enhanced for loop

// class  practice{
//     static boolean search(int[][] arr, int target){
//       if(arr.length == 0){
//         return false;
//       }
//       for(int[] row : arr){
//         for(int colm : row){
//             if(colm == target){
//                 return true;
//             }
//          }
//       }
//       return false;
//     }
    
//     public static void main(String[] args){
//       int[][] arr = {
//         {1,55,33},
//         {22,33,66},
//         {5,6,8}
//       };
//       int target = 69;
//       if(search(arr,target)){
//         System.out.println("the target found");
//       }
//       else{
//          System.out.println("the target you are finding dosn't found");
//       }
//     }
//     }

// finding even no of digits in the array with Math.log10

// class practice {
//     static int find(int[] arr){
//         int count = 0;
//         for(int num : arr){
//             if(isEven(num)){
//                 count++;
//             }
//         }
//         return count;
//     }
//     static boolean isEven(int num) {
//         if (num == 0) return true; 

//         int digits = (int) Math.log10(Math.abs(num)) + 1; // Use abs to handle negative numbers
//         return digits % 2 == 0; // Check if the digit count is even
//     }
//     public static void main(String[] args) {
//         int[] arr = {100,5654,625,505,520,1230,113645,545664,554564};
//         System.out.println(find(arr));
//     }
// }

// Leetcode problem 1672

// class Solution {
//     public int maximumWealth(int[][] accounts) {
//         int richest = 0;
//         for(int i = 0; i<accounts.length;i++){
//           int sum = 0;
//           for(int j = 0;j<accounts[i].length;j++){
//             sum += accounts[i][j];
//           }
//           if(sum>richest){
//             richest = sum;
//         }  
//         }
//         return richest;
//     }
// }

// reversing the array

// class practice {  
//     public static void main(String[] args) {
//         int[] randomArray = {12, 89, 34, 67, 23, 90, 45, 78, 56, 11, 3, 99, 50, 72, 6, 81, 38, 27, 92, 14, 65, 30, 18, 47, 83};

//       reverseArray(randomArray);
//   }
  
//   static void reverseArray(int[]arr){
//     int left = 0;
//     int right = arr.length-1;
//     while(left<right){
//       int temp = arr[left];
//       arr[left]= arr[right];
//       arr[right] = temp;
      
//       left ++;
//       right--;
//     }
//     System.out.println(Arrays.toString(arr));
//   }
// }

// binary seacrh in ascending order

// class practice{
//     static int binarySearch(int[] arr, int target){
//         int start = 0;
//         int end = arr.length-1;
//         while(start<end){
//             int mid = start+(end-start)/2;
//             if(target > arr[mid]){
//                 start = mid+1;
//             }
//             else if (target<arr[mid]){
//                 end = mid-1;
//             }
//             else return mid;
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7,8,9};
//         int target = 5;
//         System.out.println(binarySearch(arr, target));
//     }
// }

// binary search in descending order

// class practice{
//     static int binarySearch(int[] arr, int target){
//         int start = 0;
//         int end = arr.length-1;
//         while(start<=end){
//             int mid = start+(end-start)/2;
//             if(target>arr[mid]){
                // end = mid-1;    //this line changes in descending order
//             }
//             else if(target<arr[mid]){
//                 start = mid +1; //this line changes in descending order
//             }
//             else return mid;
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int[] arr = {9,8,7,6,5,4,3,2,1};
//         int target = 9;
//         System.out.println(binarySearch(arr, target));
//     }
// }

// Agnostic Binary Search(When we don't know the order of the array so it will work in both ascending and descending order)

// class practice {
//     static int binarySearch(int[] arr, int target) {
//         int start = 0;
//         int end = arr.length - 1;

//         boolean isAscending = arr[start] < arr[end];

//         while(start<= end){
//             int mid = start + (end - start) / 2;
//             if(arr[mid]==target){
//                 return mid;
//             }
//             if(isAscending){
//                 if(target < arr[mid]){
//                     end = mid-1;
//                 }
//                 else{
//                     start =mid + 1;
//                 }
//             }
//             else{
//                 if(target > arr[mid]){
//                     end = mid -1;
//                 }
//                 else start =mid+1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int[] arr = {9,8,7,6,5,4,3,2,1};
//         int target = 9;
//         System.out.println(binarySearch(arr, target));
//     }
// }

// import java.util.Arrays;

// class practice {
//     public static void main(String[] args) {
//        int [] arr = {8,96,5,99,5,625,63,96,862,52};
//         Arrays.sort(arr); //this can sort any random array in to ascending order
//         System.out.println(Arrays.toString(arr));
//     }
// }

// class practice {
//     static void multiplication(int n){
//         for(int i = 1;i<=10;i++){
//             System.out.printf("%d X %d = %d\n",n,i,n*i);
//         }
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         multiplication(n); 
//     }
// }

// class practice{

//     static double sum(double []arr){
//         double sum = 0;
//         for(int i = 0;i<arr.length;i++){
//             sum += arr[i];
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         double[] arr = {1,1/2,1/3,1/4,1/5,1/6,1/7,1/8,1/9,1/10};
//         System.out.println(sum(arr));
//     }
// }

// class practice{
//     public static void findPairs(int[] array, int target) {
//         if (array.length < 2) {
//             System.out.println("Invalid Input");
//         }
//         for (int i = 0; i < array.length; i++) {
//             for (int j = i + 1; j < array.length; j++) {
//                 if (array[i] + array[j] == target) {
//                     System.out.println("(" + array[i] + ", " + array[j] + ")");
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] array = {1, 2, 3, 4, 5};
//         int target = 7;
//         findPairs(array, target);
//     }
// }

// Perfect Number

// import java.util.Scanner;
// class practice{
//     static void perfectNum(int num){
//         int sum = 0;
//         for(int i = 1; i<num;i++){
//             if (num % i == 0){
//                 sum += i;
//             }
//         }
//         if (sum == num){
//             System.out.println(num + " is a perfect number");
//         }
//         else{
//             System.out.println(num + " is not a perfect number");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number to check perfect number");
//         int num = sc.nextInt();
//         perfectNum(num);
//     }
// }