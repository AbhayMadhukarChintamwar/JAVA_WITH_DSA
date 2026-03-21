package If_Else;

import java.util.Scanner;

public class TernaryOperator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int o = sc.nextInt();

         int maxValue = m>=n && m>=o ? m:(n>=m && n >=o ? n: o );
        System.out.println(maxValue);

    }
}

