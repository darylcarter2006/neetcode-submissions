class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> sums = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];
            
            if(sums.containsKey(diff)) {
                return new int[] {sums.get(diff) + 1, i + 1};
            }

            sums.put(numbers[i], i);
        }
        return new int[]{};
    }
}
