package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int thousands = number / 1000;
        int hundreds = number % 1000 / 100;
        int tens = number % 1000 % 100 / 10;
        int ones = number % 1000 % 100 % 10;
        int sumDigits = thousands + hundreds + tens + ones;
        System.out.println(sumDigits);
    }
}
