import java.util.Arrays;

public class SalesManager {

    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long[] sales2 = sales.clone();
        Arrays.sort(sales2);
        long min = sales2[0];
        return min;
    }

    public long indexMax() {
        long indMax = 0;
        long maxVal = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (maxVal < sales[i]) {
                maxVal = sales[i];
                indMax = i + 1;
            }
        }
        return indMax;
    }

    public long indexMin() {
        long indMin = 0;
        long minVal = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (minVal > sales[i]) {
                minVal = sales[i];
                indMin = i + 1;
            }
        }
        return indMin;
    }

    public long average(long[] sales, long minInd, long maxInd) {
        long result = 0;
        long[] newSales = new long[sales.length - 1];
        long minInd2 = minInd - 1;
        for (int i = 0; i < newSales.length; i++) {
            if (i != minInd2) {
                int newRes = i < minInd2 ? i : i - 1;
                newSales[newRes] = sales[i];
            }
        }

        long[] newSales2 = new long[newSales.length - 1];
        long maxInd2 = maxInd - 1;
        for (int i = 0; i < newSales2.length; i++) {
            if (i != maxInd2) {
                int newRes = i < maxInd2 ? i : i - 1;
                newSales2[newRes] = newSales[i];
            }
        }

        long sum = 0;
        for (int a = 0; a < newSales2.length; a++) {
            sum += newSales2[a];
        }
        result = sum / newSales2.length;

        return result;
    }
}
