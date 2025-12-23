
public class FloodFillAlgo {

    public void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int orgColor) {
        if (sr < 0 || sc < 0 || sc >= image[0].length || sr >= image.length || vis[sr][sc] || image[sr][sc] != orgColor) {
            return;
        }
        vis[sr][sc] = true;
        image[sr][sc] = color;
        //left
        helper(image, sr, sc - 1, color, vis, orgColor);
        //right
        helper(image, sr, sc + 1, color, vis, orgColor);
        //up
        helper(image, sr - 1, sc, color, vis, orgColor);
        //down
        helper(image, sr
                + 1, sc, color, vis, orgColor);

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    public static void main(String args[]) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        FloodFillAlgo obj = new FloodFillAlgo();
        obj.floodFill(image, 1, 1, 2);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
}
