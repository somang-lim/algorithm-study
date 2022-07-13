package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1978_소수_찾기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());

            if(isPrime(num)) {
                result++;
            }
        }

        System.out.println(result);
    }

    static boolean isPrime(int num) {
        if(num == 1) return false;

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
