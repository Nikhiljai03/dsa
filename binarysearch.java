


public class binarysearch {

// finding the index of the target element in an SORTED array with binarysearch

// return the index

    //  public static int binarysearch(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length-1;
    //     while(start <= end){
    //         // int mid = start + end / 2; //this formula is good only in some case if the start + end value goes out of the range of int it will return error
    //         // use this modifiedd formula
    //         int mid = start + (end - start)/2; //this will help you to get all the elments
    //         if (target < arr[mid]){
    //             end =  mid -1;
    //         }else if (target > arr[mid]){
    //             start = mid + 1;
    //         }else{
    //             return mid;
    //         }
    //     }
    //     return -1;
//      }


// Function to find the ceiling of a number in a sorted array
//  CEALING IN BINARY SEARCH
// which rounds a number up to the nearest integer that is greater than or equal to the original number.

    // public static int findCeiling(int[] arr, int target) {
    //     int low = 0, high = arr.length - 1;
    //     int ceiling = -1; // Default value indicating no ceiling found

    //     // Perform binary search
    //     while (low <= high) { 
    //         int mid = low + (high - low) / 2;

    //         if (arr[mid] == target) {
    //             return arr[mid];  // target is exactly the ceiling
    //         }

    //         if (arr[mid] < target) {
    //             low = mid + 1;  // Search in the right half
    //         } else {
    //             ceiling = arr[mid];  // Potential ceiling, but continue searching in left half
    //             high = mid - 1;  // Search in the left half
    //         }
    //     }

    //     return ceiling; // If no exact match, return the closest ceiling
    // }

//  FLOOR BINARY SEARCH 
// The floor of a number is the largest element in the array that is less than or equal to the target value.

    // public static int floorBinarySearch(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length-1;
    //     int floor = -1;
    //     while(start <= end){
    //         int mid = start + (end - start) / 2;
    //         if(arr[mid] == target){
    //             return arr[mid];
    //         }else if(arr[mid] < target){
    //             floor = arr[mid];
    //             start = mid+1;
    //         }else{
    //             floor = arr[mid];
    //             end = mid - 1;
    //         }
    //     }
    //     return floor;
    // }

//LEETCODE 744. Find Smallest Letter Greater Than target

    // public static char nextGreatestLetter(char[] letters, char target) {
    //     int start = 0;
    //     int end = letters.length-1;
    //     while(start <= end){
    //         int mid = start + (end - start)/2;
    
    //         if (target < letters[mid]){
    //             end = mid - 1;
    //         }else {
    //             start = mid + 1;
    //         }
    //     }
    //     return letters[start % letters.length] ;
    // }

//LEETCODE 34. Find First and Last Position of Element in Sorted array

    // public int[] searchRange(int[] arr, int target){
    //     int[] ans = {-1,-1};
    //     // check for first occurane if target first
    //     ans[0] = search(arr, target, true);

    //     if(ans[0] != -1){
    //         ans[1] = search(arr, target, false);

    //     }
    //     return ans;
    //  }


    //  int search(int[] arr,int target,boolean findStartIndex){
    //     int ans = -1;
    //     int start = 0;
    //     int end = arr.length-1;
    //     while(start <= end){
    //         // int mid = start + end / 2; //this formula is good only in some case if the start + end value goes out of the range of int it will return error
    //         // use this modifiedd formula
    //         int mid = start + (end - start)/2; //this will help you to get all the elments
    //         if (target < arr[mid]){
    //             end =  mid -1;
    //         }else if (target > arr[mid]){
    //             start = mid + 1;
    //         }else{
    //             ans = mid;
    //             if(findStartIndex){
    //                 end = mid -1;
    //             }else{
    //                 start = mid+1;
    //             }
    //         }
    //     }
    //     return ans;
    //  }


//  FINDING POSITION OF AN ELEMENT IN AN INFINITE SORTED ARRAY

    // static int binarysearch(int[] arr, int target , int start, int end){
        
    //     while(start <= end){
    //         // int mid = start + end / 2; //this formula is good only in some case if the start + end value goes out of the range of int it will return error
    //         // use this modifiedd formula
    //         int mid = start + (end - start)/2; //this will help you to get all the elments
    //         if (target < arr[mid]){
    //             end =  mid -1;
    //         }else if (target > arr[mid]){
    //             start = mid + 1;
    //         }else{
    //             return mid;
    //         }
    //     }
    //     return -1;
    //  }

