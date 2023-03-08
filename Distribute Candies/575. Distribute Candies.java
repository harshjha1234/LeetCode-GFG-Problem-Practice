class Solution {
    public int distributeCandies(int[] candyType) {
        return Math.min(candyType.length / 2, ((int) Arrays.stream(candyType).distinct().count()));
    }
}
