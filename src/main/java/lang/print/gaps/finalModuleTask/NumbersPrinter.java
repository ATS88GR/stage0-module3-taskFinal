package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        boolean isZero = (number & 127) == 0;
        boolean result = (((number >> 31) & 1) == 1) || isZero;
        System.out.println(!result);
    }
}
