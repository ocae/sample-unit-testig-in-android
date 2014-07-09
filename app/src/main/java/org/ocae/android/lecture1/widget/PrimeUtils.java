package org.ocae.android.lecture1.widget;

/**
 * Created by user on 2014/7/9.
 */
public class PrimeUtils {
    public static boolean isPrime(String s) {
        int i;

        try {
            i = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }

//        if (i < 2)
//            return false;

        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0)
                return false;
        }

        return true;
    }
}
