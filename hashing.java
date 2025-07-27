// class hashing{
//     public static void main(String[] args) {
//         int [] nums ={2,5,2,5,3,6,4,6,7,8,4,9};
//         Set <Integer> set = new HashSet<>();
//         for(int i = 0; i < nums.length;i++){
//             set.add(nums[i]);
//         }
//         System.out.println(set);
//     }
// }

// class hashing{
//     public static void main(String[] args) {
//         int [] nums ={2,5,2,5,3,6,4,6,7,8,4,9};
//         Map <Integer, Integer> map = new LinkedHashMap<>();
        
//         for(int i = 0; i < nums.length;i++){
//             if(map.containsKey(nums[i])){
//                 map.put(nums[i], map.get(nums[i])+1);
//             }
//             else{
//                 map.put(nums[i], 1);
//             }
//         }
//         System.out.println(map);
//         map.forEach((key, value) -> System.out.println(key + " : " + value));
//     }
// }

// import java.util.*;
// class hashing {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int nums[] = {1,2,3,35,6,4,8,1,8,5,5,4,4};
//         Map <Integer,Integer> map = new HashMap<>();

//         for(int num : nums){
//             map.put(num,0);
//         }
//         for(int num :nums){
//             map.put(num,map.get(num)+1);
            
//         }
//         int sc = s.nextInt();
//         if(map.containsKey(sc)){
//             System.out.println(map.get(sc));
//         }
//         else{
//             System.out.println("not present");
//         }
//     }
// }

// import java.util.*;
// class hashing{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         String str = "shdbfbdfavkakvavgagafjzg";
//         Map <Character,Integer>  map = new HashMap<>();
//         for(int i= 0; i < str.length();i++){
//             map.put(str.charAt(i),0);
//         }
//         for(int i = 0; i < str.length();i++){
//             map.put(str.charAt(i),map.get(str.charAt(i)) +1);
//         }
//         char ch = s.next().charAt(0);
//         if(map.containsKey(ch)){
//             System.out.println(map.get(ch));
//         }
//         else{
//             System.out.println("not present");
//         }
//     }
// }


// import java.util.*;
// class hashing{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         String str = "shdbfbdfavkakvavgagafjzg";
//         System.out.println("Enter the character to find its frequency:");
//         char ch = s.next().charAt(0);
//         frequency(str, ch);
//     }
//     public static void frequency(String str,char ch){
//         Map<Character,Integer> map = new HashMap<>();

//         for(int i =0; i < str.length();i++){
//             map.put(str.charAt(i),0);
//         }

//         for(int i = 0; i < str.length();i++){
//             map.put(str.charAt(i),map.get(str.charAt(i))+1);
//         }

//         if(map.containsKey(ch)){
//             System.out.println(map.get(ch));
//         }else{
//             System.out.println("not present");
//         }

//     }
// }

import java.util.*;
class hashing {
    public List<List<Integer>> countFrequencies(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        Map <Integer,Integer> map = new HashMap<>();

        for(int  i = 0; i < nums.length;i++){
            map.put(nums[i],0);
        }
        for(int i = 0; i < nums.length;i++){
            map.put(nums[i],map.get(nums[i])+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            li.add(pair);
        }
        return li;
    }
    public static void main(String[] args) {
        int [] nums = {2,5,2,5,3,6,4,6,7,8,4,9};
        System.out.println(new hashing().countFrequencies(nums));
    }
}