package org.example;

public class PowRecursion {

    static int power(int x, int y)
    {
        // Base case: a^0 = 1
        if (b == 0) {
            return 1;
        }
        // Recursive case: a^b = a * a^(b-1)
        return a * power(a, b - 1);

    }
}
