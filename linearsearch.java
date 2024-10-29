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



    }
}