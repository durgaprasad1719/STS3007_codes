import java.util.*;

public class Main {

    static int n;
    static int[][] maze;
    static int[][] path;

    // Down, Right, Up, Left
    static int[] row = {1, 0, -1, 0};
    static int[] col = {0, 1, 0, -1};

    static boolean solve(int r, int c) {

        // Step 1: Check whether the cell is valid
        if (r < 0 || c < 0 || r >= n || c >= n ||
            maze[r][c] == 0 || path[r][c] == 1) {
            return false;
        }

        // Step 2: Mark the current cell
        path[r][c] = 1;

        // Step 3: Check destination
        if (r == n - 1 && c == n - 1) {
            return true;
        }

        // Step 4: Try all four directions
        for (int i = 0; i < 4; i++) {

            int nr = r + row[i];
            int nc = c + col[i];

            // Step 5: Move to the next cell
            if (solve(nr, nc)) {
                return true;
            }
        }

        // Step 6: Backtracking
        path[r][c] = 0;

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        maze = new int[n][n];
        path = new int[n][n];

        // Read maze
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        // Start from (0,0)
        if (solve(0, 0)) {

            // Print the solution path
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(path[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("No valid path found");
        }

        sc.close();
    }
}