    //  static int findingRange(int[] arr, int target){
    //     // first find the range
    //     // first start with a box of size to
    //     int start = 0;
    //     int end = 1;
        
    //     // condition for the target to liee in the range 
    //     while (target > arr[end]){

    //         int newstart = end + 1; //new start
    //         // doubing the box value
    //         // end = previous end + sizeofbox * 2

    //         end = end + (end - start + 1) * 2;
    //         start = newstart;
    //     }
    //     return binarysearch(arr, target, start, end);
    //  }

// LEETCODE 852. Peak Index in a Mountain Array

// AND THIS SAME ANS CAN SOLVE LETTCODE 162


//     public int peakIndexInMountainArray(int[] arr) {
//     // Initialize `start` to the beginning of the array
//     int start = 0;
//     // Initialize `end` to the last index of the array
//     int end = arr.length - 1;

//     // Binary search to find the peak element
//     while (start < end) {
//         // Calculate the middle index to avoid overflow
//         int mid = start + (end - start) / 2;

//         // If the middle element is greater than the next element,
//         // it means we're on the descending side of the peak
//         if (arr[mid] > arr[mid + 1]) {
//             // Move `end` to `mid`, narrowing the search to the left half,
//             // as the peak is either at `mid` or in the left part
//             end = mid;
//         } else {
//             // Otherwise, we are on the ascending side of the peak
//             // Move `start` to `mid + 1`, narrowing the search to the right half
//             start = mid + 1;
//         }
//     }

//     // At the end of the loop, `start` and `end` converge at the peak index
//     return start; // Return the peak index
// }

// LEETCODE 162. Find Peak Element

//  SAME QUESTION AS 852 SIMILLAR APPROCH WITH EXACTLY SAME CODE

//         public int findPeakElement(int[] nums) {
//     int start = 0;
//     int end = nums.length-1;
//     while(start < end){
//         int mid = start + (end - start)/2;
//         if(nums[mid] > nums[mid+1]){
//             end = mid;
//         }else{
//             start = mid + 1;
//         }
//     }
//     return start;
// } 

//  LEETCODE 1095(HARD). Find in Mountain Array

// SIMILLAR APPROCH USED IN ABOCVE 162 FIND PEAK ELEMENT

// I HAVE NOT SUBMITED THIS CODE CAUSE THE CODE IS PERFECT BUT THERE IS LITTLE CHANGE IN INTERFACE THAT I WILL DO IN FUTURE

    // int search(int[] arr, int target){
    //     int peek = findPeakElement(arr);
    //     int firstTry= orderAgnosticBS(arr, target, 0, peek);
    //     if(firstTry != -1){
    //         return firstTry;
    //     }
    //     // try in second half
    //     return orderAgnosticBS(arr, target, peek + 1,arr.length-1);
    // }

    // public int findPeakElement(int[] nums) {
    //     int start = 0;
    //     int end = nums.length-1;
    //     while(start < end){
    //         int mid = start + (end - start)/2;
    //         if(nums[mid] > nums[mid+1]){
    //             end = mid;
    //         }else{
    //             start = mid + 1;
    //         }
    //     }
    //     return start;
    // } 
    //     static int orderAgnosticBS(int[] arr, int target, int start, int end) {

    //         // find whether the array is sorted in ascending or descending
    //         boolean isAsc = arr[start] < arr[end];
    
    //         while(start <= end) {
    //             // find the middle element
    // //            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
    //             int mid = start + (end - start) / 2;
    
    //             if (arr[mid] == target) {
    //                 return mid;
    //             }
    
    //             if (isAsc) {
    //                 if (target < arr[mid]) {
    //                     end = mid - 1;
    //                 } else {
    //                     start = mid + 1;
    //                 }
    //             } else {
    //                 if (target > arr[mid]) {
    //                     end = mid - 1;
    //                 } else {
    //                     start = mid + 1;
    //                 }
    //             }
    //         }
    //         return -1;
    //     }

// LEETCODE 33. Search in Rotated Sorted Array

