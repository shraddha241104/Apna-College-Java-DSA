
public class Ass4 {

    public static void trappedRainwater(int arr[]) {
        //calculate left max
        int maxL[] = new int[arr.length];
        maxL[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxL[i] = Math.max(arr[i], maxL[i - 1]);
        }
        //calculate right max
        int maxR[] = new int[arr.length];
        maxR[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            maxR[i] = Math.max(arr[i], maxR[i + 1]);
        }
        //calculate water level
        //calculate trapped rainwater
        int totalTrappedWater = 0;
        for (int i = 0; i < arr.length; i++) {
            int trappedWater = (Math.min(maxL[i], maxR[i]) - arr[i]) * 1;
            totalTrappedWater += trappedWater;
        }
        System.out.println("Total trapped water: " + totalTrappedWater);
    }

    public static void main(String args[]) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int height2[] = {4, 2, 0, 3, 2, 5};
        trappedRainwater(height);
        trappedRainwater(height2);
    }
}
