package question08;

/**
 * @author weimin02
 * @date 2018/6/15
 * @project sword_offer
 */
public class JumpFloor {

    public int jumpFloor(int target) {
        int baseCase = 2;
        if (target <= baseCase) {
            return target;
        }

        int f = 2;
        int g = 1;
        for (int i = 2; i < target; i++) {
            f = g + f;
            g = f - g;
        }

        return f;
    }
}
