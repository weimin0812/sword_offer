package question53;

/**
 * @author weimin02
 * @date 2018/6/24
 * @project sword_offer
 */
public class IsNumeric {
    public boolean isNumeric(char[] str) {
        if (str == null || str.length == 0) {
            return false;
        }

        String num = new String(str).toLowerCase();
        int eIndex = num.indexOf('e');
        if (eIndex < 0) {
            return isFloat(num);
        } else{
            return isFloat(num.substring(0, eIndex)) && isInt(num.substring(eIndex+1));
        }
    }

    private boolean isInt(String num){
        if (num == null || num.length() == 0){
            return false;
        }

        if(!Character.isDigit(num.charAt(0))){
            if (!(num.charAt(0) == '+' || num.charAt(0) == '-')){
                return false;
            }
        }

        for (int i = 1; i < num.length(); i++) {
            if (!Character.isDigit(num.charAt(i))){
                return false;
            }
        }

        return true;
    }

    private boolean isFloat(String num){
        if (num == null || num.length() == 0){
            return false;
        }

        if(!Character.isDigit(num.charAt(0))){
            if (!(num.charAt(0) == '+' || num.charAt(0) == '-')){
                return false;
            }
        }

        int dot = 0;
        for (int i = 1; i < num.length(); i++) {
            if (!Character.isDigit(num.charAt(i))){
                if (num.charAt(i) == '.'){
                    dot++;
                    if (dot > 1){
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }

        return true;

    }

}
