class Solution {
    public List<String> fizzBuzz(int n) {
        int rest3,rest5;
        ArrayList<String> fizzbuzz = new ArrayList();
        for (int a=1;a<=n;a++){
            rest3 = a%3;
            rest5 = a%5;
            if (rest3==0&&rest5==0) fizzbuzz.add("FizzBuzz");
            else if (rest3==0) fizzbuzz.add("Fizz");
            else if (rest5==0) fizzbuzz.add("Buzz");
            else fizzbuzz.add(String.valueOf(a));
        }
        return fizzbuzz;
    }
}