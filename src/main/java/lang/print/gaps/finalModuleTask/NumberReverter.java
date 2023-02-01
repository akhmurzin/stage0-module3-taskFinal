package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int hundreds = number / 100; //4
        int tens = number % 100 / 10; //8
        int ones = number % 100 % 10; //9
        int revertedNumber = ones * 100 + tens * 10 + hundreds;
        System.out.println(revertedNumber);
    }
}
