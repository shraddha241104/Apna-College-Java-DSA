// import java.util.*;

public class TrapRainWater {

    public static int TrappedRainWater(int arr[]) {
        //calculate left max - array
        int maxL[] = new int[arr.length];
        maxL[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxL[i] = Math.max(arr[i], maxL[i - 1]);
        }
        //calculate right max - array
        int maxR[] = new int[arr.length];
        maxR[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            maxR[i] = Math.max(arr[i], maxR[i + 1]);
        }

        int trappedWaterTotal = 0;
        for (int i = 0; i < arr.length; i++) {
            //calculate water level (min(left max, right max))
            int waterLevel = Math.min(maxL[i], maxR[i]);
            //calculate trapped water
            int trappedWater = (waterLevel - arr[i]) * 1;// width = 1 (for reference if width changes)
            trappedWaterTotal += trappedWater;
        }
        return trappedWaterTotal;
    }

    public static void main(String args[]) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        // int arr2[] = {4, 2}; // checking edge conditions
        int trappedWaterTotal = TrappedRainWater(arr);
        System.out.println("Total trapped water: " + trappedWaterTotal);
    }
}
