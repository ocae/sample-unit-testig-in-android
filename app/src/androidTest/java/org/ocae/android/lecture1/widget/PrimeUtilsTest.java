package org.ocae.android.lecture1.widget;

import junit.framework.TestCase;

/**
 * Created by user on 2014/7/9.
 */
public class PrimeUtilsTest extends TestCase {
    public void testIsPrime() {
        boolean result;

        result = PrimeUtils.isPrime("2");
        assertTrue(result);

        result = PrimeUtils.isPrime("3");
        assertTrue(result);

        result = PrimeUtils.isPrime("4");
        assertFalse(result);

//        result = PrimeUtils.isPrime("1");
//        assertFalse(result);
    }
}
