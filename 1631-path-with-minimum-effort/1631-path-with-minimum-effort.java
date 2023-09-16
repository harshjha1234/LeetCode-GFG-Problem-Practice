class Solution {
    int[][] vis = new int[105][105];
    int[][] dir = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};

    void ok(int x, int y, int mid, int[][] heights) {
        if (vis[x][y] == 0) {
            vis[x][y] = 1;
            int n = heights.length;
            int m = heights[0].length;

            for (int i = 0; i < 4; i++) {
                int X = x + dir[i][0];
                int Y = y + dir[i][1];

                if (X < 0 || X >= n || Y < 0 || Y >= m)
                    continue;

                if (Math.abs(heights[x][y] - heights[X][Y]) <= mid)
                    ok(X, Y, mid, heights);
            }
        }
    }

    public int minimumEffortPath(int[][] heights) {
        int l = 0;
        int r = 1000000002;
        int n = heights.length;
        int m = heights[0].length;

        while (l < r) {
            int mid = (l + r) / 2;
            vis = new int[105][105];
            ok(0, 0, mid, heights);

            if (vis[n - 1][m - 1] == 1)
                r = mid;
            else
                l = mid + 1;
        }

        return l;
    }
}