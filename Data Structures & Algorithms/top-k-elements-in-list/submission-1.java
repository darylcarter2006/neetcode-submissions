class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer, Integer> times = new HashMap<>();

        for (int num : nums) {
            times.put(num, times.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> times.get(b) - times.get(a)
        );

        heap.addAll(times.keySet());

        int[] res = new int[k];
        
        for (int i = 0; i < k; i++){
            res[i] = heap.poll();
        }

        return res;
    }
}
