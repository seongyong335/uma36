package uma.sahmyook.function;

public class DividendCalculator {
    public double calculateDividend(int top3Count, int firstCount, int totalGames) {
        // 배당률 계산 로직을 구현합니다.
        double dividendRate = (totalGames /1.0) / (top3Count * 0.5 + firstCount * 0.2 + 1) ;
        return dividendRate;
    }
}
