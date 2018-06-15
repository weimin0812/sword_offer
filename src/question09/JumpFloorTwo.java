package question09;

/**
 * @author weimin02
 * @date 2018/6/15
 * @project sword_offer
 */
public class JumpFloorTwo {
    public int jumpFloorII(int target) {
        if (target <= 0){
            return 0;
        }

        return (1 << (target - 1));

    }
}
