class mm {

    public void minimum(int arr[]){
        int min = arr[0];
        for(int i = 1;i <= arr.length-1;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum value is: " + min);
    }
    public void factorial(int n){
        int  fact = 1;
        for(int i = 1;i <= n;i++){
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
    public void target(int arr[], int target){
        for(int i = 0; i< arr.length-1;i++){
            if(arr[i] == target){
                System.out.println("Target found at index: " + i);
                break;
            }
        }
        System.out.println("Target not found in the array.");
        return;
    }
}
class kk{
    public static void main(String[] args) {
        

        int arr[] = {1, 2, 3, 4, 5};
        // int copy = arr[arr.length-1];
        // for(int i = arr.length-1; i > 0; i--){
        //     arr[i] =arr[i - 1];
        // }
        // arr[0] = copy;
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the k:");
        // int k  = sc.nextInt();
        // k = k % arr.length; // To handle cases where k is greater than the length of the array

        // for(int j = 0; j < k; j++){
        //     int copy = arr[0];
        // for(int i = 0; i < arr.length-1; i++){
        //     arr[i] = arr[i + 1];
        // }
        // arr[arr.length - 1] = copy;
        // }
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // int sum = Integer.MAX_VALUE;
        // System.out.println(sum);
        int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("The unit of water is: " + trap(height));
        
    }
    public static int trap(int[] height) {
        int m = 0;
        int n = 0;
        int leftMax = 0; 
        int rightMax = 0;
        int unit = 0;
        for(int i = 1;i < height.length - 1; i++){
            for(int j = i -1; j  >  0; j--){
                leftMax = Math.max(n,leftMax);
                for(j = i + 1; j < height.length - 1; j++){
                    rightMax = Math.max(m,rightMax);
                    unit  = rightMax - leftMax;
                }
            }
        }
        return unit;
    }
    
}
