package steps.step1.array;

public class BestTimetoBuyandSellStock {

  public static void main(String[] args) {
    BestTimetoBuyandSellStock solution = new BestTimetoBuyandSellStock();
    int[] array1 = {7, 1, 5, 3, 6, 4};
    int[] array2 = {1, 2, 3, 4, 5};
    int[] array3 = {7, 6, 4, 3, 1};
    System.out.println(solution.maxProfit(array1));
    System.out.println(solution.maxProfit(array2));
    System.out.println(solution.maxProfit(array3));
  }

  public int maxProfit(int[] prices) {
    int step = 1;
    int topProfit = 0;
    while (step < prices.length) {
      int profit = 0;
      int i = 0;
      while (i + step < prices.length) {
        if (prices[i] < prices[i + step]) {
          profit += prices[i + step] - prices[i];
        }
        i += step;
      }
      if (profit > topProfit) {
        topProfit = profit;
      }
      ++step;
    }
    return topProfit;
  }
}