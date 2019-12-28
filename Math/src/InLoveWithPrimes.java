import java.util.Scanner;

public class InLoveWithPrimes {
    public static void main(String[] args) {
        boolean[] arr = new boolean[1000001];
        arr[0] = true;
        arr[1] = true;

        for (int i = 0; i < Math.sqrt(1000001); i++) {
            if (!arr[i]) {
                int j = i * 2;
                while (j < 1000001) {
                    arr[j] = true;
                    j += i;
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            boolean deepa = false;
            int num = sc.nextInt();
            for (int i = 2; i < num; i++) {
//                System.out.println(i + " " + (num - i));
                if (!arr[i] && !arr[num - i]) {
                    deepa = true;
                    break;
                }
            }
            if (deepa)
                System.out.println("Deepa");
            else
                System.out.println("Arjit");
        }
    }
}
