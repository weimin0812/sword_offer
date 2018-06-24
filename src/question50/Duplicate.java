package question50;

/**
 * @author weimin02
 * @date 2018/6/24
 * @project sword_offer
 */
public class Duplicate {
    public static boolean duplicate(int[] numbers, int length, int[] duplication) {
        if (numbers == null || numbers.length == 0 || numbers.length != length){
            return false;
        }

        for (int i = 0; i < numbers.length; i++) {
            int index = numbers[i] < 0 ? numbers[i] + numbers.length : numbers[i];
            if (numbers[index] < 0){
                duplication[0] = index;
                return true;
            }

            numbers[index] = numbers[index] - length;
        }

        return false;

    }

    public static void main(String[] args) {
        int[] numbers = {2,1,3,1,4};
        int[] duplictaion = new int[1];

        boolean ret = duplicate(numbers, numbers.length, duplictaion);
        System.out.println(ret + " duplication: " + duplictaion[0]);
    }
}
