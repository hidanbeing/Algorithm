import java.util.*;

class Solution {
    static boolean[] used;
    static Set<Integer> primeSet = new HashSet<>();

    public int solution(String numbers) {
        used = new boolean[numbers.length()];

        // 길이 1부터 n까지 모든 순열 생성
        for (int len = 1; len <= numbers.length(); len++) {
            makePerm(numbers, "", len);
        }

        return primeSet.size();   // ★ 소수 개수 반환
    }

    static void makePerm(String s, String cur, int targetLen) {
        if (cur.length() == targetLen) {
            int num = Integer.parseInt(cur);
            if (isPrime(num)) {
                primeSet.add(num);   // 중복 자동 제거
            }
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!used[i]) {
                used[i] = true;
                makePerm(s, cur + s.charAt(i), targetLen);
                used[i] = false;
            }
        }
    }

    static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
