import calculator.JavaCalculator;

import java.util.Arrays;
import java.util.List;

public final class Main {

    public static void main(final String[] args) {

        //1.
        final List<Double> inputU1List = Arrays.asList(6.02, 6.00, 5.98, 6.03, 6.04, 6.02, 6.08, 6.02, 5.96, 5.98, 6.02
                , 5.87, 6.00, 6.01, 6.03);
        final List<Double> outputU1List = Arrays.asList(13.9e-3, 27.6e-3, 55.1e-3, 11.1e-2, 20.1e-2, 44.5e-2, 88.4e-2
                , 1.68, 2.95, 4.35, 5.20, 5.34, 5.55, 5.60, 5.61);
        //--------------------------------------------------------------------------------------------------------------

        //2.
        final List<Double> inputU2List = Arrays.asList(5.98, 6.08, 6.07, 6.05, 6.03, 6.02, 6.04, 5.99, 5.97, 5.92, 5.96
                , 6.01, 6.07, 5.92, 6.08);
        final List<Double> outputU2List = Arrays.asList(5.88, 5.85, 5.99, 5.97, 5.94, 5.90, 5.88, 5.65, 5.03, 3.68, 2.24
                , 1.20, 6.01e-1, 2.97e-1, 1.99e-1);
        //--------------------------------------------------------------------------------------------------------------

        //3.
        final List<Double> inputU3List = Arrays.asList(6.11, 5.97, 6.01, 6.09, 6.08, 6.05, 6.06, 6.01, 6.00, 6.01, 5.97
                , 5.94, 5.97, 5.97, 6.09);
        final List<Double> outputU3List = Arrays.asList(14.4e-3, 27.8e-3, 55.4e-3, 11.8e-2, 22.2e-2, 44.2e-2, 82.9e-2
                , 1.39, 1.82, 1.93, 1.60, 1.04, 5.71e-1, 2.93e-1, 1.99e-1);

        //--------------------------------------------------------------------------------------------------------------

        final JavaCalculator calculator = new JavaCalculator(inputU1List, outputU1List);
        calculator.countDbList(false);
        System.out.println();
    }
}
