class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return new int[] {};

        Map<Integer, Integer> count = new HashMap<>();

        for(int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> count.get(b) - count.get(a));
        
        heap.addAll(count.keySet());

        int[] res = new int[k];

        for(int i = 0; i < k; i++){
            res[i] = heap.poll();
        }

        return res;

    }
}
