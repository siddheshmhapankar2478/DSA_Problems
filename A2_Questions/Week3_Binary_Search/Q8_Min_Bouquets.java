package A2_Questions.Week3_Binary_Search;

public class Q8_Min_Bouquets {
    public static void main(String[] args) {

    }

    public boolean isPossible(int[] bloomDay, int m, int k, int days) {
        int bouquets = 0;
        int flowersInBouquet = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= days) {
                flowersInBouquet++;
                if (flowersInBouquet == k) {
                    bouquets++;
                    flowersInBouquet = 0;
                }
            } else
                flowersInBouquet = 0;
        }

        return bouquets >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] > max)
                max = bloomDay[i];
            if (bloomDay[i] < min)
                min = bloomDay[i];
        }
        int start = min, end = max, ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (!isPossible(bloomDay, m, k, mid)) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

}
