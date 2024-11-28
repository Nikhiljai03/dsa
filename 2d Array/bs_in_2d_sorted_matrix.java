import java.util.Arrays;

public class bs_in_2d_sorted_matrix {

    // Helper method: Perform binary search in a single row of the matrix
    static int[] binarSearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) { // Continue searching while the range is valid
            int mid = cStart + (cEnd - cStart) / 2; // Find the middle column
            if (matrix[row][mid] == target) { // If target is found, return its position
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) { // If target is larger, move to the right half
                cStart = mid + 1;
            } else { // If target is smaller, move to the left half
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1}; // If target is not found, return [-1, -1]
    }

    // Main method to search for the target in the entire 2D matrix
    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length; // Number of rows in the matrix
        int cols = matrix[0].length; // Number of columns in the matrix

        // Special case: If the matrix has only one row, do binary search in that row
        if (rows == 1) {
            return binarSearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0; // Start row
        int rEnd = rows - 1; // End row
        int cMid = cols / 2; // Middle column

        // Narrow down to two rows using binary search in the middle column
        while (rStart < (rEnd - 1)) { // Run the loop until two rows are left
            int mid = rStart + (rEnd - rStart) / 2; // Find the middle row
            if (matrix[mid][cMid] == target) { // If target is found, return its position
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) { // If target is larger, move to the lower half
                rStart = mid;
            } else { // If target is smaller, move to the upper half
                rEnd = mid;
            }
        }

        // Now only two rows remain: rStart and rStart + 1

        // Check if the target is in the middle column of the remaining two rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // Search in the 4 possible quadrants

        // Search in the left part of the first row
        if (target <= matrix[rStart][cMid - 1]) {
            return binarSearch(matrix, rStart, 0, cMid - 1, target);
        }

        // Search in the right part of the first row
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarSearch(matrix, rStart, cMid + 1, cols - 1, target);
        }

        // Search in the left part of the second row
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarSearch(matrix, rStart + 1, 0, cMid - 1, target);
        }

        // Search in the right part of the second row
        return binarSearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        System.out.println(Arrays.toString(search(arr, 6))); // Output: [1, 2]
    }
}
