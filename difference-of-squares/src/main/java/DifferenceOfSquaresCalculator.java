class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sqrSum = 0;
        for (int x = 1; x <= input; x++){
            sqrSum += x;
        }
        return (int) Math.pow(sqrSum, 2);
    }

    int computeSumOfSquaresTo(int input) {
        int sqrSum = 0;
        for (int x = 1; x <= input; x++){
            sqrSum += Math.pow(x, 2);
        }
        return sqrSum;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
