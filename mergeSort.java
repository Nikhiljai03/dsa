class mergeSort{
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
        mergesort(arr,0, n - 1);
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
    public static void mergesort(int arr[] , int left , int right){
        if(left < right){
            int mid = (left + right) / 2;

            mergesort(arr, left, mid);

            mergesort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }
    public static void merge(int arr[] , int left , int mid , int right){
        int temp[] = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (int l = left; l <= right; l++) {
            arr[l] = temp[l - left];
            }

        
    }
}   