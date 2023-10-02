class Solution {
    public boolean winnerOfGame(String colors) {
        return colors.replaceAll("A{3,}", "AA").length() < colors.replaceAll("B{3,}", "BB").length();

    }
}