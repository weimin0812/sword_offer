package question48;

/**
 * @author weimin02
 * @date 2018/6/24
 * @project sword_offer
 */
public class Add {
    public int add(int num1, int num2) {
        int carry = (num1 & num2) << 1;
        int sum = num1 ^ num2;

        while (carry != 0) {
            int t = sum;
            sum = sum ^ carry;
            carry = (t & carry) << 1;
        }

        return sum;
    }
}
