// this code is a Java implementation to find all the leaders in an array. from striver sheet medium level question

// import java.util.*;

// class Solution {
//     public ArrayList<Integer> leaders(int[] nums) {
//         ArrayList<Integer> result = new ArrayList<>();
//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             boolean isLeader = true;

//             // check if nums[i] is greater than all elements to its right
//             for (int j = i + 1; j < n; j++) {
//                 if (nums[i] < nums[j]) {
//                     isLeader = false;
//                     break;
//                 }
//             }

//             if (isLeader) {
//                 result.add(nums[i]);
//             }
//         }

//         return result;
//     }
// }
