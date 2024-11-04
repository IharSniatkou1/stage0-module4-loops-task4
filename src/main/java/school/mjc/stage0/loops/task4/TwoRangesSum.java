package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skippedSum = 0;
        int accountedSum = 0;

        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            for (int i = 0; i <= lastInRow; i++) {
                if (i <= numberToSkip) {
                    skippedSum += i; // Add to skippedSum if `i` is less than or equal to `numberToSkip`
                } else {
                    accountedSum += i; // Otherwise, add to accountedSum
                }
            }
            System.out.println("skipped sum is " + skippedSum + "\ncounted sum is " + accountedSum);
        }
    }
}
