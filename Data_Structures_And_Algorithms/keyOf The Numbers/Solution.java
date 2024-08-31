class Solution {
    public int generateKey(int num1, int num2, int num3) {
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            int digit3 = num3 % 10;

            int minDigit = Math.min(Math.min(digit1, digit2), digit3);
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
            sb.append(minDigit);
        }
         sb.reverse();
         return Integer.parseInt(sb.toString());
    }
}