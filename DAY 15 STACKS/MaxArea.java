
import java.util.*;

public class MaxArea {

    public static void nextSmallerRight(int heights[], int nsr[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = heights.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
    }

    public static void nextSmallerLeft(int heights[], int nsl[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
    }

    public static int maxRectangularArea(int nsl[], int nsr[], int heights[]) {
        nextSmallerRight(heights, nsr);
        nextSmallerLeft(heights, nsl);
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            int currArea = heights[i] * (nsr[i] - nsl[i] - 1);
            if (currArea > maxArea) {
                maxArea = currArea;
            }
        }
        return maxArea;
    }

    public static void main(String args[]) {
        int heights[] = {2, 1, 5, 6, 2, 3};
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];
        System.out.println(maxRectangularArea(nsl, nsr, heights));
    }
}
