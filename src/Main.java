public class Main {
    int maxPolindrome = 0;
    int firstMultiplierOfMaxPolindrome = 0;
    int secondMultiplierOfMaxPolindrome = 0;

    /*
    ** Finding maximum polindrom of 2 numbers
    * MAX_SOME_DIGIT_NUMBER - upper border of range of values
    * MIN_SOME_DIGIT_NUMBER - bottom border of range of values
    *
     */
    public void doWork(int MAX_SOME_DIGIT_NUMBER, int MIN_SOME_DIGIT_NUMBER) {
        for (int firstMultiplier = MAX_SOME_DIGIT_NUMBER; firstMultiplier >= MIN_SOME_DIGIT_NUMBER; firstMultiplier--) {
            for (int secondMultiplier = firstMultiplier; secondMultiplier >= MIN_SOME_DIGIT_NUMBER; secondMultiplier--) {
                if (isPolindrome(firstMultiplier * secondMultiplier)) {
                    isMaxPolindrome(firstMultiplier, secondMultiplier);
                }
            }
        }
    }

    /**
     * Determines whether the test number is the maximum palindrome
     */
    public boolean isPolindrome(int testDigit) {
        int[] testArray = intToArray(testDigit);
        for (int i = 0; i < (testArray.length) / 2; i++) {
            if (testArray[i] != testArray[testArray.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Format int to int Array
     */
    public int[] intToArray(int intToArray) {
        int[] myArray = new int[Integer.valueOf(intToArray).toString().length()];
        int i = myArray.length - 1;

        do {
            myArray[i] = intToArray % 10;
            intToArray /= 10;
            i--;
        } while (intToArray != 0);

        return myArray;
    }

    /**
     * Calculates maximum palindrome.
     */
    public void isMaxPolindrome(int firstMultiplier, int secondMultiplier) {
        int polindrome = firstMultiplier * secondMultiplier;
        if (polindrome > maxPolindrome) {
            maxPolindrome = polindrome;
            firstMultiplierOfMaxPolindrome = firstMultiplier;
            secondMultiplierOfMaxPolindrome = secondMultiplier;
        }
    }

    public int getMaxPolindrome() {
        return maxPolindrome;
    }

    public void setMaxPolindrome(int maxPolindrome) {
        this.maxPolindrome = maxPolindrome;
    }

    public int getFirstMultiplierOfMaxPolindrome() {
        return firstMultiplierOfMaxPolindrome;
    }

    public void setFirstMultiplierOfMaxPolindrome(int firstMultiplierOfMaxPolindrome) {
        this.firstMultiplierOfMaxPolindrome = firstMultiplierOfMaxPolindrome;
    }

    public int getSecondMultiplierOfMaxPolindrome() {
        return secondMultiplierOfMaxPolindrome;
    }

    public void setSecondMultiplierOfMaxPolindrome(int secondMultiplierOfMaxPolindrome) {
        this.secondMultiplierOfMaxPolindrome = secondMultiplierOfMaxPolindrome;
    }
}

