
public class binarysearch {

// finding the index of the target element in an SORTED numsay with binarysearch

// return the index

    //  public static int binarysearch(int[] nums, int target){
    //     int start = 0;
    //     int end = nums.length-1;
    //     while(start <= end){
    //         // int mid = start + end / 2; //this formula is good only in some case if the start + end value goes out of the range of int it will return error
    //         // use this modifiedd formula
    //         int mid = start + (end - start)/2; //this will help you to get all the elments
    //         if (target < nums[mid]){
    //             end =  mid -1;
    //         }else if (target > nums[mid]){
    //             start = mid + 1;
    //         }else{
    //             return mid;
    //         }
    //     }
    //     return -1;
//      }


// Function to find the ceiling of a number in a sorted numsay
//  CEALING IN BINARY SEARCH
// which rounds a number up to the nearest integer that is greater than or equal to the original number.

    // public static int findCeiling(int[] nums, int target) {
    //     int low = 0, high = nums.length - 1;
    //     int ceiling = -1; // Default value indicating no ceiling found

    //     // Perform binary search
    //     while (low <= high) { 
    //         int mid = low + (high - low) / 2;

    //         if (nums[mid] == target) {
    //             return nums[mid];  // Target is exactly the ceiling
    //         }

    //         if (nums[mid] < target) {
    //             low = mid + 1;  // Search in the right half
    //         } else {
    //             ceiling = nums[mid];  // Potential ceiling, but continue searching in left half
    //             high = mid - 1;  // Search in the left half
    //         }
    //     }

    //     return ceiling; // If no exact match, return the closest ceiling
    // }

//  FLOOR BINARY SEARCH 
// The floor of a number is the largest element in the numsay that is less than or equal to the target value.

    // public static int floorBinarySearch(int[] nums, int target){
    //     int start = 0;
    //     int end = nums.length-1;
    //     int floor = -1;
    //     while(start <= end){
    //         int mid = start + (end - start) / 2;
    //         if(nums[mid] == target){
    //             return nums[mid];
    //         }else if(nums[mid] < target){
    //             floor = nums[mid];
    //             start = mid+1;
    //         }else{
    //             floor = nums[mid];
    //             end = mid - 1;
    //         }
    //     }
    //     return floor;
    // }

//LEETCODE 744. Find Smallest Letter Greater Than Target

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

//LEETCODE 34. Find First and Last Position of Element in Sorted numsay

    // public int[] searchRange(int[] nums, int target){
    //     int[] ans = {-1,-1};
    //     // check for first occurane if target first
    //     ans[0] = search(nums, target, true);

    //     if(ans[0] != -1){
    //         ans[1] = search(nums, target, false);

    //     }
    //     return ans;
    //  }


    //  int search(int[] nums,int target,boolean findStartIndex){
    //     int ans = -1;
    //     int start = 0;
    //     int end = nums.length-1;
    //     while(start <= end){
    //         // int mid = start + end / 2; //this formula is good only in some case if the start + end value goes out of the range of int it will return error
    //         // use this modifiedd formula
    //         int mid = start + (end - start)/2; //this will help you to get all the elments
    //         if (target < nums[mid]){
    //             end =  mid -1;
    //         }else if (target > nums[mid]){
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
    

    public static void main(String[] args){

// MAIN METHOD OF finding the index of the target element in an SORTED numsay with binarysearch9

        // Scanner sc = new Scanner(System.in);
        //  int[] nums ={-19,-10,-5,-3,1,2,5,22,44,58,78,99};
        //  System.out.println("enter the target element");
        //  int target = sc.nextInt();
        //  System.out.println(binarysearch(nums, target));
        
// MAIN METHOD OF BINARY SEARCH`

        // int[] nums = {1, 2, 8, 10, 10, 12, 19};
        // int target = 5;
            
        // int ceiling = findCeiling(nums, target);
            
        // if (ceiling == -1) {
        //    System.out.println("No ceiling found");
        // } else {
        //     System.out.println("Ceiling of " + target + " is " + ceiling);
        // }

        // int[] nums = {1, 2, 8, 10, 10, 12, 19};
        // int target = 11;
        // int floor = floorBinarySearch(nums, target);
        // if(floor == -1){
        //     System.out.println("no floor foun");
        // }else{
        //     System.out.println("floor of " + target + "is " + floor);
        // }

// // MAIN METHOD OF LEETCODE 744. Find Smallest Letter Greater Than Target

//         char[] letters = {'a','b','c','k','l','n'};
//         char target='d';
//         System.out.println(nextGreatestLetter(letters, target));

        }
    }


 