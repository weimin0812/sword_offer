package question07;

/**
 * @author weimin02
 * @date 2018/6/15
 * @project sword_offer
 */
public class Fibonacci {
    public int fibonacci(int n) {
        if (n <= 1){
            return n;
        }

        int f = 1;
        int g = 0;
        for (int i = 1; i < n; i++){
            f = f + g;
            g = f - g;
        }

        return f;
    }
}
