class Solution {
    public boolean isPalindrome(String s) {
        String l = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        char[] arr = l.toCharArray();
        char[] pal = l.toCharArray();

        for (int i = 0; i < arr.length / 2; i++) {
            char t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }

        return Arrays.equals(arr, pal);
    }
}
