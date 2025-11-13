class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        long sumNums = 0, sumSquares = 0;
        long sumN = (long) n * (n + 1) / 2;
        long sumSquaresN = (long) n * (n + 1) * (2 * n + 1) / 6;

        for (int num : nums) {
            sumNums += num;
            sumSquares += (long) num * num;
        }

        long diff = sumNums - sumN; // duplicate - missing
        long sumDiff = (sumSquares - sumSquaresN) / diff; // duplicate + missing

        int duplicate = (int) ((diff + sumDiff) / 2);
        int missing = (int) (sumDiff - duplicate);

        return new int[] {duplicate, missing};
    }
}
