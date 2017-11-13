import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    private final int VALID_DIGIT = 12345;

    @Test
    public void intToArray() throws Exception {
        Main test = new Main();
        int[] expectedArray = {1, 2, 3, 4, 5};
        int[] actualArray = test.intToArray(VALID_DIGIT);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void isPolindrome() throws Exception {
        Main test = new Main();
        int polyndrome = 12321;
        int notPolyndrome = 12345;
        Assert.assertTrue(test.isPolindrome(polyndrome));
        Assert.assertFalse(test.isPolindrome(notPolyndrome));
    }

    @Test
    public void isMaxPolindrome() throws Exception {
        Main test = new Main();
        test.maxPolindrome = 1234321;
        test.isMaxPolindrome(21516, 99807);
        Assert.assertEquals(2147447412, test.maxPolindrome);
        test.maxPolindrome = 123454321;
        Assert.assertEquals(123454321, test.maxPolindrome);
    }

    @Test
    public void doWorkTestMax5DigitsNumbers() throws Exception {
        int MAX_5_DIGIT_NUMBER = 99999;
        int MIN_5_DIGIT_NUMBER = 10000;

        Main test = new Main();
        test.doWork(MAX_5_DIGIT_NUMBER, MIN_5_DIGIT_NUMBER);
        Assert.assertEquals(2147447412, test.getMaxPolindrome());
        Assert.assertEquals(99807, test.getFirstMultiplierOfMaxPolindrome());
        Assert.assertEquals(21516, test.getSecondMultiplierOfMaxPolindrome());

        System.out.println(test.getMaxPolindrome());
        System.out.println(test.getFirstMultiplierOfMaxPolindrome());
        System.out.println(test.getSecondMultiplierOfMaxPolindrome());
    }

    @Test
    public void doWorkTestMax3DigitsNumbers() throws Exception {
        int MAX_3_DIGIT_NUMBER = 999;
        int MIN_3_DIGIT_NUMBER = 100;
        Main test = new Main();
        test.doWork(MAX_3_DIGIT_NUMBER, MIN_3_DIGIT_NUMBER);
        Assert.assertEquals(906609, test.getMaxPolindrome());
        Assert.assertEquals(993, test.getFirstMultiplierOfMaxPolindrome());
        Assert.assertEquals(913, test.getSecondMultiplierOfMaxPolindrome());

        System.out.println(test.getMaxPolindrome());
        System.out.println(test.getFirstMultiplierOfMaxPolindrome());
        System.out.println(test.getSecondMultiplierOfMaxPolindrome());
    }
}