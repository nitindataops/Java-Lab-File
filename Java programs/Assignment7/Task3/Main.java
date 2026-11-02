public class Main {
    public static void main(String[] args) {
        int n = 1024;
        int steps = 0;
        // Time complexity: O(log n) - n is halved in every step
        while (n > 1) {
            n = n / 2;
            steps++;
        }
        System.out.println("Halving steps: " + steps);
    }
}
