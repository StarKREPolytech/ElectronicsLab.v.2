import calculator.JavaCalculator;
import org.junit.Test;

import java.util.Arrays;

public final class Tests {

    @Test
    public final void test(){
        final JavaCalculator calculator = new JavaCalculator(Arrays.asList(6.02), Arrays.asList(13.9e-3));
        calculator.countCoeffList();
        calculator.countDbList(false);
    }
}
