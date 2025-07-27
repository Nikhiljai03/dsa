// import java.util.Scanner;
// public class strings {
//     public static void main(String[] args) {
//         System.out.println("Enter a string");
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String rev = "";
//         for(int i = str.length() -1; i >= 0;i--){
//             rev = rev + str.charAt(i);
//         }
//         if(str.equals(rev)){
//             System.out.println("The string is a palindrome");
//         }
//         else{
//             System.out.println("The string is not a palindrome");
//         }
//     }
    
// }

// import java.util.*;
// class strings{
//     public static void main(String[] args) {
//         Map <Character , Integer> map = new HashMap<>();
//         String str = "hello world";
//         for(int i  = 0; i< str.length();i++){
//             char ch = str.charAt(i);
//             if(map.containsKey(ch)){
//                 map.put(ch, map.get(ch) + 1);
//             } else {
//                 map.put(ch, 1);
//             }
//         }
//         System.out.println(map);
//     }
// }