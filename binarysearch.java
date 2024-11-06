
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
    //             return arr[mid];  // Target is exactly the ceiling
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

        
    public static void main(String[] args){

// MAIN METHOD OF finding the index of the target element in an SORTED array with binarysearch9

        // Scanner sc = new Scanner(System.in);
        //  int[] arr ={-19,-10,-5,-3,1,2,5,22,44,58,78,99};
        //  System.out.println("enter the target element");
        //  int target = sc.nextInt();
        //  System.out.println(binarysearch(arr, target));
        
// MAIN METHOD OF BINARY SEARCH

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

        }
    }


 