public class Main {
    public static void main(String[] args) {
        int steps = 0;
        // Time complexity: O(n^2) - the inner body runs n * n times (n = 10)
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                steps++;
            }
        }
        System.out.println("Steps: " + steps);
    }
}
