package index1;

/**
 * Created by yduan on 2/12/15.
 */
public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.print(convertToTitle(702));
    }
    public static String convertToTitle(int n) {
        if (n <= 0) return "";
        String ans = "";
        while (n > 0) {

            ans = (char)('A' + ((n - 1)% 26)) + ans;
            n = (n - 1) / 26;
        }
        return ans;
    }

    String convertToTitle2(int n) {
        StringBuffer str = new StringBuffer();
        while(n != 0){
            int r = n % 26;
            n= n / 26;
            if(r == 0){   //为26的整数倍，该位设置为Z，n减8
                str.insert(0, 'Z');
                n--;
            }
            else{
                str.insert(0, (char)('A'+r-1));
            }
        }
        return str.toString();
    }
}
