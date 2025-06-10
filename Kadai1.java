public class Kadai1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= 1000; i++) {
            System.out.print(i + " ");
            if(i%n == 0) {
                System.out.println();
            }
        }
    }
}