    // public int search(int[] nums, int target) {
    //     int pivot = findPivot(nums);
    //     // if you didn't find the pivot that means the arr in not rotated
    //     if(pivot == -1){
    //         return  binarysearch(nums, target, 0,nums.length - 1);
    //     }
    //     // if yuu found the pivot, then you have found the two ascending sorted arrays
    //     if(nums[pivot] == target){
    //         return pivot;
    //     }
    //     if(target >= nums[0]){
    //         return binarysearch(nums, target, 0, pivot - 1);
    //     }
    //     return binarysearch(nums, target, pivot + 1, nums.length-1);
    // } 
    
    //  public static int binarysearch(int[] arr, int target,int start, int end){
    //     while(start <= end){
    //         // int mid = start + end / 2; //this formula is good only in some case if the start + end value goes out of the range of int it will return error
    //         // use this modifiedd formula
    //         int mid = start + (end - start)/2; //this will help you to get all the elments
    //         if (target < arr[mid]){
    //             end =  mid -1;
    //         }else if (target > arr[mid]){
    //             start = mid + 1;
    //         }else{
    //             return mid;
    //         }
    //     }
    //     return -1;
    //  }
    // static int findPivot(int[] arr){
    //     int start=0;
    //     int end = arr.length - 1;
    //     while(start <= end){
    //         int mid = start + (end - start) / 2;
    //         if(mid < end && arr[mid]>arr[mid + 1]){
    //             return mid;
    //         }
    //             if(mid > start && arr[mid] < arr[mid - 1]){
    //                 return mid - 1;
    //         }
    //         if(arr[start] >= arr[mid]){
    //             end = mid - 1;
    //         }
    //         else{
    //             start = mid + 1;
    //         }
    //     }
    //     return -1;
    // }


// LEETCODE 410 (HARD). Split Array Largest Sum

    public int splitArray(int[] nums, int k) {

         int start = 0; //initially the start is '0'
         int end = 0;  //initially the end is '0'

         for(int i =0; i < nums.length; i++){
            start = Math.max(start, nums[i]);  //in the end of the loop this will contain the max item from the array
            end += nums[i];
        }
        
        // binary search 
        while(start < end){
            // tery for the middle for the potential answer
            int mid = start + (end - start) / 2;

            // calculate how many pieces you cna divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if (sum + num > mid){
                    // you cannot dd this in sub array make new one
                    // say you add this num in new subarray thensum = num
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }
            if (pieces > k){
                start = mid + 1;
            }else{
                end = mid;
            }
        }

        return end; // here start == end
    }

    public static void main (String[] args){
        
// MAIN METHOD OF finding the index of the target element in an SORTED array with binarysearch9

        // Scanner sc = new Scanner(System.in);
        //  int[] arr ={-19,-10,-5,-3,1,2,5,22,44,58,78,99};
        //  System.out.println("enter the target element");
        //  int target = sc.nextInt();
        //  System.out.println(binarysearch(arr, target));
        
// MAIN METHOD OF BINARY SEARCH`

        // int[] arr = {1, 2, 8, 10, 10, 12, 19};
        // int target = 5;
            
        // int ceiling = findCeiling(arr, target);
            
        // if (ceiling == -1) {
        //    System.out.println("No ceiling found");
        // } else {
        //     System.out.println("Ceiling of " + target + " is " + ceiling);
        // }

        // int[] arr = {1, 2, 8, 10, 10, 12, 19};
        // int target = 11;
        // int floor = floorBinarySearch(arr, target);
        // if(floor == -1){
        //     System.out.println("no floor foun");
        // }else{
        //     System.out.println("floor of " + target + "is " + floor);
        // }

// // MAIN METHOD OF LEETCODE 744. Find Smallest Letter Greater Than target

    //   char[] letters = {'a','b','c','k','l','n'};
    //   char target='d';
    //   System.out.println(nextGreatestLetter(letters, target));

// MAIN METHOD OF FINDING POSITION OF AN INFINITE ARRAY

        // int [] arr = {3,5,7,9,10,90,100,130,140,160,170};
        // int target = 10;
        // System.out.println(findingRange(arr, target));
        }
    }


 