package question12;

/**
 * @author weimin02
 * @date 2018/6/15
 * @project sword_offer
 */
public class Power {
    public double power(double base, int exponent) {
        double ret = 1;
        boolean isNegative = false;
        if (exponent < 0){
            isNegative = true;
            exponent = -exponent;
        }

        while (exponent != 0){
            if (exponent % 2 == 1){
                ret *= base;
            }

            base *= base;
            exponent /= 2;
        }

        ret = isNegative ? 1/ret : ret;

        return ret;
    }
}
