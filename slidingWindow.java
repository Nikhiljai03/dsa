// public class slidingWindow {
//     public static int slid(int arr[], int k){
//         int max = 0;
//         int currsum = 0;
//         for(int i = 0; i<k; i++){
//             currsum += arr[i];
//         }
//         max = currsum;
//         for(int i = k; i < arr.length; i++){
//             currsum = currsum - arr[i-k];
//             currsum = currsum + arr[i];
//             if(currsum > max){
//                 max = currsum;
//             }
//         }
//         max = Math.max(max, currsum);
//         return max;
//     }
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 6, 7, 8 };
//         int currsum = 0;
//         int maxsum = 0;
//         int k = 1;
    
//         for(int i = 0;i<k;i++){
//             currsum += arr[i];
//         }
//         maxsum = currsum;

//         for(int i = k;i<arr.length;i++){
//              currsum = currsum - arr[i-k];
//              currsum = currsum + arr[i];

//              if(currsum>maxsum){
//                  maxsum = currsum;
//              }
//         }
//         // System.out.println(maxsum);
//         System.out.println(slid(arr, k));
//     }
// }

public class slidingWindow{
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6, 7, 8 };
        int k = 3; // Size of the sliding window
        System.out.println(arr.length);
    }
}
