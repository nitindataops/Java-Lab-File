public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            sb.append(i);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
