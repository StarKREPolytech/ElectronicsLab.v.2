package calculator;

import java.util.List;

public final class JavaCalculator {

    private List<Double> inputUList;
    private List<Double> outputUList;

    public JavaCalculator(final List<Double> inputUList, final List<Double> outputUList){
        this.inputUList = inputUList;
        this.outputUList = outputUList;
    }

    public final void showList(final List<Double> list){
        list.forEach(e -> {
            String result = e + "";
            System.out.println(result);
        });
    }

    public final void countDbList(final boolean graphicMode){
        int start = 16;
        for (int i = 0; i < this.inputUList.size(); i++) {
            final double coeff = countCoeff(this.inputUList.get(i), this.outputUList.get(i));
            final double db = countDb(coeff);
            if (graphicMode) {
                System.out.println("(" + start+ ";" + db + ")");
            } else {
                final String result = "" + db;
                System.out.println(result.substring(0, 8));
            }
            start *= 2;
        }
    }

    public final void countCoeffList(){
        int start = 16;
        for (int i = 0; i < this.inputUList.size(); i++){
            final double coeff = countCoeff(this.inputUList.get(i), this.outputUList.get(i));
            final String result = coeff + "";
            System.out.println(result.substring(0, 6));
            start *= 2;
        }
    }

    public final double countSimpleErr(final double theory, final double experimental){
        return (theory - experimental) / theory * 100;
    }

    public final double countBiErr(final double err1, final double err2){
        return Math.sqrt(Math.pow(err1, 2) + Math.pow(err2, 2));
    }

    public final double countCornerCoeff(final double x2, final double x1, final double y2, final double y1){
        return (y2 -y1) / (x2 - x1);
    }

    public final void buildLinearFoo(final Double start){
        double value = start;
        int counter = 4;
        for (int i = 0; i < 10; i++){
            System.out.println(value + " " + counter);
            value += 6;
            counter *= 2;
        }
    }

    private double countCoeff(final double inputU, final double outputU){
        return outputU / inputU;
    }

    private double countDb(final double countCoeff){
        return 20 * Math.log10(countCoeff);
    }
}