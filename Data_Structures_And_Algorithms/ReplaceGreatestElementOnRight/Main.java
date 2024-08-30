public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] output = solution.replaceElements(arr);
        
        for (int num : output) {
            System.out.print(num + " ");
        }
        // Output: 18 6 6 6 1 -1
    }
}
