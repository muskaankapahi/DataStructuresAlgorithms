package Graphs;

import java.util.ArrayDeque;
import java.util.Queue;


public class RottenOranges {
    public static int rottenOranges(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int fresh = 0;
        int time = 0;
        Pair[] directions = {new Pair(0, 1), new Pair(1, 0), new Pair(0, -1), new Pair(-1, 0)};
        Queue<Pair> queue = new ArrayDeque<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    fresh += 1;
                }
                if (grid[i][j] == 2) {
                    queue.offer(new Pair(i, j));
                }
            }
        }

        while (!queue.isEmpty() && fresh > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Pair currentOrange = queue.poll();
                for (Pair direction : directions) {
                    assert currentOrange != null;
                    int currentRow = currentOrange.row + direction.row;
                    int currentCol = currentOrange.col + direction.col;

                    if (currentRow < 0 || currentRow >= row || currentCol < 0 || currentCol >= col || grid[currentRow][currentCol] != 1) {
                        continue;
                    }

                    grid[currentRow][currentCol] = 2;
                    fresh -= 1;
                    queue.offer(new Pair(currentRow, currentCol));
                }
            }

            time += 1;
        }
        return fresh == 0 ? time : -1;
    }

    public static void main(String[] args) {
        System.out.println(rottenOranges(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
        System.out.println(rottenOranges(new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}}));
        System.out.println(rottenOranges(new int[][]{{0, 2}}));
    }

    private static class Pair {
        int row;
        int col;

        Pair(int x, int y) {
            this.row = x;
            this.col = y;
        }

        @Override
        public String toString() {
            return "(" + row + ", " + col + ")";
        }
    }
}