import java.util.Scanner;


public class binarysearch {

// finding the index of the target element in an SORTED array with binarysearch9
// return the index
 public static int binarysearch(int[] arr, int target){
    int start = 0;
    int end = arr.length-1;
    while(start <= end){
        // int mid = start + end / 2; //this formula is good only in some case if the start + end value goes out of the range of int it will return error
        // use this modifiedd formula
        int mid = start + (end - start)/2; //this will help you to get all the elments
        if (target < arr[mid]){
            end =  mid -1;
        }else if (target > arr[mid]){
            start = mid + 1;
        }else{
            return mid;
        }
    }
    return -1;

}
    public static void main(String[] args) {

    // MAIN METHOD OF finding the index of the target element in an SORTED array with binarysearch9

        Scanner sc = new Scanner(System.in);
         int[] arr ={1,2,3,4,56,8,9,99,9999,999999};
         System.out.println("enter the target element");
         int target = sc.nextInt();
         System.out.println(binarysearch(arr, target));  
    }
}
 