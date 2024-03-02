package backtracking;

public class RatMazeProb {

    static boolean ratInMaze(int[][] maze) {
        int n = maze.length;
        int path[][] = new int[n][n];
        return solveMaze(maze, 0, 0, path);

    }

    static boolean solveMaze(int[][] maze, int i, int j, int[][] path) {

        int n = maze.length;
        // check if i , j cell is valid or not
        if (i < 0 || j < 0 || i >= n || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return false;
        }
        // marked it visited
        path[i][j] = 1;

        // comfirmed the destination cell
        if (i == n - 1 && j == n - 1) {
            return true;
        }
        // use recursion to move top bottom left right dirn
        // top
        if (solveMaze(maze, i - 1, j, path)) {
            return true;
        }
        // bottom
        if (solveMaze(maze, i + 1, j, path)) {
            return true;
        }
        // left
        if (solveMaze(maze, i, j - 1, path)) {
            return true;
        }
        // right
        if (solveMaze(maze, i, j + 1, path)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 1, 0 }, { 1, 0, 0 }, { 0, 1, 1 } };
        boolean pathPossible = ratInMaze(maze);
        System.out.println(pathPossible);
    }
}
