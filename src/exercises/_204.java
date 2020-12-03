package exercises;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _204 {

    public static void main(String[] args) {
    }

    public int countPrimes(int n) {
        int count = 0;

        if (n > 2) {
            count++;
        }
        boolean[] notPrime = new boolean[n];
        for (int i = 3; i < n; i += 2) {
            if (!notPrime[i]) {
                if (i < Math.sqrt(n)) {
                    for (int j = i; i * j < n; j += 2) {
                        notPrime[i * j] = true;
                    }
                }
                count++;
            }
        }
        return count;
    }


    @Test
    public void test() {
        assertEquals(countPrimes(10), 4);
    }
}
