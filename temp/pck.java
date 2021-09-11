import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), sum = 0, now = 0;

        // 命令の入力
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // 処理
        for (int i = 0; i < n; i++) {
            if(Math.abs(a[i]-now)<Math.min(now,10-now)+Math.abs(10-a[i])){
                sum+=Math.abs(a[i]-now);
            }else{
                sum+=now+Math.abs(10-a[i]);
            }
            now = a[i];
            System.out.println("***** "+sum+" *****");
        }
        // 出力
        System.out.println(sum);
    }
}