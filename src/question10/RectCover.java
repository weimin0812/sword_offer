package question10;

/**
 * @author weimin02
 * @date 2018/6/15
 * @project sword_offer
 */
public class RectCover {
    public int rectCover(int target) {
        int baseCase = 2;
        if (target <= baseCase){
            return target;
        }

        int f = 2;
        int g = 1;
        for (int i = 2; i < target; i++){
            f = f + g;
            g = f - g;
        }

        return f;
    }
}
