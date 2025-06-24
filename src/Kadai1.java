public class Kadai1 {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);
            for (int i = 1; i <= 1000; i++) {
                System.out.print(i + " ");
                if (i % n == 0) {
                    System.out.println();
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("コマンドライン引数には数字を入力してください");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("コマンドライン引数に何も入力されていません") ;
        }
   }
}