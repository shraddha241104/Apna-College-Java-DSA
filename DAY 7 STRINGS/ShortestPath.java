
public class ShortestPath {

    public static float findShortestPath(String str) {
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {
                y2++;
            } else if (str.charAt(i) == 'E') {
                x2++;
            } else if (str.charAt(i) == 'W') {
                x2--;
            } else {
                y2--;
            }
        }
        float shortestPath = (float) Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        return shortestPath;
    }

    public static void main(String args[]) {
        String directions = "WNEENESENNN";
        float shortestPath = findShortestPath(directions);
        System.out.println("shortest path = " + shortestPath);
    }
}
