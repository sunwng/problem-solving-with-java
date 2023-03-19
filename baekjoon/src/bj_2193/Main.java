package bj_2193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        long[] dp = new long[size];
        if (size <= 2) {
            System.out.println(1);
            return;
        }
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < size; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[size-1]);
    }
}
