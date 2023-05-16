package uma.sahmyook.function;

import java.text.DecimalFormat;

public class DividendCalculator {

    public double calculateDividend(int top3Count, int firstCount, int totalGames) {
        double dividendRate = ((totalGames * 1000.0) / (top3Count * 0.5 + firstCount * 0.2 + 1)) / 1000.0;
        DecimalFormat df = new DecimalFormat("#.###");
        return Double.parseDouble(df.format(dividendRate));
    }
    // 소수점 3째자리까지 나오게 반올림하여 숫자로 만들기

}