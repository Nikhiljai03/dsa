import java.util.Scanner;
public class obj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the k:");
        // int k = sc.nextInt();

        // k = k % 5; // To handle cases where k is greater than the length of the array
        // int arr[] = {1, 2, 3, 4, 5};
        // for(int j = 0; j < k; j++){
        //     int copy =  arr[arr.length-1];
        // for(int i = arr.length-1; i > 0; i--){
        //     arr[i] = arr[i - 1];
        // }
        // arr[0] = copy;
        // }
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // int k = sc.nextInt();
        // int arr[] = {1, 2, 3, 4, 5};
        // int temp [] = new int[arr.length];
        // for(int i = 0; i < arr.length;i++){
        //     temp[i] = arr[(i+k) % arr.length];
        // }
        // for(int i = 0; i < temp.length; i++){
        //     System.out.print(temp[i] + " ");
        // }

        // int arr[] = {1,2,3,4,5};
        // int temp[] = new int[arr.length];
        // int k = sc.nextInt();
        // k = k % arr.length;
        // for(int i = 0; i < arr.length; i++){
        //     temp[(i+k)% arr.length] = arr[i];
        // }    
        // for(int i = 0; i < temp.length; i++){
        //     System.out.print(temp[i] + " ");
        // }
        // int k = sc.nextInt();
        // k = k % arr.length; // To handle cases where k is greater than the length of the array
        // reverse(arr, 0, k-1);
        // reverse(arr, k, arr.length - 1);
        // reverse(arr, 0, arr.length - 1);
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        int arr1[] = {2, 4, 6};
        int arr2[] = {3, 5, 7};
        int merge[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                merge[k++] = arr1[i++];
            }
            else{
                merge[k++] = arr2[j++];
            }
        
        }
        while(j < arr2.length){
            merge[k++] = arr2[j++];
        }
        while(i < arr1.length){
            merge[k++] = arr1[i++];
        }
        for(int l = 0; l < merge.length; l++){
            System.out.print(merge[l] + " ");
        }

    }
    public static void reverse(int arr[], int start, int end) {
        // while(start < end) {
        //     int temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;
        //     start++;
        //     end--;
        // }

    }
}