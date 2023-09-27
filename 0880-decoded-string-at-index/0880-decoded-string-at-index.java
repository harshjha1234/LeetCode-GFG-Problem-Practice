class Solution {
    public String decodeAtIndex(String s, int k) {
        long decodedLength = 0;

        for (char character : s.toCharArray()) {
            if (Character.isDigit(character)) {
                decodedLength *= (character - '0');
            } else {
                decodedLength++;
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);

            if (Character.isDigit(currentChar)) {
                decodedLength /= (currentChar - '0');
                k %= decodedLength;
            } else {
                if (k == 0 || decodedLength == k) {
                    return String.valueOf(currentChar); 
                }
                decodedLength--;
            }
        }
        return "";
    }
}