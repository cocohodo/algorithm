class Solution {
    public String intToRoman(int num) {
        String answer = "";
        int[] number = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbol = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < symbol.length && num > 0; i++) {
            while (num >= number[i]) {
                num-=number[i];
                answer+=symbol[i];
            }
        }
        return answer;
    }
}