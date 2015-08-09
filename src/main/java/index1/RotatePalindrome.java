package index1;

/**
 * Created by yduan on 1/29/15.
 */
public class RotatePalindrome {
    public boolean isRotationPalindrome(String str) {
        int size = str.length() - 1;
        String newstr = str + str;
        int j = 0;
        for (int i = 0; i <= size; i++) {
            j = i + size;
            if (isPalindrome(newstr.substring(i, j + 1)));
                return true;
        }
        return false;
    }
    private boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
