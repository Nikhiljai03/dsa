
public class linearsearch{

// LINEAR SEARCH IN A SINGLE STRING

    // static boolean search(String str, char ch){
    //         if(str.length() == 0){
    //             return false;
    //         }
    //         for(int i = 0; i<str.length() ;i++){
    //             if(ch == str.charAt(i)){
    //                 return true;
    //         }                        
    //     }return false;
    // }


// LINEAR SEARCH IN AN ARRAY 

    // static String linearsearch(String[] arr,String target){
    //     if(arr.length == 0){
    //         return "no arr";
    //     }
    //     for(int i=0;i<arr.length;i++){
    //         String element = arr[i];
    //            if(element.equals(target)){  //Use .equals() to compare strings and its only for string values
    //             return "found";
    //            }
    //         }return "not found";
    //     }


//  FINDING MINIMUM NUMBER IN AN ARRAY

    // static int min(int[] arr){
    //     // assuming there is no empty array
    //     int ans = arr[0];
    //     for (int i = 0; i <arr.length; i++) {
    //         if(arr[i] < ans){
    //             ans = arr[i];
    //         }
    //     }
    //     return ans;
    // } 


//  FINDING MAXIMUM NUMBER IN AN ARRAY

    // static int max(int[] arr){
    //     // assuming there is no empty array
    //     int ans = arr[0];
    //     for (int i = 0; i <arr.length; i++) {
    //         if(ans < arr[i]){
    //             ans = arr[i];
    //         }
    //     }
    //     return ans;
    // } 

// FINDING THE TARGET IN 2D ARRAY

    // static int[] search(int[][] arr, int target){
    //     for(int row = 0; row<arr.length;row++){
    //         for(int col = 0; col < arr[row].length; col++){
    //             if(arr[row][col] == target){
    //                 return new int[]{row,col};
    //             }
    //         }
    //     }
    //     return null;
    // }


//  Leet Code : 1295. Find Numbers with Even Number of Digits

//     static int findNumbers(int[] nums){
//         int count = 0;
//         for (int num : nums) {
//             if(even(num)){ //creating a function for even
//                 count++;
//             }           
//         }
//         return count;
//     }
// // FUNCTION TO CHECK WEATHER THE NUMBER IS EVEN OR NOT
//     static boolean even(int num){

//         int numberofdigits = digits(num);
//         if(numberofdigits % 2 == 0){
//             return true;
//         }
//         return false;

//     }
// // COUNTING NUMBER OF DIGITS IN OUR NUMBER
//     static int digits(int num){
//         int count = 0;          
        
//         while(num > 0){
//             count++;
//             num = num /10;

//         }


//         return count;
//     }


//  Leet Code : 1672. Richest Customer Wealth

    // public int maximumwealth(int[][] accounts){
    //     // person = row
    //     // account = coloumn
    //     int ans = Integer.MIN_VALUE;
    //     for(int person = 0; person<accounts.length; person++){
    //         // when you are starting to move on a new coloumn take the sum for that row
    //         int sum = 0;
    //         for(int account = 0; account <accounts[person].length; account++){
    //             sum += accounts[person][account];

    //         }
    //         // now we have sum of accounts of person 
    //         // check with overall ans
    //         if(sum > ans){
    //             ans = sum;
    //         }
    //     }
    //     return ans;
    // }                    

    
    public static void main(String[] args) {

// MAIN FUNCTION OF LINEAR SEARCH IN A SINGLE STRING(FINDIND A LEETER)

        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter a word or pharase");
        // String name = sc.nextLine();
        // System.out.println("enter the letter to find");
        // char target = sc.next().charAt(0);
        // System.out.println(search(name ,target));


// MAIN FUNCTION OF LINEAR SEARCH IN AN ARRAY

    //    Scanner sc = new Scanner(System.in);
    //    String[] names = {"nikhil","alex","pablo escobar","knight","batman","hesinberg"};
    //    System.out.println("ENTER THE NAME TO FIND");
    //    String target = sc.nextLine();
    //    System.out.println(linearsearch(names,target));

//  MAIN FUNCTION OF FINDING MINIMUM NIMBER IN AN ARRAY

    // int[] arr ={22,66,55,444,77,-1,-69,88,99};
    // System.out.println(min(arr));

//  MAIN FUNCTION OF FINDING MAXIMUM NIMBER IN AN ARRAY

    // int[] arr ={22,66,55,444,77,-1,-69,88,99}; 
    // System.out.println(max(arr));

// MAIN FUNCTION OF FINDING TARGET IN 2D ARRAY

    // int[][] arr = {{10,20,30},
    //              {1,2,3,4,5},
    //              {100,200,99}};
    // int target = 4;
    // int[] ans = search(arr, target);
    // System.out.println(Arrays.toString(ans));  //Arrays.toString(ans) converts the result array to a readable string format


//Leet Code : 1295. MAIN METHOD OF Find Numbers with Even Number of Digits

    // int[] nums = {12,345,2,6,7896};
    // System.out.println(findNumbers(nums));
    }
}